package edu.miu.lab2.dto.output;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {

    long id;
    String name;
    List<PostDto> postDtos;
}
