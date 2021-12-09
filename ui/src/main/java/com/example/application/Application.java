package com.example.application;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import com.example.application.data.HelloService;

/**
 * The entry point of the Spring Boot application.
 *
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 *
 */
@SpringBootApplication(scanBasePackages = "com.example.application")
@Theme(value = "generator-test")
@PWA(name = "generator-test", shortName = "generator-test", offlineResources = {"images/logo.png"})
public class Application extends SpringBootServletInitializer implements AppShellConfigurator {

    private HelloService myService;

    public Application(HelloService myService) {
        this.myService = myService;
        new HelloService();
        System.out.println(myService.sayHello());
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
