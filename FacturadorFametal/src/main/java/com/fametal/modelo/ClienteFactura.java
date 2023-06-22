
package com.fametal.modelo;

/**
 *
 * @author Arian
 */
class ClienteFactura {
    private final String tipoDoc = "6";
    private String numDoc;
    private String rznSocial;
    private Direccion address;

    public ClienteFactura() {
    }
    
    public ClienteFactura(ClienteRuc cliente) {
        this.numDoc = cliente.getRuc();
        this.rznSocial = cliente.getRazonSocial();
        this.address = new Direccion(cliente);
    }
}
