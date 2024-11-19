package com.aiden.dojangstampback.domain.dto;


import com.aiden.dojangstampback.domain.enums.OrderStatus;

import java.time.LocalDateTime;

public record OrderDto(
        Long id,
        LocalDateTime orderDate,
        LocalDateTime createdAt,
        LocalDateTime modifiedAt,
        String content,
        Integer quantity,
        String memo,
        OrderStatus status,
        StampDto stamp
) {
}
