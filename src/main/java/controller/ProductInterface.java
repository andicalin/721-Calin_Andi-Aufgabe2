package controller;

import model.Product;

public interface ProductInterface {
    public Product add(String name, int price, String SKU, int prodNr);
    public Product find(String name);
    public void update(String name, int price, String SKU, int prodNr);
    public void delete(String name);
}
