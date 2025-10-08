package com.sof3022.sd20201.B10_JPA.repository;

import com.sof3022.sd20201.B10_JPA.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
