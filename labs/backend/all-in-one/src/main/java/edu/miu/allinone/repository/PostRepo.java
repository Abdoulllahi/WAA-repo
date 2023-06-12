package edu.miu.allinone.repository;

import edu.miu.allinone.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Long>{

    public List<Post> findAllByAuthor(String author);
}
