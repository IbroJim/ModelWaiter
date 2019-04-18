package com.company.temel.Menu;

public class Menu {
    private int id;
    private String name;
    private int price;
    private int weight;
    private boolean alhogol;

    public Menu(int id, String name, int price, int weight, boolean alhogol) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.alhogol = alhogol;
    }

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
    public boolean isAlhogol() {
        return alhogol;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAlhogol(boolean alhogol) {
        this.alhogol = alhogol;
    }
}
