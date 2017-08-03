import annotation.Utils;

import java.lang.reflect.Proxy;

/**
 * Created by 82595 on 2017/7/7.
 */
public class MyTest1 {
    public static void main(String[] args) {
        PersonDao pDao = new PersonDaoImpl();
        PersonHandler handler = new PersonHandler(pDao);
        PersonDao proxy = (PersonDao) Proxy.newProxyInstance(pDao.getClass().getClassLoader(), pDao.getClass().getInterfaces(), handler);
//        proxy.say("不知道");
//        proxy.say2("不知道22");
        PersonDaoImpl obj = new PersonDaoImpl();
        Utils.getInstance().injectTest1(obj);
    }
}

