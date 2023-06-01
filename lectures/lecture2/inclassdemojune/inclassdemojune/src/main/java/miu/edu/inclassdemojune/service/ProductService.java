package miu.edu.inclassdemojune.service;

import miu.edu.inclassdemojune.domain.Product;
import miu.edu.inclassdemojune.dto.response.ProductDto;

import java.util.List;

public interface ProductService {

    public List<Product> findAll();
    ProductDto getById(int id);
    public void save(Product product);
}
