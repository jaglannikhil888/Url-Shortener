package com.gfg.jbdl12urlshortener.repository;

import com.gfg.jbdl12urlshortener.entity.LongUrl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LongUrlRepository extends CrudRepository<LongUrl,Long> {
}
