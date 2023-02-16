package com.beppetemp.shopping_list;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("ShoppingListItems")
public class ShoppingListItem {

    @Id
    private String id;

    private String name;
    private int quantity;

    public ShoppingListItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
