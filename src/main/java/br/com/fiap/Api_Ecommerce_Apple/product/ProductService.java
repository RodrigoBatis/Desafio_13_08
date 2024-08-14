package br.com.fiap.Api_Ecommerce_Apple.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;
    public List<Product> finAll(){return repository.findAll();}
}
