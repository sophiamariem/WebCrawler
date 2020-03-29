package com.sophia.WebCrawler.content;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scraped", schema = "public")
public class Scraped implements Serializable {
    private static final long serialVersionUID = -1152779434213289790L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String uri;

    protected Scraped() {
    }

    public Long getId() {
        return id;
    }

    public String getUri() {
        return uri;
    }
}
