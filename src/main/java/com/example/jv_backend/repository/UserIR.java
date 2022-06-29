package com.example.jv_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jv_backend.entity.tb_usuario;

@Repository
public interface UserIR extends JpaRepository<tb_usuario, Long> {

}
