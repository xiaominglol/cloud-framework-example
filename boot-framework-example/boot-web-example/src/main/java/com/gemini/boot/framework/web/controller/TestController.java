package com.gemini.boot.framework.web.controller;

import com.gemini.boot.framework.web.entity.Test;
import com.gemini.boot.framework.web.mvc.model.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${cloud.id}")
    private String cloudId;

    @Value("${cloud.name}")
    private String cloudName;

    @GetMapping("/test")
    public Message test() {
        Test test = new Test();
        test.setCloudId(cloudId);
        test.setCloudName(cloudName);
        return Message.success(test);
    }
}
