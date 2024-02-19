package org.example;
class PizzaFactory implements Factory{
    @Override
    public Product createDish() {
        return new Pizza();
    }
}

class SushiFactory implements Factory {
    @Override
    public Product createDish() {
        return new Sushi();
    }
}
