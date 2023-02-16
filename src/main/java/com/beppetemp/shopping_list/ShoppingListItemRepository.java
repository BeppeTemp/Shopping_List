package com.beppetemp.shopping_list;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShoppingListItemRepository extends MongoRepository<ShoppingListItem, String> {
    public ShoppingListItem findByName(String name);
}
