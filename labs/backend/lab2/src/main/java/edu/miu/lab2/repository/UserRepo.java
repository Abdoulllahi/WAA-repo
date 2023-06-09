package edu.miu.lab2.repository;

import edu.miu.lab2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<User, Integer> {
}
