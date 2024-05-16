package com.server.blog.blog.payload;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

    private String PostId;
    @Column(name="title",nullable = false, unique = true)
    private String title;

    @Column(name="description",nullable = false, unique = true)
    private String description;

    @Column(name="content",nullable = false, unique = true)
    private String content;
}
