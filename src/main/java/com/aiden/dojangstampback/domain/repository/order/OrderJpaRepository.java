package com.aiden.dojangstampback.domain.repository.order;

import com.aiden.dojangstampback.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<Order, Long>, OrderRepository {

}
