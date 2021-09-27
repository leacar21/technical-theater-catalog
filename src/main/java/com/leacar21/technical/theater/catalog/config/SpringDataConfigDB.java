package com.leacar21.technical.theater.catalog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = { "com.leacar21.technical.theater.catalog.persistence.dao.repository" })
@EnableTransactionManagement
@EnableJpaAuditing
public class SpringDataConfigDB {

}