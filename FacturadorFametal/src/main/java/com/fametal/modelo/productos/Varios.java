
package com.fametal.modelo.productos;

/**
 *
 * @author Arian
 */
public class Varios extends TipoProducto{
    String tipoVarios;
    public Varios() {
    }

    public Varios(String tipoVarios) {
        this.tipoVarios = tipoVarios;
    }

    @Override
    public String getDescripcion() {
        return tipoVarios;
    }
    
}
