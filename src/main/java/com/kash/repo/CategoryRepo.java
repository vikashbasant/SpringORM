package com.kash.repo;

import com.kash.model.manytomany.bidirectional.BiCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<BiCategory, String> {
}
