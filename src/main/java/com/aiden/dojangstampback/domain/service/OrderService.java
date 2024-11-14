package com.aiden.dojangstampback.domain.service;

import com.aiden.dojangstampback.domain.repository.order.OrderRepository;
import com.aiden.dojangstampback.domain.dto.OrderDto;
import com.aiden.dojangstampback.domain.mapper.OrderDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Transactional(readOnly = true)
    public List<OrderDto> findAllOrders() {
        return orderRepository.findAll().stream()
                .map(OrderDtoMapper::mapToDto)
                .collect(Collectors.toList());
    }

}
