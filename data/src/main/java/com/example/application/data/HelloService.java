package com.example.application.data;

import org.springframework.stereotype.Service;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.fusion.Endpoint;

@Service
@Endpoint
@AnonymousAllowed
public class HelloService {
    public String sayHello() {
        return "Hello from endpoint in another module!!!";
    }
}
