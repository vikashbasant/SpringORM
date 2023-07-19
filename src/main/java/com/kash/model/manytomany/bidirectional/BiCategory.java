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
@Table(name = "bi_category")
public class BiCategory {

    @Id
    private String cId;
    private String title;

    @ManyToMany(mappedBy = "biCategories", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<BiProduct> biProducts;
}
