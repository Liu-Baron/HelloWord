package annotation;

import java.lang.annotation.*;

/**
 * Created by 82595 on 2017/7/7.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@EventBase(methodName = "say2")
public @interface HelloWord {
    String value() default "你好，世界！";
}
