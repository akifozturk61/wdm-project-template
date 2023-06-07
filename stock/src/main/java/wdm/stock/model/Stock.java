package wdm.stock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "stock")
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    int qty;
    float price;
    @Version
    private Long version;

//    @OneToMany(mappedBy = "item")
//    private List<ReservedStock> reservedStockList = new ArrayList<>();


    public Stock(int qty, float price) {
        this.qty = qty;
        this.price = price;
    }

    public Stock() {
    }

    public long idGet() {
        return id;
    }

    public int getStock() {
        return qty;
    }

    public void setStock(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id='" + id + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
