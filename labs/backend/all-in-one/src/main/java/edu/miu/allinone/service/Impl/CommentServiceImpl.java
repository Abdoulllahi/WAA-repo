package edu.miu.allinone.service.Impl;

import edu.miu.allinone.entity.Comment;
import edu.miu.allinone.repository.CommentRepo;
import edu.miu.allinone.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepo commentRepo;

    @Autowired
    public CommentServiceImpl(CommentRepo commentRepo) {
        this.commentRepo = commentRepo;
    }

    @Override
    public void save(Comment comment) {
        commentRepo.save(comment);
    }
}
