package com.recipe.receipeApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipe.receipeApp.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
