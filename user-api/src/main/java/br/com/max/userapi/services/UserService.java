package br.com.max.userapi.services;

import br.com.max.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
