package miu.edu.inclassdemojune.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Review {

    private int id;
    private String comment;
    private int numberOfStars;
}
