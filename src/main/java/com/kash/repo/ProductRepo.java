package com.kash.repo;

import com.kash.model.manytomany.bidirectional.BiProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<BiProduct, String> {
}
