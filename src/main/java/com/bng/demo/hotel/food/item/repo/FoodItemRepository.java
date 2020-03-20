package com.bng.demo.hotel.food.item.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bng.demo.hotel.food.item.entity.FoodItemEntity;

public interface FoodItemRepository extends JpaRepository<FoodItemEntity, Long>
{

}
