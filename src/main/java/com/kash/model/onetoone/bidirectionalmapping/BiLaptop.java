package com.kash.model.onetoone.bidirectionalmapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name ="bi_laptop")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class BiLaptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int laptopId;
    private String modelName;
    private String brand;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "studentId")
    private BiStudent biStudent;


    @Override
    public String toString() {
        return "BiLaptop{" +
                "laptopId=" + laptopId +
                ", modelName='" + modelName + '\'' +
                ", brand='" + brand + '\'' +
                ", biStudent=" + biStudent +
                '}';
    }
}
