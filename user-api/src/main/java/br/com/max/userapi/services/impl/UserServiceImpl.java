package br.com.max.userapi.services.impl;

import br.com.max.userapi.domain.User;
import br.com.max.userapi.repository.UserRepository;
import br.com.max.userapi.services.UserService;
import br.com.max.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() ->new ObjectNotFoundException("Objetct not found"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
