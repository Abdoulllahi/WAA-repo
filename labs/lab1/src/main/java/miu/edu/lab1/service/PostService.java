package miu.edu.lab1.service;

import miu.edu.lab1.domain.Post;
import miu.edu.lab1.dto.response.PostDto;

import java.util.List;

public interface PostService {

    public void save(Post post);

    public PostDto getById(long id);

    public List<PostDto> findAll();

    public PostDto delete(long id);

    public PostDto update(Post updatedPost);
}
