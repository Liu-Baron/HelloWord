package annotation;

import java.lang.reflect.Method;


/**
 * Created by 82595 on 2017/7/7.
 */
public class Utils {


    private Utils() {
    }

    private static Utils utils;

    public static Utils getInstance() {
        if (utils == null) {
            synchronized (Utils.class) {
                if (utils == null) {
                    utils = new Utils();
                }
            }
        }
        return utils;
    }

    public void injectTest1(Object obj) {
        Class a = obj.getClass();
        Method[] methods = a.getDeclaredMethods();
        Method mMethod = null;
        String methodName = "";
        for (Method method : methods) {
            if (method.isAnnotationPresent(HelloWord.class)) {
                HelloWord helloWord = method.getAnnotation(HelloWord.class);
                EventBase eventBase = helloWord.annotationType().getAnnotation(EventBase.class);
                methodName = eventBase.methodName();
            }
        }
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                mMethod = method;
            }
        }
        for (Method method : methods) {
//            System.out.println(method.getName() + "   -----  " + method.isAnnotationPresent(HelloWord.class));
            if (method.isAnnotationPresent(HelloWord.class)) {
                HelloWord helloWord = method.getAnnotation(HelloWord.class);
                String str = helloWord.value();
                try {
                    if (mMethod != null) {
                        mMethod.invoke(obj, str);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
