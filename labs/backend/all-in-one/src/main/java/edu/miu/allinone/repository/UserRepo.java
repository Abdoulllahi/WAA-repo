package edu.miu.allinone.repository;

import edu.miu.allinone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByName(String name);
}
