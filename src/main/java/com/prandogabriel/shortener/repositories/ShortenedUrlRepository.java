package com.prandogabriel.shortener.repositories;

import com.prandogabriel.shortener.entities.ShortenedUrlEntity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortenedUrlRepository extends MongoRepository<ShortenedUrlEntity, String> {
}
