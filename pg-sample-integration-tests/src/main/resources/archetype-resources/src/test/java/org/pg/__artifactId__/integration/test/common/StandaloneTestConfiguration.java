package org.pg.${artifactId}.integration.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import org.pg.${artifactId}.infrastructure.spring.InfrastructureSpringModuleConfiguration;

@Configuration
@Import({
        InfrastructureSpringModuleConfiguration.class
})
public class StandaloneTestConfiguration {

}
