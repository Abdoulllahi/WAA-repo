package edu.miu.allinone.service.Impl;

import edu.miu.allinone.dto.output.UserDto;
import edu.miu.allinone.entity.User;
import edu.miu.allinone.helper.ListMapper;
import edu.miu.allinone.repository.UserRepo;
import edu.miu.allinone.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepo userRepo;
    ListMapper listMapper;
    ModelMapper modelMapper;

    @Autowired
    public void setPostRepo(UserRepo userRepo) {
        this.userRepo = userRepo;
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
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public List<UserDto> findAll() {
        return listMapper.mapList(userRepo.findAll(), new UserDto());
    }

    @Override
    public UserDto getById(long id) {
        return modelMapper.map(userRepo.getReferenceById((int) id), UserDto.class);
    }

    @Override
    public void deleteById(long id) {
        userRepo.deleteById((int) id);
    }

    @Override
    public User update(User updatedUser) {
        return userRepo.save(updatedUser);
    }
}
