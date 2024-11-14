package com.aiden.dojangstampback.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "stamps", uniqueConstraints = {
        @UniqueConstraint(
                columnNames = {"model_name"}
        )
})
@Entity
public class Stamp {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "model_name", nullable = false, length = 50)
    private String modelName;

    @Column(nullable = false)
    private BigDecimal width;

    @Column(nullable = false)
    private BigDecimal height;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Builder
    public Stamp(String modelName, BigDecimal width, BigDecimal height, BigDecimal price) {
        this.modelName = modelName;
        this.width = width;
        this.height = height;
        this.price = price;
        this.createdAt = LocalDateTime.now();
    }

}
