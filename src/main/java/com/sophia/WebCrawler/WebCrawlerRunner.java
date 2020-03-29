package com.sophia.WebCrawler;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class WebCrawlerRunner implements CommandLineRunner {
    private final WebCrawlerService webCrawlerService;

    public WebCrawlerRunner(WebCrawlerService webCrawlerService) {
        this.webCrawlerService = webCrawlerService;
    }

    @Override
    public void run(String... args) throws Exception {
        webCrawlerService.crawl();
    }
}
