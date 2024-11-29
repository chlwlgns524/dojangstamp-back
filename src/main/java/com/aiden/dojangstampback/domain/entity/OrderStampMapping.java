package com.aiden.dojangstampback.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "order_stamp_mapping")
@Entity
@IdClass(OrderStampMapping.OrderStampMappingId.class)
public class OrderStampMapping {

    @JoinColumn(name = "order_id", nullable = false)
    @ManyToOne
    @Id
    private Order order;

    @JoinColumn(name = "stamp_id", nullable = false)
    @ManyToOne
    @Id
    private Stamp stamp;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private String content;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "modified_at", nullable = false)
    private LocalDateTime modifiedAt;

    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderStampMappingId implements Serializable {

        private Long order;
        private Long stamp;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            OrderStampMappingId that = (OrderStampMappingId) o;
            return Objects.equals(this.order, that.order) &&
                    Objects.equals(this.stamp, that.stamp);
        }

        @Override
        public int hashCode() {
            return Objects.hash(order, stamp);
        }
    }

}
