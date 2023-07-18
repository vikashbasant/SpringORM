package com.kash.model.onetomany.bidirectional;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "bi_otm_Student")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BiOTMStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;
    private String about;

    @OneToMany(mappedBy = "biOTMStudent", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<BiOTMAddress> addresses;
}
