package br.com.pedrorafante.api.services.impl;

import br.com.pedrorafante.api.domain.User;
import br.com.pedrorafante.api.repositories.UserRepository;
import br.com.pedrorafante.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
