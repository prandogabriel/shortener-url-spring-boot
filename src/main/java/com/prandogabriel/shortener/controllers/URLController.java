package com.prandogabriel.shortener.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prandogabriel.shortener.entities.ShortenedUrlEntity;
import com.prandogabriel.shortener.dto.CreateShortenedUrlDTO;
import com.prandogabriel.shortener.repositories.ShortenedUrlRepository;

import java.util.Date;

@RestController
@RequestMapping(value = "/")
public class URLController {

    private ShortenedUrlRepository shortenedUrlRepository;

    public URLController(ShortenedUrlRepository shortenedUrlRepository) {
        this.shortenedUrlRepository = shortenedUrlRepository;
    }

    @GetMapping()
    public String hello() {
        return "hello";
    }

    @PostMapping
    public ShortenedUrlEntity shortener(@RequestBody CreateShortenedUrlDTO body ) {
        ShortenedUrlEntity shortenedUrl = ShortenedUrlEntity
                .builder()
                .id("a")
                .name(body.getName())
                .originalURL(body.getUrl())
                .recoveriesCount(0)
                .createBy(body.getCreateBy())
                .createDate(new Date())
                .build();
        this.shortenedUrlRepository.save(shortenedUrl);

        return shortenedUrl;

    }
}

