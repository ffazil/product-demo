package com.tracebucket.x.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author ffazil
 * @since 07/08/15
 */
@Configuration
@ImportResource(value = "classpath:cache-config.xml")
@ComponentScan(basePackages = {"com.tracebucket.x.product.util"})
public class CacheConfiguration {


}
