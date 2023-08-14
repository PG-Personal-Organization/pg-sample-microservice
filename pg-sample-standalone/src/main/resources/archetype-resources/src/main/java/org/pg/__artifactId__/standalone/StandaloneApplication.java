package org.pg.${artifactId}.standalone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import org.pg.${artifactId}.infrastructure.spring.InfrastructureSpringModuleConfiguration;

@SpringBootApplication
@Import({
        InfrastructureSpringModuleConfiguration.class
})
public class StandaloneApplication
{
    public static void main(String[] args) {
        SpringApplication.run(StandaloneApplication.class, args);
    }
}
