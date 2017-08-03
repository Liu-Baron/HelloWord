import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by 82595 on 2017/7/7.
 */
public class PersonHandler implements InvocationHandler {

    private Object object;

    public PersonHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//        System.out.println("methodname : " + method.getName());
//        System.out.println("args.length ; " + args.length + "");
        System.out.println("before");
        Object result = method.invoke(object, args);
        System.out.println("after");
        return result;
    }
}
