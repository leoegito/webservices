package com.leoegito.webservices.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.leoegito.webservices.entities.pk.OrderItemPK;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();

    private Integer quanitty;
    private Double price;

    public OrderItem(){}

    public OrderItem(Order order, Product product, Integer quanitty, Double price) {
        super();
        id.setOrder(order);
        id.setProduct(product);
        this.quanitty = quanitty;
        this.price = price;
    }

    //importante
    @JsonIgnore
    public Order getOrder(){
        return id.getOrder();
    }

    public void setOrder(Order order){
        id.setOrder(order);
    }

    public Product getProduct(){
        return id.getProduct();
    }

    public void setProduct(Product product){
        id.setProduct(product);
    }


    public Integer getQuanitty() {
        return quanitty;
    }

    public void setQuanitty(Integer quanitty) {
        this.quanitty = quanitty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
