package com.kash.repo;

import com.kash.model.onetomany.bidirectional.BiOTMStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentOTMRepo extends JpaRepository<BiOTMStudent, Integer> {
}
