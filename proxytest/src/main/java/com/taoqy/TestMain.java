package com.taoqy;

import com.taoqy.cglibproxy.Personc;
import com.taoqy.cglibproxy.PersoncProxy;
import com.taoqy.jdkproxy.Human;
import com.taoqy.jdkproxy.Person;
import com.taoqy.jdkproxy.PersonProxy;

import java.lang.reflect.Proxy;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author Taoqy
 * @version 1.0, 2021/3/12
 * @see [相关类/方法]
 * @since bapfopm-pfpsmas-cbfsms-service 1.0
 */
public class TestMain {

    public static void main(String[] args) {
//        PersonProxy personProxy = new PersonProxy();
//        Person person = new Person();
//
//        Human o = (Human) Proxy.newProxyInstance(Person.class.getClassLoader(), Person.class.getInterfaces(), new PersonProxy());
////        Human o = (Human) personProxy.newProxyObject(new Person());
//        String string = o.eat("苹果");
//        System.out.println(string);
//        o.think();

        PersoncProxy personcProxy = new PersoncProxy();
        Personc o = (Personc) personcProxy.newProxyObject(new Personc());

        String str = o.eat("香蕉");
        System.out.println(str);
        o.think();
    }
}
