package com.kash.model.onetoone.bidirectionalmapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "bi_student")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BiStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;
    private String about;

    @OneToOne(mappedBy = "biStudent", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private BiLaptop laptop;

    @Override
    public String toString() {
        return "BiStudent{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", about='" + about + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
