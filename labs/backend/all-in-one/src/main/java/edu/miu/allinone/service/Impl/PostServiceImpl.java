package edu.miu.allinone.service.Impl;

import edu.miu.allinone.dto.output.PostDto;
import edu.miu.allinone.entity.Post;
import edu.miu.allinone.helper.ListMapper;
import edu.miu.allinone.repository.PostRepo;
import edu.miu.allinone.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    PostRepo postRepo;
    ListMapper listMapper;
    ModelMapper modelMapper;

    @Autowired
    public void setPostRepo(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    @Autowired
    public void setListMapper(ListMapper listMapper) {
        this.listMapper = listMapper;
    }

    @Autowired
    public void setModelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    @Override
    public void save(Post post) {
        postRepo.save(post);
    }

    @Override
    public List<PostDto> findAll() {
        return listMapper.mapList(postRepo.findAll(), new PostDto());
    }

    @Override
    public PostDto getById(long id) {
        return modelMapper.map(postRepo.getById(id), PostDto.class);
    }

    @Override
    public PostDto deleteById(long id) {
        return modelMapper.map(postRepo.deleteById(id), PostDto.class);
    }

    @Override
    public Post update(Post updatedPost) {
        return postRepo.update(updatedPost);
    }

    @Override
    public List<PostDto> findByAuthor(String author) {
        return listMapper.mapList(postRepo.findByAuthor(author), new PostDto());
    }
}
