package com.z3msandn.workfile.service;

import com.z3msandn.workfile.domain.Orders;
import com.z3msandn.workfile.repository.OrderRepository;
import com.z3msandn.workfile.service.dto.OrderDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService{

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public Orders createOrder(OrderDTO orderDTO){
        Orders order = new Orders();
        order.setItemId(orderDTO.getItemId());
        order.setQuantity(orderDTO.getQuantity());
        order.setUnitPrice(orderDTO.getUnitPrice());
        orderRepository.save(order);
        return order;
    }

    public Orders updateOrder(OrderDTO orderDTO){
                 Orders order = new Orders();
                 order.setItemId(orderDTO.getItemId());
                 order.setQuantity(orderDTO.getQuantity());
                 order.setUnitPrice(orderDTO.getUnitPrice());
                 orderRepository.save(order);
                 return order;
    }

    public void deleteOrder(Long id) {
        orderRepository.findById(id).ifPresent(order -> {
            orderRepository.delete(order);
        });
    }
}
