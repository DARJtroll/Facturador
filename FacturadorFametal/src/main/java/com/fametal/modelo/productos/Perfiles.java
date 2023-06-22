package com.fametal.modelo.productos;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author Arian
 */
@Entity
public class Perfiles extends TipoProducto{
    
    @Enumerated(EnumType.STRING)
    private perfilesEnum perfil;
    private String longitud;
    private String grosor;
    private String medida;

    public Perfiles() {
    }

    public Perfiles(perfilesEnum perfil, String longitud, String grosor, String medida) {
        this.perfil = perfil;
        this.longitud = longitud;
        this.grosor = grosor;
        this.medida = medida;
    }

    public Perfiles(perfilesEnum perfil, String grosor, String medida) {
        this.perfil = perfil;
        this.grosor = grosor;
        this.medida = medida;
    }

    public String getPerfil() {
        return perfil.toString();
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getGrosor() {
        return grosor;
    }

    public void setGrosor(String grosor) {
        this.grosor = grosor;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }
    
    

    @Override
    public String getDescripcion() {
        String str;
        str = "Perfil "+ this.perfil + " de " + this.medida + " por " + this.grosor + " de " + this.longitud;
        return str;
    }
    
    
    
}
