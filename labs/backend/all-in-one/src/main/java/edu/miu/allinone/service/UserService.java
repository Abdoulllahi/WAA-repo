package edu.miu.allinone.service;

import edu.miu.allinone.dto.output.UserDto;
import edu.miu.allinone.entity.User;

import java.util.List;

public interface UserService {

    public void save(User user);
    public List<UserDto> findAll();
    public UserDto getById(long id);
    public void deleteById(long id);
    public User update(User updatedUser);
}
