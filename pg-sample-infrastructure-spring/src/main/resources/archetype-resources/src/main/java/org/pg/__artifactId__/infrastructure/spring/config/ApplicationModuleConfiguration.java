package org.pg.${artifactId}.infrastructure.spring.config

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.pg.${artifactId}.application.cqrs")
public class ApplicationModuleConfiguration {

}