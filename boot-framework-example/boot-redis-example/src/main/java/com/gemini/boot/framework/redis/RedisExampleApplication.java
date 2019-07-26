package com.gemini.boot.framework.redis;

import com.gemini.cloud.framework.core.CoreApplication;
import com.gemini.cloud.framework.core.exception.CloudCoreException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.gemini.boot.framework")
@SpringBootApplication
public class RedisExampleApplication {
    public static void main(String[] args) throws CloudCoreException {
        CoreApplication.run(RedisExampleApplication.class, args);
    }
}
