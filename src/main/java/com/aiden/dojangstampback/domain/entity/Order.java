package com.aiden.dojangstampback.domain.entity;

import com.aiden.dojangstampback.domain.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "orders")
@Entity
public class Order {

    @Id
    private Long id;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private String memo;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @OneToOne
    @JoinColumn(name = "stamp_id", referencedColumnName = "id", nullable = false)
    private Stamp stamp;

}
