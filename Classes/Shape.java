package Classes;

import Annotation.ProbeAnnotation;

import java.lang.reflect.Method;

public class Shape {

    @ProbeAnnotation
    private static void methodsOnScreen(Class clazz, String s0) {
        System.out.print('\n' + s0 + '\n');
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(ProbeAnnotation.class)) {
                System.out.print('*');
            }

            System.out.println(m.toString());
        }
    }

    public static void getHierarchy(Object o) throws ClassNotFoundException {
        Class clazz = o.getClass();
        String s0 = clazz.getSimpleName();
        while (!s0.equals("Object")) {
            methodsOnScreen(clazz, s0);
            clazz = clazz.getSuperclass();
            s0 = clazz.getSimpleName();
        }

        methodsOnScreen(clazz, s0);
    }

    public String toString() {
        return "Shape";
    }
}
