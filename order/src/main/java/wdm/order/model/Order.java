package wdm.order.model;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    Long order_id;
    boolean paid;
    @ElementCollection
    @Column(nullable = true)
    List<Long> items;
    Long user_id;
    float total_cost;

    public Order() {

    }
    public Order(Long user_id) {
        this.paid = false;
        this.items = new ArrayList<>();
        this.user_id = user_id;
        this.total_cost = 0;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean addItem(Long item_id) {
        return items.add(item_id);
    }

    public boolean removeItem(Long item_id) {
        return items.remove(item_id);
    }

    public float getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(float total_cost) {
        this.total_cost = total_cost;
    }

    public List<Long> getItems() {
        return items;
    }

    public Long getUser_id() {
        return user_id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + order_id + '\'' +
                ", paid=" + paid +
                ", items=" + items +
                ", user='" + user_id + '\'' +
                ", cost=" + total_cost +
                '}';
    }
}
