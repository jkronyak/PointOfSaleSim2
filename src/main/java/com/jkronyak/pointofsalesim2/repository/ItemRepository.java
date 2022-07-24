package com.jkronyak.pointofsalesim2.repository;

import com.jkronyak.pointofsalesim2.model.EmployeeModel;
import com.jkronyak.pointofsalesim2.model.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemModel, Long> {
}
