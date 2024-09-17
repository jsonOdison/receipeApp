package com.recipe.receipeApp.services;

import java.util.Optional;

import com.recipe.receipeApp.model.UserModel;

public interface UserServiceInterface {

    public Optional<UserModel> getUser(long userId);

    public UserModel createUser(UserModel model);
}
