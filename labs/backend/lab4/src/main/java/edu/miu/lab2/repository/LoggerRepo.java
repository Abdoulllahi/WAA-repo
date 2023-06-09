package edu.miu.lab2.repository;

import edu.miu.lab2.domain.Logger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggerRepo extends JpaRepository<Logger, Long> {
}
