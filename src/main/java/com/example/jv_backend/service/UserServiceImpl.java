package com.example.jv_backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.jv_backend.entity.tb_usuario;
import com.example.jv_backend.repository.UserIR;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserIR userRepo;

    @Override
    @Transactional(readOnly = true)
    public void deleteById(Long id) {
        userRepo.deleteById(id);

    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<tb_usuario> findAll() {
        return userRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<tb_usuario> findAll(Pageable pageable) {

        return userRepo.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<tb_usuario> findById(Long id) {
        
        return userRepo.findById(id);
    }

    @Override
    @Transactional
    public tb_usuario save(tb_usuario user) {
        
        return userRepo.save(user);
    }

}
