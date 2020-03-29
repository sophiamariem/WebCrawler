package com.sophia.WebCrawler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.sophia.WebCrawler.content")
@Configuration
public class WebCrawlerConfiguration {

    @Bean
    WebCrawlerService webCrawlerService() {
        WebCrawlerService webCrawlerService = new WebCrawlerService();
        return webCrawlerService;
    }
}
