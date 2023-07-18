package com.kash.model.onetoone.unidirectionalmapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name ="uni_laptop")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class UniLaptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int laptopId;
    private String modelName;
    private String brand;
}
