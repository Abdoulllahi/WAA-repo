package miu.edu.inclassdemojune.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int id;
    private String name;
    private String category;
    private int starCount;
    private double price;
    List<Review> reviews;

    public Product(int id, String name, double price, List<Review> reviews) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.reviews = reviews;
    }
}
