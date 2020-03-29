package com.sophia.WebCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.sophia.WebCrawler.content.ScrapedRepository;

public class WebCrawlerService {
    @Value("${target}")
    private String target;

    @Value("${initialUri}")
    private String initialUri;

    @Autowired
    private ScrapedRepository scrapedRepository;

    public void crawl() throws Exception {
        read(initialUri);
    }

    public void read(String uri) throws Exception {
        URL url = new URL(uri);

        if (scrapedRepository.findByUri(uri) != null) {
            return;
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains(target)) {
                scrapedRepository.insertUri(uri); // insert target too, as target might change, so index uri_target
                break;
            }
            //TODO find urls in page and add to Redis Queue
        }
    }
}
