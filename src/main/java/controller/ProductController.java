package controller;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductController implements ProductInterface {
    private final List<Product> products;

    public ProductController() {
        this.products = new ArrayList<>();
    }

    @Override
    public Product add(String name, int price, String SKU, int prodNr) {
        Product product = new Product(name, price, SKU, prodNr);
        this.products.add(product);
        return product;
    }

    @Override
    public Product find(String name) {
        for (Product product: products)
            if (product.getName().equals(name))
                return product;

        return null;
    }

    @Override
    public void update(String name, int price, String SKU, int prodNr) {
        Product product = new Product(name, price, SKU, prodNr);

        for (Product oldProd: products) {
            if (oldProd.getName().equals(name)) {
                oldProd.setInitialProductNr(product.getInitialProductNr());
                oldProd.setPrice(product.getPrice());
                oldProd.setSKU(product.getSKU());
            }
        }
    }

    @Override
    public void delete(String name) {
        products.removeIf(product -> product.getName().equals(name));
    }
}
