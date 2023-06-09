package edu.miu.lab2.controller;


import edu.miu.lab2.domain.Comment;
import edu.miu.lab2.domain.Post;
import edu.miu.lab2.dto.output.PostDto;
import edu.miu.lab2.service.PostService;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/posts")
public class PostController {

    @Autowired
    PostService postService;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping
    public List<PostDto> findAll() {
        return postService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("{id}")
    public PostDto getById(@PathVariable("id") int id) {
        return postService.getById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody Post post) {
        postService.save(post);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") int id) {
        postService.deleteById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("{id}")
    public void update(@PathVariable("id") int id, @RequestBody PostDto postDto) {
        PostDto existingPost = postService.getById(id);

        if (existingPost == null) {
            throw new EntityNotFoundException("Post not found with ID: " + id);
        }
        existingPost.setAuthor(postDto.getAuthor());
        existingPost.setContent(postDto.getContent());
        existingPost.setTitle(postDto.getTitle());

        postService.save(modelMapper.map(existingPost, Post.class));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("{id}/comments")
    public void addCommentToPost(@PathVariable("id") int id, @RequestBody Comment comment) {
        PostDto postDto = postService.getById(id);
        if (postDto == null) {
            throw new EntityNotFoundException("Post not found with ID: " + id);
        }

        Post post = modelMapper.map(postDto, Post.class);
        comment.setPost(post);
        post.getComments().add(comment);
        postService.save(post);
    }


}
