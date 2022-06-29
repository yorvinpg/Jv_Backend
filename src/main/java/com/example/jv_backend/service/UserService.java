package com.example.jv_backend.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.jv_backend.entity.tb_usuario;
@Service
public interface UserService {

    public Iterable<tb_usuario> findAll();

    public Page<tb_usuario> findAll(Pageable pageable);

    public Optional<tb_usuario> findById(Long id);

    public tb_usuario save(tb_usuario user);

    public void deleteById(Long id);

}
