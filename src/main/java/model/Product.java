package model;

public class Product {
    private String name;
    private int price;
    private String SKU;
    private int initialProductNr;

    public Product() {
    }

    public Product(String name, int price, String SKU, int initialProductNr) {
        this.name = name;
        this.price = price;
        this.SKU = SKU;
        this.initialProductNr = initialProductNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public int getInitialProductNr() {
        return initialProductNr;
    }

    public void setInitialProductNr(int initialProductNr) {
        this.initialProductNr = initialProductNr;
    }
}
