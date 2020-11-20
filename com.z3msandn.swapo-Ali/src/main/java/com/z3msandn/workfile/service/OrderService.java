package com.z3msandn.workfile.service;

import com.z3msandn.workfile.domain.Orders;
import com.z3msandn.workfile.repository.OrderRepository;
import com.z3msandn.workfile.service.dto.OrderDTO;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

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

//    public Optional<OrderDTO> updateOrder(OrderDTO orderDTO){
//         return Optional.of(orderRepository
//            .findOneByItemId(orderDTO.getItemId()))
//            .filter(Optional::isPresent)
//             .map(Optional::get)
//             .map(order -> {
//                 order.setItemId(orderDTO.getItemId());
//                 order.setQuantity(orderDTO.getQuantity());
//                 order.setUnitPrice(orderDTO.getUnitPrice());
//                 return order;
//             })
//             .map(OrderDTO::new);
//    }

    public void deleteOrder(int itemId) {
        orderRepository.findOneByItemId(itemId).ifPresent(order -> {
            orderRepository.delete(order);
        });
    }
}
