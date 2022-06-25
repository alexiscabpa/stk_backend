package com.stk.consultas.models;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class UsuarioModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_codigo")
    private int id;

    @Column(name = "user_nombre")
    private String nombre;

    @Column(name = "user_pass")
    private String pass;

    @Column(name = "user_privilegios")
    private int privilegios;

    @Column(name = "user_estado")
    private int estado;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public int getPrivilegios() {
        return privilegios;
    }
    public void setPrivilegios(int privilegios) {
        this.privilegios = privilegios;
    }
    
    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
