package workWithHierarchy;

import annotation.ProbeAnnotation;

import java.lang.reflect.Method;

public class Hierarchy {

    private static void methodsOnScreen(Class clazz) {
        System.out.print('\n' + clazz.getSimpleName() + '\n');
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(ProbeAnnotation.class)) {
                System.out.print('*');
            }

            System.out.println(method.toString());
        }
    }

    public static void getHierarchy(Object o) throws ClassNotFoundException {
        Class clazz = o.getClass();
        while (!clazz.getSimpleName().equals("Object")) {
            methodsOnScreen(clazz);
            clazz = clazz.getSuperclass();
        }

        methodsOnScreen(clazz);
    }
}
