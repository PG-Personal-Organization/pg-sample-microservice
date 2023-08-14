package org.pg.${artifactId}.infrastructure.spring

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import org.pg.lib.cqrs.config.CommandQueryAutoConfiguration;

@Configuration
@ComponentScan
@Import({
        ApplicationModuleConfiguration.class,
        CommandQueryAutoConfiguration.class,
        InfrastructureModuleConfiguration.class,
        SwaggerConfiguration.class,

})
public class InfrastructureSpringModuleConfiguration {

}