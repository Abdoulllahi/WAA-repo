package miu.edu.inclassdemojune.controller;


import miu.edu.inclassdemojune.domain.Product;
import miu.edu.inclassdemojune.dto.response.ProductDto;
import miu.edu.inclassdemojune.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public ProductDto findById(@PathVariable("id") int id) {
        return productService.getById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody Product product) {
        productService.save(product);
    }

}
