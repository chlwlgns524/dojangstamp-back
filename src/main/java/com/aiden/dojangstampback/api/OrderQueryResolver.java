package com.aiden.dojangstampback.api;

import com.aiden.dojangstampback.api.dto.request.CreateNewOrderRequest;
import com.aiden.dojangstampback.api.dto.response.CreateNewOrderResponse;
import com.aiden.dojangstampback.domain.dto.OrderDto;
import com.aiden.dojangstampback.domain.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class OrderQueryResolver {

    private final OrderService orderService;

    @QueryMapping
    public List<OrderDto> retrieveAllOrderList() {
        return orderService.findAllOrders();
    }

    @MutationMapping
    public CreateNewOrderResponse createNewOrder(@Argument CreateNewOrderRequest createNewOrderRequest) {
        System.out.println(createNewOrderRequest);
        return null;
    }

}
