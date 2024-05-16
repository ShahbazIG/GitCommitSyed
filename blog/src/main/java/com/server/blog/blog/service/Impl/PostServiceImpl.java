package com.server.blog.blog.service.Impl;

import com.server.blog.blog.entity.Post;
import com.server.blog.blog.payload.PostDto;
import com.server.blog.blog.repository.PostRepository;
import com.server.blog.blog.service.PostService;
import org.springframework.stereotype.Service;


@Service
public class PostServiceImpl implements PostService {


    public PostServiceImpl(PostRepository postRepository) {

        this.postRepository = postRepository;
    }

    private PostRepository postRepository;
    @Override
    public PostDto savePost(PostDto postDto) {
        Post post = mapToEntity(postDto);
        Post savedPost = postRepository.save(post);
        PostDto dto = mapToDto(savedPost);

        return null;
    }
    Post mapToEntity(PostDto postDto){

        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        return post;

    }
    PostDto mapToDto(Post post) {

        PostDto postDto = new PostDto();
        postDto.setPostId(String.valueOf(post.getPostId()));
        postDto.setTitle(post.getTitle());
        postDto.setDescription(post.getDescription());
        postDto.setContent(post.getContent());
        return postDto;
    }

}
