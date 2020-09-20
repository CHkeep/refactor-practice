package com.twu.refactoring;

import java.util.List;

public class Order {
    String name;
    Strings address;
    List<LineItem> listItem;

    public Order(String name, String address, List<LineItem> listItem) {
        this.name = name;
        this.address = address;
        this.listItem = listItem;
    }

    public String getCustomerName() {
        return name;
    }

    public String getCustomerAddress() {
        return address;
    }

    public List<LineItem> getLineItems() {
        return listItem;
    }
}
