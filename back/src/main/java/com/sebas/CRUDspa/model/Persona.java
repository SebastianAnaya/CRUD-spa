package com.sebas.CRUDspa.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name="persona")
public class Persona {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombres;
    @Column
    private String apellidos;
    @ManyToOne
    @JoinColumn (name = "id_tipo_documento")
    private tipo_documento doc;
    @Column
    private long documento;
    @ManyToOne
    @JoinColumn (name = "id_lugar_residencia")
    private Ciudad lugar_residencia;
    @Column
    private Date fecha_nacimiento;
    @Column
    private String correo;
    @Column
    private long telefono;
    @Column
    private  String usuario;
    @Column
    private String password;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, tipo_documento doc, long documento, Ciudad lugar_residencia, Date fecha_nacimiento, String correo, long telefono, String usuario, String password) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.doc = doc;
        this.documento = documento;
        this.lugar_residencia = lugar_residencia;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
        this.telefono = telefono;
        this.usuario = usuario;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public tipo_documento getDoc() {
        return doc;
    }

    public void setDoc(tipo_documento doc) {
        this.doc = doc;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public Ciudad getLugar_residencia() {
        return lugar_residencia;
    }

    public void setLugar_residencia(Ciudad lugar_residencia) {
        this.lugar_residencia = lugar_residencia;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}