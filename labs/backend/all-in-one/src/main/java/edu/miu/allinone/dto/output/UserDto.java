package edu.miu.allinone.dto.output;

import edu.miu.allinone.entity.Post;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {

    long id;
    String name;
    List<Post> posts;
}
