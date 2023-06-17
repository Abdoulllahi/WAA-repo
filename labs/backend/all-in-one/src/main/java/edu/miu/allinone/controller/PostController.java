package edu.miu.allinone.controller;

import edu.miu.allinone.aspect.annotation.ExecutionTime;
import edu.miu.allinone.dto.output.PostDto;
import edu.miu.allinone.entity.Comment;
import edu.miu.allinone.entity.Post;
import edu.miu.allinone.service.PostService;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/posts")
public class PostController {

    @Autowired
    PostService postService;

    @Autowired
    ModelMapper modelMapper;

    @ExecutionTime
    @GetMapping
    public List<PostDto> findAll() {
        return postService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("{id}")
    public PostDto findById(@PathVariable("id") long id) {
        return postService.getById(id);
    }

    @GetMapping(params = "author")
    public ResponseEntity<List<PostDto>> findByAuthor(@RequestParam("author") String author) {
        List<PostDto> postsByAuthor = postService.findByAuthor(author);
        if (postsByAuthor != null) {
            return ResponseEntity.ok(postsByAuthor);
        } return ResponseEntity.noContent().build();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody Post post) {
        postService.save(post);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") long id) {
        postService.deleteById(id);
    }

    @PutMapping("{id}")
    public ResponseEntity<Post> updatePost(@PathVariable("id") long id, @RequestBody Post updatedPost) {

        updatedPost.setId(id);
        Post updated = postService.update(updatedPost);
        if (updated != null) {
            return ResponseEntity.ok(updated);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
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
