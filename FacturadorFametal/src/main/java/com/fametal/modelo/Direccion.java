package com.fametal.modelo;

import org.eclipse.persistence.sessions.remote.DistributedSession;

/**
 *
 * @author Arian
 */
class Direccion {
    
    private String direccion = "";
    private String provincia = "";
    private String departamento = "";
    private String distrito = "";
    private String ubigueo = "";

    public Direccion() {
    }

    
    public Direccion(String direccion,String provincia,String departamento,String distrito,String ubigueo) {
        this.direccion = direccion;
        this.provincia = provincia;
        this.departamento = departamento;
        this.distrito = distrito;
        this.ubigueo = ubigueo;
    }


    
    public Direccion(ClienteRuc cliente) {
        this.direccion = cliente.getDireccion();
        this.provincia = cliente.getProvincia();
        this.departamento = cliente.getDepartamento();
        this.distrito = cliente.getDistrito();
        this.ubigueo = cliente.getUbigueo();
    }

    public String getUbigeo() {
        return this.ubigueo;
    }

}
