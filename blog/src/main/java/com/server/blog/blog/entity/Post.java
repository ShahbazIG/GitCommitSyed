package com.server.blog.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="posts")
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PostId")
    private Long PostId;

    @Column(name="title",nullable = false, unique = true)
    private String title;

    @Column(name="description",nullable = false, unique = true)
    private String description;

    @Column(name="content",nullable = false, unique = true)
    private String content;
}
