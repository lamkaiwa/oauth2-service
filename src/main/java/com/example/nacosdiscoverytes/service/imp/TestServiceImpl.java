package com.example.nacosdiscoverytes.service.imp;

import com.example.nacosdiscoverytes.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@RefreshScope
public class TestServiceImpl implements TestService {
    @Value("${name}")
    private String name;

    private final ApplicationContext applicationContext;
    @Override
    public void showInfo() {
        System.out.println(name);
        //When configurations are refreshed dynamically, they will be updated in the Enviroment, therefore here we retrieve configurations from Environment every other second.
        String userName = applicationContext.getEnvironment().getProperty("name");
        System.out.println("userName:"+userName);
    }
}
