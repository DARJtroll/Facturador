
package com.fametal.modelo;

/**
 *
 * @author Arian
 */
class UsuarioDatosFactura {
    private final String ruc = "20445535894";
    private final String razonSocial = "FAMETAL R & R E.I.R.L";
    private Direccion address;

    public UsuarioDatosFactura() {
        this.address = new Direccion("MZA. E LOTE. 2 VILLA SAN LUIS ANCASH SANTA NUEVO CHIMBOTE","SANTA","ANCASH","NUEVO CHIMBOTE","021809");
    }
    
}
