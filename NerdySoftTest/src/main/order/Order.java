package main.order;

import main.factory.Product;
import main.user.User;

import java.util.List;
import java.util.Objects;

public class Order {

    private User user;
    private List<Price> priceList;

    public Order() {
    }

    public static Order createOrder(User user, List<Product> productList) {
        Order order = new Order();
        order.setUser(user);
        order.setPriceList(productList.stream().map(Price::new).toList());
        return order;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Price> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Price> priceList) {
        this.priceList = priceList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(user, order.user) && Objects.equals(priceList, order.priceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, priceList);
    }

    private Order(OrderBuilder builder){
        this.user = builder.user;
        this.priceList = builder.priceList;
    }

    public static class OrderBuilder {
        private User user;
        private List<Price> priceList;

        public OrderBuilder(){
        }

        public OrderBuilder setUser(User user) {
            this.user = user;
            return this;
        }

        public OrderBuilder setPriceList(List<Price> priceList) {
            this.priceList = priceList;
            return this;
        }
        public Order build(){
            return new Order(this);
        }
    }
}
