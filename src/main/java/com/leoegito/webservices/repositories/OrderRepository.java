package com.leoegito.webservices.repositories;

import com.leoegito.webservices.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}