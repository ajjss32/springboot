package com.example.springboot.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TB_PRODUCTS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idProduct")
public class ProductModel implements Serializable {
    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct;
    private String name;
    private BigDecimal value;


}
