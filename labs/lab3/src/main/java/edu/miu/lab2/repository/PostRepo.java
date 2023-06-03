package edu.miu.lab2.repository;


import edu.miu.lab2.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PostRepo extends JpaRepository<Post,Integer> {

    List<Post> findByTitle(String title);

}
