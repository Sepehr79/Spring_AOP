package advices;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("additional concern before actual logic");
        /*System.out.println(method.getName());

        System.out.println("Arg info");
        for (Object arg: args)
            System.out.println(arg);

        System.out.println(target.getClass().getSimpleName());*/
    }
}
