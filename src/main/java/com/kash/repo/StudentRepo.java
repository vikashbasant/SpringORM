package com.kash.repo;

import com.kash.model.onetoone.bidirectionalmapping.BiStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<BiStudent, Integer> {
}
