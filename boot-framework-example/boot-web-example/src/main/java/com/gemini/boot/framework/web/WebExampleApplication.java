package com.gemini.boot.framework.web;

import com.gemini.boot.framework.core.CoreApplication;
import com.gemini.boot.framework.core.exception.CloudCoreException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.gemini.boot.framework")
@SpringBootApplication
public class WebExampleApplication {
    public static void main(String[] args) throws CloudCoreException {
        CoreApplication.run(WebExampleApplication.class, args);
    }
}
