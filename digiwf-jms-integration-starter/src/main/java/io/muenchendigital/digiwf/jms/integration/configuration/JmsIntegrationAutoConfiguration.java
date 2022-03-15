package io.muenchendigital.digiwf.jms.integration.configuration;

import io.muenchendigital.digiwf.jms.integration.properties.JmsIntegrationProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@RequiredArgsConstructor
@ComponentScan(basePackages = "io.muenchendigital.digiwf.jms.integration")
@EnableConfigurationProperties(JmsIntegrationProperties.class)
public class JmsIntegrationAutoConfiguration {

    public final JmsIntegrationProperties jmsIntegrationProperties;
}
