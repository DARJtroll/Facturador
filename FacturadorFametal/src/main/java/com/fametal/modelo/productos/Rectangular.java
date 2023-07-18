package com.fametal.modelo.productos;

import com.fametal.modelo.TipoMaterial;
import javax.persistence.Entity;


/**
 *
 * @author Arian
 */

@Entity
public class Rectangular extends tipoProductoLongitud{
    
    private String altura;
    private String anchura;
    public Rectangular() {
    }
    
    public Rectangular(String altura,String anchura, String grosor, double longitud, TipoMaterial tipoMaterial) {
        super(grosor, longitud, tipoMaterial);
        this.altura = altura;
        this.anchura = anchura;
        setearTipo();
    }
    
    /**
     * Este constructor se usa para no definir la longitud del tubo
     * @param altura
     * @param anchura
     * @param grosor El grosordel Tubo
     * @param tipoMaterial 
     */
    public Rectangular(String altura,String anchura,String grosor, TipoMaterial tipoMaterial) {
        super(grosor,6.00, tipoMaterial);
        this.altura = altura;
        this.anchura = anchura;
        setearTipo();
    }

    
    @Override
    public String getDescripcion() {
        StringBuilder str = new StringBuilder();
        str.append("Tubo ").append(this.tipoMaterial).append(" Rectangular de ").append(this.altura).append(" por ").append(this.anchura).append(" por ").append(this.grosor).append(" de").append(this.longitud).append(" metros");
        return str.toString();
    }
    
    public final void setearTipo(){
        setTipo("Tubo Rectangular " + tipoMaterial);
    }
}
