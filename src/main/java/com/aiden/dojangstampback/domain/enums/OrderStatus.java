package com.aiden.dojangstampback.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OrderStatus {

    PENDING(""),
    COMPLETED(""),
    DELIVERED(""),
    PAID("");

    private final String description;

}
