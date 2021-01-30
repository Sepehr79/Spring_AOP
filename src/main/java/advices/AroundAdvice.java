package advices;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// around advice
public class AroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Around advice: before");
        Object obj = methodInvocation.proceed();
        System.out.println("Around advice: after");
        return obj;
    }
}
