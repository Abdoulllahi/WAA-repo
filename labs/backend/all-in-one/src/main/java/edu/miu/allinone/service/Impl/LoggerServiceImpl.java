package edu.miu.allinone.service.Impl;

import edu.miu.allinone.entity.Logger;
import edu.miu.allinone.repository.LoggerRepo;
import edu.miu.allinone.service.LoggerService;
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
