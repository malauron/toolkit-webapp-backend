package com.marklauron.toolkitwebappbackend.repositories;

import com.marklauron.toolkitwebappbackend.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
