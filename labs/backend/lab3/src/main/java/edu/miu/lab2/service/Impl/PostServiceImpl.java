package edu.miu.lab2.service.Impl;


import edu.miu.lab2.domain.Post;
import edu.miu.lab2.dto.output.PostDto;
import edu.miu.lab2.helper.ListMapper;
import edu.miu.lab2.repository.PostRepo;
import edu.miu.lab2.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {


    @Autowired
    ListMapper listMapper;

    @Autowired
    PostRepo postRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void save(Post post) {
        postRepo.save(post);
    }

    @Override
    public PostDto getById(int id) {
        return modelMapper.map(postRepo.getById(id), PostDto.class);
    }

    @Override
    public List<PostDto> findAll() {
        return listMapper.mapList(postRepo.findAll(), new PostDto());
    }

    @Override
    public void deleteById(int id) {
        postRepo.deleteById(id);
    }
    
}
