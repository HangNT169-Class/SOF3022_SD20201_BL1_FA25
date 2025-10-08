package com.sof3022.sd20201.B10_JPA.service;

import com.sof3022.sd20201.B10_JPA.entity.Product;
import com.sof3022.sd20201.B10_JPA.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product>getAll(){
        return productRepository.findAll();
    }

}
