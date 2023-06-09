package edu.miu.lab2.service.Impl;

import edu.miu.lab2.domain.Logger;
import edu.miu.lab2.repository.LoggerRepo;
import edu.miu.lab2.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggerServiceImpl implements LoggerService {

    private final LoggerRepo loggerRepo;

    @Autowired
    public LoggerServiceImpl(LoggerRepo loggerRepo) {
        this.loggerRepo = loggerRepo;
    }

    @Override
    public void saveLogger(Logger logger) {
        loggerRepo.save(logger);
    }
}
