package com.aiden.dojangstampback.domain.mapper;

import com.aiden.dojangstampback.domain.entity.Order;
import com.aiden.dojangstampback.domain.dto.OrderDto;
import org.springframework.stereotype.Component;

@Component
public class OrderDtoMapper {

    public static OrderDto mapToDto(Order order) {
        return new OrderDto(
                order.getId(),
                order.getCreatedAt(),
                order.getContent(),
                order.getQuantity(),
                order.getMemo(),
                order.getStatus(),
                StampDtoMapper.mapToDto(order.getStamp())
        );
    }

}
