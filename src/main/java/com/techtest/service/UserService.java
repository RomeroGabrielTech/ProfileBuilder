package com.techtest.service;

import com.techtest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository usuarioRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.usuarioRepository = userRepository;
  }

  public boolean existsByEmail(String email) {
    return usuarioRepository.findByEmail(email).isPresent();
  }

  // Agrega cualquier otro método que necesites para tu lógica de negocio
}

