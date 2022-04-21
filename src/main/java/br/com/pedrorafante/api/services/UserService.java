package br.com.pedrorafante.api.services;

import br.com.pedrorafante.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
