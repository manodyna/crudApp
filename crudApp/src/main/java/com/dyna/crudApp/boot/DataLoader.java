package com.dyna.crudApp.boot;

import com.dyna.crudApp.model.Product;
import com.dyna.crudApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        try {
            Product product1 = new Product();
            product1.setName("Milky Bar");
            product1.setType("CANDIES");
            product1.setCategory("BARS");
            product1.setPrice(100.00);

            productRepository.save(product1);

            Product product2 = new Product();
            product2.setName("Almond Bar");
            product2.setType("CANDIES");
            product2.setCategory("BARS");
            product2.setPrice(150.00);

            productRepository.save(product2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}