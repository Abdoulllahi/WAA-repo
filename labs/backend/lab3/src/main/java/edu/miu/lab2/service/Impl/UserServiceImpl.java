package edu.miu.lab2.service.Impl;

import edu.miu.lab2.domain.Poster;
import edu.miu.lab2.dto.output.UserDto;
import edu.miu.lab2.helper.ListMapper;
import edu.miu.lab2.repository.UserRepo;
import edu.miu.lab2.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    ListMapper listMapper;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    UserRepo userRepo;

    @Override
    public void save(Poster poster) {
        userRepo.save(poster);
    }

    @Override
    public UserDto getById(int id) {
        return modelMapper.map(userRepo.getById(id), UserDto.class);
    }

    @Override
    public List<UserDto> findAll() {
        List<Poster> posters = userRepo.findAll();
        return listMapper.mapList(posters, new UserDto());
    }

    @Override
    public void deleteById(int id) {
        userRepo.deleteById(id);
    }
}
