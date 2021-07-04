package com.gfg.jbdl12urlshortener.manager;

import com.gfg.jbdl12urlshortener.model.UrlCreationRequest;

public interface UrlShortenerManager {
    String createLongUrl(UrlCreationRequest urlCreationRequest);
    String getLongUrl(String encryptedId) throws Exception;
}
