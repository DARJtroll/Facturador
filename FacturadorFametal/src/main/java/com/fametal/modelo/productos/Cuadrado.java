package com.fametal.modelo.productos;

import com.fametal.modelo.TipoMaterial;
import javax.persistence.Entity;


/**
 *
 * @author Arian
 */

@Entity
public class Cuadrado extends tipoProductoLongitud{
    
    private String medida;
    public Cuadrado() {
    }
    
    public Cuadrado(String medida, String grosor, double longitud, TipoMaterial tipoMaterial) {
        super(grosor, longitud, tipoMaterial);
        this.medida = medida;
    }
    
    /**
     * Este constructor se usa para no definir la longitud del tubo
     * @param medida Es la medido del tubo cudrado, lo que mide un lado
     * @param grosor El grosordel Tubo
     * @param tipoMaterial 
     */
    public Cuadrado(String medida,String grosor, TipoMaterial tipoMaterial) {
        super(grosor,6.00, tipoMaterial);
        this.medida = medida;
        setTipo("Tubo Cuadrado " + tipoMaterial);
    }

    
    @Override
    public String getDescripcion() {
        StringBuilder str = new StringBuilder();
        str.append("Tubo ").append(this.tipoMaterial).append(" Cuadrado de ").append(this.medida).append(" por ").append(this.grosor).append(" de ").append(this.longitud).append(" metros");
        return str.toString();
    }
    
}
