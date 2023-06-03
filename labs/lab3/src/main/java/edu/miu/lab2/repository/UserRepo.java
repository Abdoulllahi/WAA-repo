package edu.miu.lab2.repository;

import edu.miu.lab2.domain.Poster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo  extends JpaRepository<Poster, Integer> {

    @Query("SELECT u FROM Poster u WHERE size(u.posts) > :postCount")
    List<Poster> findUsersWithMorePostsThan(int postCount);
}
