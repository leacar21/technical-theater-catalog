package com.leacar21.technical.theater.catalog.config;

import static org.zalando.logbook.Conditions.exclude;
import static org.zalando.logbook.Conditions.requestTo;

import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.BodyFilter;
import org.zalando.logbook.BodyFilters;
import org.zalando.logbook.Logbook;
import org.zalando.logbook.json.JsonBodyFilters;

@Configuration
public class MainConfig {

    @Bean
    public Logbook logbook() {

        // Para esconder el valor de algunos atributos
        var customBodyFilter = BodyFilter.merge(BodyFilters.defaultValue(),
                JsonBodyFilters.replaceJsonStringProperty(Set.of("password", "pass", "secret"), "XXX"));

        // Para excluir algunos path
        return Logbook.builder().bodyFilter(customBodyFilter) //
                .condition(exclude( //
                        requestTo("/health"), //
                        requestTo("/admin/**"))) //
                .build(); //
    }

}
