package com.z3msandn.workfile.repository;

import com.z3msandn.workfile.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@org.springframework.stereotype.Repository
public interface OrderRepository extends JpaRepository<Orders,Long> {
}
