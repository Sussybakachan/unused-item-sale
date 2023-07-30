package com.berbus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.berbus.Model.Category;


@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

}
