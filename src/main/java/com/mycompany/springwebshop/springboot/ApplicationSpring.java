/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.springboot;

import com.mycompany.springwebshop.config.DatasourceDatabaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import org.springframework.core.env.Environment;

/**
 *
 * @author Admin
 */
//@PropertySource("classpath:datasource-config.properties")
public class ApplicationSpring {
//    private static Environment env;
    public static void main(String[] args) {
//        System.out.println(context.getBean("homePage"));
//            System.out.println(env.getProperty("hibernate.dialect"));
            ApplicationContext context = new AnnotationConfigApplicationContext(DatasourceDatabaseConfig.class);
    }
}
