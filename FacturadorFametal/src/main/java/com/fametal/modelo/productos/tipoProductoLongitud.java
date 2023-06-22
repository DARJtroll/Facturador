
package com.fametal.modelo.productos;

import com.fametal.modelo.TipoMaterial;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class tipoProductoLongitud extends TipoProducto{
    protected String grosor;
    protected double longitud;
    @Enumerated(EnumType.STRING)
    protected TipoMaterial tipoMaterial;

    public tipoProductoLongitud() {
    }

    public tipoProductoLongitud(String grosor, double longitud,TipoMaterial tipoMaterial) {
        this.grosor = grosor;
        this.longitud = longitud;
        this.tipoMaterial = tipoMaterial;
    }
    
    public void cambiarLongitud(double longitud){
        this.longitud = longitud;
    }

    @Override
    public String getDescripcion() {
        
        return null;
    }
}
