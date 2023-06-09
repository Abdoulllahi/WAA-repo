package edu.miu.lab2.service.impl;

import edu.miu.lab2.domain.Comment;
import edu.miu.lab2.repository.CommentRepo;
import edu.miu.lab2.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepo commentRepo;

    @Override
    public void save(Comment comment) {
        commentRepo.save(comment);
    }
}
