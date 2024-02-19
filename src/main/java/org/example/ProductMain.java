package org.example;

public class ProductMain {
    public static void main(String[] args) {
        Factory pizzaFactory = new PizzaFactory();
        Product pizza = pizzaFactory.createDish();
        pizza.prepare();
        pizza.serve();

        Factory sushiFactory = new SushiFactory();
        Product sushi = sushiFactory.createDish();
        sushi.prepare();
        sushi.serve();
    }

}
