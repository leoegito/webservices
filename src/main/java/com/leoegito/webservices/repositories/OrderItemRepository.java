package com.leoegito.webservices.repositories;

import com.leoegito.webservices.entities.OrderItem;
import com.leoegito.webservices.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}