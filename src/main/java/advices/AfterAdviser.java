package advices;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdviser implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {

        System.out.println("Additional concern after returning advice");
    }
}
