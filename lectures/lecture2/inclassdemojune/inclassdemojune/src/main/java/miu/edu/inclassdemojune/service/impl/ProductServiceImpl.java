package miu.edu.inclassdemojune.service.impl;

import miu.edu.inclassdemojune.domain.Product;
import miu.edu.inclassdemojune.dto.response.ProductDto;
import miu.edu.inclassdemojune.repo.ProductRepo;
import miu.edu.inclassdemojune.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public ProductDto getById(int id) {
        return modelMapper.map(productRepo.getById(id), ProductDto.class);
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }
}
