/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import com.mycompany.springwebshop.component.SessionBean;

/**
 *
 * @author Admin
 */
@Configuration
public class SpringBean {
    @Bean
    @SessionScope
    public SessionBean sessionBean() {
    	return new SessionBean();
    }

}
