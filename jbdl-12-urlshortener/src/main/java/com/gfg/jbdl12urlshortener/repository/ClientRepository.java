package com.gfg.jbdl12urlshortener.repository;

import com.gfg.jbdl12urlshortener.entity.ClientConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<ClientConfiguration,Long> {
    Optional<ClientConfiguration> findByHostName(String name);

}
