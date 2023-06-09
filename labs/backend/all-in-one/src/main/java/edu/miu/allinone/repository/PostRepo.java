package edu.miu.allinone.repository;

import edu.miu.allinone.entity.Post;

import java.util.List;

public interface PostRepo {

    public void save(Post post);
    public List<Post> findAll();
    public Post getById(long id);
    public Post deleteById(long id);
    public Post update(Post updatedPost);

    public List<Post> findByAuthor(String author);
}
