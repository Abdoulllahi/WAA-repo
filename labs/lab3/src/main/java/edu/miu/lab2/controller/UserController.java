package edu.miu.lab2.controller;

import edu.miu.lab2.domain.Poster;
import edu.miu.lab2.dto.output.UserDto;
import edu.miu.lab2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<UserDto> findAll() {
        System.out.println("Test");
        return userService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("{id}")
    public UserDto getById(@PathVariable("id") int id) {
        return userService.getById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody Poster poster) {
        userService.save(poster);
    }


}
