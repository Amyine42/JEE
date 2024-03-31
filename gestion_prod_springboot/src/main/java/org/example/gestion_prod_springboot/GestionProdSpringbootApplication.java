package org.example.gestion_prod_springboot;

import org.example.gestion_prod_springboot.entities.Product;
import org.example.gestion_prod_springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class GestionProdSpringbootApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(GestionProdSpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(null,"Computer",4300,3));
        productRepository.save(new Product(null,"Printer",1200,4));
        productRepository.save(new Product(null,"Smartphone",3200,32));

        List<Product> products = productRepository.findAll();
        products.forEach(p->{
            System.out.println(p.toString());
        });

        System.out.println("Avec la méthode findByNameContains pour C:");

        List<Product> productList = productRepository.findByNameContains("C");
        productList.forEach(p->{
            System.out.println(p);
        });

        System.out.println("Avec la méthode search pour C:");

        List<Product> productList2 = productRepository.search("%C%");
        productList2.forEach(System.out::println);
    }
}
