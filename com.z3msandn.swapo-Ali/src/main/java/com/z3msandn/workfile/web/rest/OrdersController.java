package com.z3msandn.workfile.web.rest;

import com.z3msandn.workfile.domain.Orders;
import com.z3msandn.workfile.repository.OrderRepository;
import com.z3msandn.workfile.service.OrderService;
import com.z3msandn.workfile.service.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URISyntaxException;

@RestController
@RequestMapping
public class OrdersController {
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public OrdersController(OrderService orderService, OrderRepository orderRepository) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }
    @PostMapping("/Orders")
    public ResponseEntity<Orders> createOrder(@Valid @RequestBody OrderDTO orderDTO)throws URISyntaxException {}
}
