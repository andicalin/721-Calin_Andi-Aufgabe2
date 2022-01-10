package model;

import java.util.Date;
import java.util.List;

public class InventoryUpdate {
    private List<Product> products;
    private Date date;

    public InventoryUpdate() {
    }

    public InventoryUpdate(List<Product> products, Date date) {
        this.products = products;
        this.date = date;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
