package com.prandogabriel.shortener.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "shortened_urls")
@Getter
@Setter
@Builder(toBuilder = true)
public class ShortenedUrlEntity {

    @Id private String id;
    private String name;
    private String originalURL;
    private Integer recoveriesCount;
    private String createBy;
    private Date createDate;
    private Date updateDate;
}
