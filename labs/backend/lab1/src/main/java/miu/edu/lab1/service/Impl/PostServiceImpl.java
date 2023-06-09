package miu.edu.lab1.service.Impl;

import miu.edu.lab1.domain.Post;
import miu.edu.lab1.dto.response.PostDto;
import miu.edu.lab1.helper.ListMapper;
import miu.edu.lab1.repository.PostRepo;
import miu.edu.lab1.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.server.RemoteRef;
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
    public PostDto getById(long id) {
        return modelMapper.map(postRepo.getById(id), PostDto.class);
    }

    @Override
    public List<PostDto> findAll() {
        return listMapper.mapList(postRepo.findAll(), new PostDto());
    }

    @Override
    public PostDto delete(long id) {
        return modelMapper.map(postRepo.delete(id), PostDto.class);
    }

    @Override
    public PostDto update(Post updatedPost) {
        return modelMapper.map(postRepo.update(updatedPost), PostDto.class);
    }
}
