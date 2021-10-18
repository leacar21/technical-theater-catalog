package com.leacar21.technical.theater.catalog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.leacar21.technical.theater.catalog.controllers.TheaterCatalogController;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {

    @Bean
    public Docket api() {
        var docket = new Docket(DocumentationType.SWAGGER_2);
        return docket.select()
                     .apis(RequestHandlerSelectors.any())
                     .paths(PathSelectors.ant("/" + TheaterCatalogController.THEATERS_RESOURCE))
                     .build();
    }
}
