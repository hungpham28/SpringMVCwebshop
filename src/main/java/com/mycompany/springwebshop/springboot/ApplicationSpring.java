/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.springboot;

import com.mycompany.springwebshop.config.DatasourceDatabaseConfig;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
        List<String> myList = new ArrayList<String>();
        // Adding elements to the List
        // Custom inputs
        myList.add("Nguyen");
        myList.add("Hung");
        myList.add("Huhu");
        myList.add("Haha");
        
        ListIterator<String> iterator = myList.listIterator();
        while(iterator.hasNext()) {
          String i = iterator.next();
          if(i== "Huhu") {
            iterator.set(i+"45");;
          }
        }
        System.out.println(myList);
      }
}
