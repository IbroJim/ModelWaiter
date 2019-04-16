package com.company.temel;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Order {
    private UUID id;
    private ArrayList<Integer> listIdDishes;
    private int idWaiter;
    private int totalAmount;
    private int tableNumber;
    private Date dateOrder;


    public Order(int idWaiter, int tableNumber) {
        id=UUID.randomUUID();
        this.idWaiter = idWaiter;
        this.tableNumber = tableNumber;
        dateOrder=new Date();
    }

    public void setListIdDishes(ArrayList<Integer> listIdDishes) {
        this.listIdDishes = listIdDishes;
    }

    public void setIdWaiter(int idWaiter) {
        this.idWaiter = idWaiter;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public UUID getId() {
        return id;
    }

    public ArrayList<Integer> getListIdDishes() {
        return listIdDishes;
    }

    public int getIdWaiter() {
        return idWaiter;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public Date getDateOrder() {
        return dateOrder;
    }
}
