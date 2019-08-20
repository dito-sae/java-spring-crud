package com.trycode.springcrud.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@Entity @Data
@Table(name = "products")
public class Product {
    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @NotNull @NotEmpty
    @Size(max = 255)
    @Column(unique = true)
    private String sku;

    @NotNull @NotEmpty
    @Size(max = 255)
    private String name;

    @NotNull
    private int qty;

    @NotNull
    private BigDecimal price;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @NotNull
    private int status;
}
