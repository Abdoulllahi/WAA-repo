package edu.miu.lab2.service;


import edu.miu.lab2.domain.Post;
import edu.miu.lab2.dto.output.PostDto;

import java.util.List;

public interface PostService {

    public void save(Post post);

    public PostDto getById(int id);

    public List<PostDto> findAll();

public void deleteById(int id);
//
//    public PostDto update(Post updatedPost);
}
