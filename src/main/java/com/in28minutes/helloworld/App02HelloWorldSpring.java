package com.in28minutes.helloworld;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1. Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2. Configure the things that we want spring to manage - @configuration

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("sex"));
        System.out.println(context.getBean("contury"));

        System.out.println(context.getBean("kim"));

        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}