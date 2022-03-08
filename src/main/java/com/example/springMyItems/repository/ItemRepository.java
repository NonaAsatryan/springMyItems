package com.example.springMyItems.repository;

import com.example.springMyItems.entity.Item;
import com.example.springMyItems.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ItemRepository extends JpaRepository<Item, Integer> {

     List<Item> findAllByUser (User user);
}
