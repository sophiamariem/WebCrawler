package com.sophia.WebCrawler.content;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ScrapedRepository extends JpaRepository<Scraped, Long> {

    String findByUri(String uri);

    @Modifying
    @Query(value = "insert into Scraped (uri) values (:uri)", nativeQuery = true)
    void insertUri(@Param("uri") String uri);
}
