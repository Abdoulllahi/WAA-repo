package edu.miu.lab2.service;

import edu.miu.lab2.domain.Poster;
import edu.miu.lab2.dto.output.UserDto;

import java.util.List;

public interface UserService {

    public void save(Poster poster);
    public UserDto getById(int id);

    public List<UserDto> findAll();

    public void deleteById(int id);
}
