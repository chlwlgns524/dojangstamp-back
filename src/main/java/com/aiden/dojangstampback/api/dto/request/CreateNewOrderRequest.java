package com.aiden.dojangstampback.api.dto.request;

import java.time.LocalDateTime;

public record CreateNewOrderRequest(
        LocalDateTime orderDate,
        Integer stampId,
        String content,
        Integer quantity,
        String memo
) {
}
