package br.com.max.userapi.services.impl;

import br.com.max.userapi.domain.User;
import br.com.max.userapi.repository.UserRepository;
import br.com.max.userapi.services.UserService;
import br.com.max.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final Environment env;

    @Override
    public User findById(Long id) {
        log.info("USER_SERVICE ::: Get request on :" +env.getProperty("local.server.port")+ " port");
        return repository.findById(id).orElseThrow(() ->new ObjectNotFoundException("Objetct not found"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
