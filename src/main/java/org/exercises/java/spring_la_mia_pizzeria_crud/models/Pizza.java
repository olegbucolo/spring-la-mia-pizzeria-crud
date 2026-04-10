package org.exercises.java.spring_la_mia_pizzeria_crud.models;

import java.math.BigDecimal;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "pizzas")
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(max = 100, message = "La lunghezza deve essere minore di 100 lettere")
    @Column(nullable = false, length = 100)
    private String name;

    @NotBlank
    @Size(max = 250, message = "La lunghezza deve essere minore di 250 lettere")
    @Column(nullable = false, length = 250)
    private String description;

    @Size(max = 500)
    private String imageUrl;

    @NotNull
    @DecimalMin(value = "0.01", inclusive = true, message = "il prezzo deve essere maggiore di 0")
    @Column(nullable = false, precision = 10, scale = 2)
    @Digits(integer = 8, fraction = 2)
    private BigDecimal price;

    public Pizza() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
