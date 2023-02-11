package com.alipour;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author Paniz Alipour
 */
public class HumanDecorator implements MethodInterceptor {


    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Slow");
        Object retVal = invocation.proceed();
        System.out.println("!");
        return retVal;
    }
}
