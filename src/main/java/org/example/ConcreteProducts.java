package org.example;

class Pizza implements Product{
    @Override
    public void prepare() {
        System.out.println("Preparing Pizza....");
    }

    @Override
    public void serve() {
        System.out.println("Serving Pizza....");
    }
}

class Sushi implements  Product{

    @Override
    public void prepare() {
        System.out.println("Preparing Sushi....");
    }

    @Override
    public void serve() {
        System.out.println("Serving Sushi....");
    }
}