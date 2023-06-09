package edu.miu.allinone.service;

import edu.miu.allinone.dto.output.PostDto;
import edu.miu.allinone.entity.Post;

import java.util.List;

public interface PostService {

    public void save(Post post);
    public List<PostDto> findAll();
    public PostDto getById(long id);
    public PostDto deleteById(long id);
    public Post update(Post updatedPost);
    public List<PostDto> findByAuthor(String author);
}
