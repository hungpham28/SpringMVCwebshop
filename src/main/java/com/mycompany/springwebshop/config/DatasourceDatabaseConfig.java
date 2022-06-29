/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.config;

import javax.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;



/**
 *
 * @author Admin
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.mycompany.springwebshop.repository")
@EnableTransactionManagement
@PropertySource("classpath:datasource-config.properties")
public class DatasourceDatabaseConfig {
    @Autowired
    private Environment env;
    @Bean
    DataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/springNew?createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=false");
        System.out.println(env.getProperty("ds.username"));
        System.out.println(env.getProperty("ds.password"));
        System.out.println(env.getProperty("ds.url"));
        System.out.println(env.getProperty("ds.database-driver"));
        dataSource.setUsername("root");
        dataSource.setPassword("hung28092003");
        return dataSource;
    }
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource){
        LocalContainerEntityManagerFactoryBean entityManager= new LocalContainerEntityManagerFactoryBean();
        entityManager.setDataSource( dataSource);
        entityManager.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManager.setPackagesToScan("com.mycompany.springwebshop.entity");
        
        Properties jpaProperties=new Properties();
        jpaProperties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5InnoDBDialect");
        jpaProperties.setProperty("hibernate.hbm2ddl.auto", "update");
        jpaProperties.setProperty("hibernate.show_sql", "false");
        jpaProperties.setProperty("hibernate.format_sql", "true");
        entityManager.setJpaProperties(jpaProperties);
        return entityManager;
    }
    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
        JpaTransactionManager jpaTransactionManager=new JpaTransactionManager();
        jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
        return jpaTransactionManager;
    }
    
}
