package com.company.temel;

public class Menu {
    private int id;
    private String name;
    private int price;
    private int weight;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(int id,String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
}
