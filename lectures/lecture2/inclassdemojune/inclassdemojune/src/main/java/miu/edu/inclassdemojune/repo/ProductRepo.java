package miu.edu.inclassdemojune.repo;

import miu.edu.inclassdemojune.domain.Product;
import miu.edu.inclassdemojune.domain.Review;

import java.util.List;

public interface ProductRepo {

    public List<Product> findAll();

    public Product getById(int id);

    public void save(Product p);

    public void delete(int id);

    public void update(int id, Product p);


    public Review getReviewByProductId(int pId, int reviewId);

    List<Product>findAllPriceGreaterThan(int price);
}
