package org.example.gestion_prod_springboot.repository;

import org.example.gestion_prod_springboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findByNameContains(String mc);
    @Query(value="select p from Product p where p.name  like:x")
    List<Product> search(@Param("x") String x);
}
