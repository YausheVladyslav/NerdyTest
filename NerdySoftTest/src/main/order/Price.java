package main.order;

import main.factory.Product;

import java.util.Objects;

public class Price {

    private Product product;

    public Price(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return Objects.equals(product, price.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }
}
