package com.tracebucket.x.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author ffazil
 * @since 07/08/15
 */
@Configuration
@ComponentScan(basePackages = {"com.tracebucket.x.product.service.impl"})
public class ServiceConfiguration {
}
