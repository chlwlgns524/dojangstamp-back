package com.aiden.dojangstampback.domain.dto;

import java.math.BigDecimal;

public record StampDto(
        Long id,
        String modelName,
        BigDecimal width,
        BigDecimal height,
        BigDecimal price
) {
}
