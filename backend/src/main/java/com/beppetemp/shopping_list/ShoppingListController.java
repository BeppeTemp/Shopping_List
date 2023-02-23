package com.beppetemp.shopping_list;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/items")
public class ShoppingListController {

    @Autowired
    private final ShoppingListItemRepository repository;

    ShoppingListController(ShoppingListItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/list")
    public List<ShoppingListItem> all() {
        return repository.findAll();
    }

    @GetMapping("/add")
    public void add() {
        repository.save(new ShoppingListItem("Prosciutto", 2));
    }

}
