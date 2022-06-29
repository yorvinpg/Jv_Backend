package com.example.jv_backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class tb_usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nombre_usu;

    @Column(nullable = false)
    private String apellidoP_usu;

    @Column(nullable = false)
    private String apellidoM_usu;

    @Column(nullable = false)
    private String direccion_usu;

    @Column(nullable = false)
    private String documento_usu;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String edad_usu;

    public tb_usuario() {
    }

    public tb_usuario(Long id, String nombre_usu, String apellidoP_usu, String apellidoM_usu, String direccion_usu,
            String documento_usu, String telefono, String email, String edad_usu) {
        this.id = id;
        this.nombre_usu = nombre_usu;
        this.apellidoP_usu = apellidoP_usu;
        this.apellidoM_usu = apellidoM_usu;
        this.direccion_usu = direccion_usu;
        this.documento_usu = documento_usu;
        this.telefono = telefono;
        this.email = email;
        this.edad_usu = edad_usu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_usu() {
        return nombre_usu;
    }

    public void setNombre_usu(String nombre_usu) {
        this.nombre_usu = nombre_usu;
    }

    public String getApellidoP_usu() {
        return apellidoP_usu;
    }

    public void setApellidoP_usu(String apellidoP_usu) {
        this.apellidoP_usu = apellidoP_usu;
    }

    public String getApellidoM_usu() {
        return apellidoM_usu;
    }

    public void setApellidoM_usu(String apellidoM_usu) {
        this.apellidoM_usu = apellidoM_usu;
    }

    public String getDireccion_usu() {
        return direccion_usu;
    }

    public void setDireccion_usu(String direccion_usu) {
        this.direccion_usu = direccion_usu;
    }

    public String getDocumento_usu() {
        return documento_usu;
    }

    public void setDocumentoI_usu(String documentoI_usu) {
        this.documento_usu = documento_usu;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEdad_usu() {
        return edad_usu;
    }

    public void setEdad_usu(String edad_usu) {
        this.edad_usu = edad_usu;
    }

}
