package com.prandogabriel.shortener.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;

@Getter
@Setter
@Builder(toBuilder = true)
public class CreateShortenedUrlDTO {
        private String name;
        private String url;
        private String createBy;

}
