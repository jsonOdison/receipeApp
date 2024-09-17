package com.recipe.receipeApp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipe.receipeApp.dao.UserRepository;
import com.recipe.receipeApp.model.UserModel;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<UserModel> getUser(long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public UserModel createUser(UserModel model) {
        return userRepository.save(model);
    }

}
