package org.pg.${artifactId}.infrastructure.spring.config

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("org.pg.${artifactId}.infrastructure.entity")
@EnableJpaRepositories("org.pg.${artifactId}.infrastructure.repository")
@ComponentScan("org.pg.${artifactId}.infrastructure")
public class InfrastructureModuleConfiguration {

}