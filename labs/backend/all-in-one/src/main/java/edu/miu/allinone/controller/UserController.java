package edu.miu.allinone.controller;

import edu.miu.allinone.aspect.annotation.ExecutionTime;
import edu.miu.allinone.dto.output.UserDto;
import edu.miu.allinone.entity.User;
import edu.miu.allinone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @ExecutionTime
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("{id}")
    public UserDto findById(@PathVariable("id") long id) {
        return userService.getById(id);
    }

    @ExecutionTime
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @ExecutionTime
    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") long id) {
        userService.deleteById(id);
    }

    @ExecutionTime
    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") long id, @RequestBody User userToUpdate) {
        userToUpdate.setId(id);
        User updatedUser = userService.update(userToUpdate);
        if (updatedUser != null) {
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}