package com.z3msandn.workfile.web.rest;

import com.z3msandn.workfile.domain.Orders;
import com.z3msandn.workfile.repository.OrderRepository;
import com.z3msandn.workfile.service.OrderService;
import com.z3msandn.workfile.service.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriBuilder;

import java.net.URI;
import java.util.List;


@Controller
@RestController
public class OrdersController {

@Autowired
private OrderService service;

@GetMapping
public List <Orders> retriveAllOrders(){
    return service.findAll();
}
@GetMapping ("/Orders/{id}")
    public Orders retriveOrders(@PathVariable Long id){
   return service.findOne(id);
}
@PostMapping("/Odrers")
    public ResponseEntity<Orders> createOrder(@RequestBody Orders order){
    Orders savedOrder = service.save(order);
    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedOrder.getId()).toUri();
    return ResponseEntity.created(location).build();
}

    }


