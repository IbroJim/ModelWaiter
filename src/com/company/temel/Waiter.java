package com.company.temel;

import java.util.UUID;

public class Waiter {

    private UUID id;
    private String name;

    public Waiter( String name) {
        id=UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
