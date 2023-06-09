package miu.edu.lab1.repository;

import miu.edu.lab1.domain.Post;

import java.util.List;

public interface PostRepo {

    public List<Post> findAll();

    public void save(Post post);

    public Post getById(long id);

    public Post delete(long id);

    public Post update(Post updatedPost);


}
