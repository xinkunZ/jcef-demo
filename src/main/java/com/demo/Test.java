package com.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author zhangxinkun
 */
@SpringBootApplication
public class Test {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Test.class).headless(false).run(args);
    }

}
