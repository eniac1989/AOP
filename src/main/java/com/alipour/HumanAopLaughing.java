package com.alipour;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @author Paniz Alipour
 */
public class HumanAopLaughing {

    public static void main(String[] args) {
        Human humanTarget = new Human();

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(new HumanDecorator());
        proxyFactory.setTarget(humanTarget);

        Human humanProxy = (Human) proxyFactory.getProxy();
        humanProxy.laughing();
    }
}
