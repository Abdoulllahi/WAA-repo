package edu.miu.lab2.dto.output;

import lombok.Data;

@Data
public class PostDto {

    int id;
    String title;
    String content;
    String author;
}
