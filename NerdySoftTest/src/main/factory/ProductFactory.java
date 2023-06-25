package main.factory;

import java.time.LocalDate;

public class ProductFactory {
    public static Product createRealProduct(String name, double price, int size, int weight) {
        RealProduct realProduct = new RealProduct();
        realProduct.setName(name);
        realProduct.setPrice(price);
        realProduct.setSize(size);
        realProduct.setWeight(weight);
        return realProduct;
    }

    public static Product createVirtualProduct(String name, double price, String code, LocalDate expirationDate) {
        VirtualProduct virtualProduct = new VirtualProduct();
        virtualProduct.setName(name);
        virtualProduct.setPrice(price);
        virtualProduct.setCode(code);
        virtualProduct.setExpirationDate(expirationDate);
        return virtualProduct;
    }
}
