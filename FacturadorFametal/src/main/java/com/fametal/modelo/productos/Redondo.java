package com.fametal.modelo.productos;

import com.fametal.modelo.TipoMaterial;
import javax.persistence.Entity;


/**
 *
 * @author Arian
 */

@Entity
public class Redondo extends tipoProductoLongitud{
    
    private String diametro;
    public Redondo() {
    }
    
    public Redondo(String diametro, String grosor, double longitud, TipoMaterial tipoMaterial) {
        super(grosor, longitud, tipoMaterial);
        this.diametro = diametro;
        setearTipo();
    }

    public Redondo(String diametro,String grosor, TipoMaterial tipoMaterial) {
        super(grosor,6.00, tipoMaterial);
        this.diametro = diametro;
        setearTipo();
    }
    
    public final void setearTipo(){
        setTipo("Tubo Redondo " + tipoMaterial);
    }
    public String getDescripcion() {
        StringBuilder str = new StringBuilder();
        str.append("Tubo ").append(this.tipoMaterial).append(" Redondo de ").append(this.diametro).append(" por ").append(this.grosor).append(" de ").append(this.longitud).append(" metros");
        return str.toString();
    }
    
}
