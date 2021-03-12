package com.taoqy.cglibproxy;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author Taoqy
 * @version 1.0, 2021/3/12
 * @see [相关类/方法]
 * @since bapfopm-pfpsmas-cbfsms-service 1.0
 */
public class PersoncProxy implements MethodInterceptor {

    private Object object;

    public Object newProxyObject(Object obj){
        object = obj;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());

        enhancer.setCallback(this);

        Object o = enhancer.create();
        return o;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("先闻闻");

        Object re = null;

        re = method.invoke(object, objects);
        return re;

    }
}
