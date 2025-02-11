package com.jayant.SpringEcomMvc.repo;

import com.jayant.SpringEcomMvc.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {


    // In query we specify the jpql language not the sql language
}
