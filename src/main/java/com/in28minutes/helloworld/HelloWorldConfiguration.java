package com.in28minutes.helloworld;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Dain";
    }

    @Bean
    public int age(){
        return 20;
    }

    @Bean
    public String sex(){
        return "Male";
    }

    @Bean
    public String contury(){
        return "Korea";
    }

    @Bean(name = "kim")
    public Person person(){
        var person = new Person("kim", 21);

        return person;
    }

    //메소드 호출로 객체를 만들어보자.
    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age());
    }

    //파라미터 호출로 객체를 만들어보자.
    @Bean
    public Person person3Parameters(@Qualifier("name") String name, int age){ //name, age
        return new Person(name, age);
    }
}
