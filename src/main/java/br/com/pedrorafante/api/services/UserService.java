package br.com.pedrorafante.api.services;

import br.com.pedrorafante.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();

}
