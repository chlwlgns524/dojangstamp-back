package com.aiden.dojangstampback.domain.entity;

import com.aiden.dojangstampback.domain.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
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

    @Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "modified_at", nullable = false)
    private LocalDateTime modifiedAt;

    @Builder
    public Order(String content, Integer quantity, String memo, OrderStatus status, Stamp stamp) {
        this.content = content;
        this.quantity = quantity;
        this.memo = memo;
        this.status = status;
        this.stamp = stamp;
        this.createdAt = LocalDateTime.now();
    }

}
