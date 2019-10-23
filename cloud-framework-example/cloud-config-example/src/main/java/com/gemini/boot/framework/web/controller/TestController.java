package com.gemini.boot.framework.web.controller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.gemini.boot.framework.web.entity.Message;
import com.gemini.boot.framework.web.entity.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
    @Value("${cloud.id:default}")
    private String cloudId;

    @Value("${cloud.name:default}")
    private String cloudName;

    @GetMapping("/test")
    public Message test() {
        Test test = new Test();
        test.setCloudId(cloudId);
        test.setCloudName(cloudName);
        return Message.success(test);
    }


    @ApolloConfig
    private Config config; //inject config for namespace application

    @GetMapping("/test1")
    public Message test1(){
        Config config = ConfigService.getAppConfig(); //config instance is singleton for each namespace and is never null
        String someKey = "cloud.id";
        String someDefaultValue = "test";
        String value = config.getProperty(someKey, someDefaultValue);
        return Message.success(value);
    }

}
