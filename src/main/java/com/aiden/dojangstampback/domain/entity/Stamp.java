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
@Table(name = "stamp")
@Entity
public class Stamp {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stamp_id")
    @Id
    private Long id;

    @Column(name = "model_name", unique = true, nullable = false, length = 50)
    private String modelName;

    @Column(nullable = false)
    private BigDecimal width;

    @Column(nullable = false)
    private BigDecimal height;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime modifiedAt;

    @Builder
    public Stamp(String modelName, BigDecimal width, BigDecimal height) {
        this.modelName = modelName;
        this.width = width;
        this.height = height;
        this.createdAt = LocalDateTime.now();
        this.modifiedAt = LocalDateTime.now();
    }

}
