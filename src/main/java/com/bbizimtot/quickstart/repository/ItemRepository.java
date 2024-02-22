package com.bbizimtot.quickstart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bbizimtot.quickstart.entity.ItemEntity;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, String> {

    
}
