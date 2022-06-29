package com.example.jv_backend.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jv_backend.entity.tb_usuario;
import com.example.jv_backend.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Create new usu
    @PostMapping
    public ResponseEntity<?> create(@RequestBody tb_usuario user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));

    }

    // read user
    @GetMapping("/{id}")
    public ResponseEntity<?> read(@PathVariable(value = "id") Long id) {
        Optional<tb_usuario> oUser = userService.findById(id);
        if (!oUser.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(oUser);

    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody tb_usuario userDetails, @PathVariable(value = "id") Long id) {
        Optional<tb_usuario> user = userService.findById(id);
        if (!user.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        user.get().setNombre_usu(userDetails.getNombre_usu());
        user.get().setApellidoP_usu(userDetails.getApellidoP_usu());
        user.get().setDireccion_usu(userDetails.getDireccion_usu());
        user.get().setTelefono(userDetails.getTelefono());
        user.get().setEmail(userDetails.getEmail());

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user.get()));

    }

    // Delete an User
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        if (!userService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        userService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    // Get all
    @GetMapping
    public List<tb_usuario> readAll() {
        List<tb_usuario> user = StreamSupport
                .stream(userService.findAll().spliterator(), false)
                .collect(Collectors.toList());

        return user;
    }

}
