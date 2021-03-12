package com.taoqy.jdkproxy;



import java.lang.reflect.InvocationHandler;
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
public class PersonProxy implements InvocationHandler {

    public Object objectInstance;

//    public Object newProxyObject(Object obj){
//        this.objectInstance = obj;
//        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),this);
//
//    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("先闻闻");
        Person person = new Person();
        Object re = null;

        re = method.invoke(person, args);
        return re;
    }
}
