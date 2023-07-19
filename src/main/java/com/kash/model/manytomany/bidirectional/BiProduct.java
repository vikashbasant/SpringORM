package com.kash.model.manytomany.bidirectional;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "bi_product")
public class BiProduct {

    @Id
    private String pId;
    private String productName;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<BiCategory> biCategories;
}
