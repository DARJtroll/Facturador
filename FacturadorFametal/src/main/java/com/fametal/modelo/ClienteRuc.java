/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fametal.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Arian
 */
@Entity
public class ClienteRuc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ruc;
    private String razonSocial;
    private String direccion;
    private String estado;
    private String departamento;
    private String provincia;
    private String distrito;
    
    private String telefono1;
    private String telefono2;
    private String celular;

    public ClienteRuc() {
    }
    
        /**
     * Constructor con datos clave
     * 
     * @param ruc
     * @param razonSocial
     * @param direccion
     * @param estado
     * @param departamento
     * @param provincia
     * @param distrito 
     */
    public ClienteRuc(String ruc, String razonSocial, String direccion, String estado, String departamento, String provincia, String distrito) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.estado = estado;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
    }
    
    /**
     * 
     * Constructor con datos clave y un telefono
     * 
     * @param ruc
     * @param razonSocial
     * @param direccion
     * @param estado
     * @param departamento
     * @param provincia
     * @param distrito
     * @param telefono1 
     */
    public ClienteRuc(String ruc, String razonSocial, String direccion, String estado, String departamento, String provincia, String distrito, String telefono1) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.estado = estado;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.telefono1 = telefono1;
    }
    
    /**
     * Constructor con datos clave y dos telefonos
     * @param ruc
     * @param razonSocial
     * @param direccion
     * @param estado
     * @param departamento
     * @param provincia
     * @param distrito
     * @param telefono1
     * @param telefono2 
     */
    public ClienteRuc(String ruc, String razonSocial, String direccion, String estado, String departamento, String provincia, String distrito, String telefono1, String telefono2) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.estado = estado;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
    }
    
    /**
     * 
     * Constructor con todos los datos
     * @param ruc
     * @param razonSocial
     * @param direccion
     * @param estado
     * @param departamento
     * @param provincia
     * @param distrito
     * @param telefono1
     * @param telefono2
     * @param celular 
     */
    public ClienteRuc(String ruc, String razonSocial, String direccion, String estado, String departamento, String provincia, String distrito, String telefono1, String telefono2, String celular) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.estado = estado;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.celular = celular;
    }
    
    
    public Long getId() {
        return id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRuc() {
        return ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstado() {
        return estado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClienteRuc)) {
            return false;
        }
        ClienteRuc other = (ClienteRuc) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClienteRuc{" + "id=" + id + ", ruc=" + ruc + ", razonSocial=" + razonSocial + ", direccion=" + direccion + ", estado=" + estado + ", departamento=" + departamento + ", provincia=" + provincia + ", distrito=" + distrito + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + ", celular=" + celular + '}';
    }


    
}
