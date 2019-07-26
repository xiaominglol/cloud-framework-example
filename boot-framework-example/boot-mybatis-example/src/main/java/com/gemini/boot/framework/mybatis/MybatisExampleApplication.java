package com.gemini.boot.framework.mybatis;

import com.gemini.cloud.framework.core.CoreApplication;
import com.gemini.cloud.framework.core.exception.CloudCoreException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.gemini.boot.framework")
@SpringBootApplication
public class MybatisExampleApplication {
    public static void main(String[] args) throws CloudCoreException {
        CoreApplication.run(MybatisExampleApplication.class, args);
    }
}
