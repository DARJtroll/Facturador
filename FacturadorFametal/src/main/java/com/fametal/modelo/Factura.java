
package com.fametal.modelo;


import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Arian
 */
public class Factura {
    //Datos para el Json    
    private final String ublVersion = "2.1";
    private LocalDateTime fecVencimiento = LocalDateTime.now().plusYears(5);
    private String tipoOperacion = "0101";
    private String tipoDoc = "01";
    private String Serie = "F001";
    private String correlativo = "96";
    private LocalDateTime fechaEmision = LocalDateTime.now();
    private TerminosPago formaPago = new TerminosPago();
    private String tipoMoneda = this.formaPago.getMoneda();
    private ClienteFactura client;
    private UsuarioDatosFactura company = new UsuarioDatosFactura();
    private float mtoOperGravadas;
    private final float mtoOperExoneradas = 0.0f;
    private float mtoIGV;
    private float totalImpuestos = mtoIGV;
    private float valorVenta;
    private float subTotal;
    private float mtoImpVenta;
    private ArrayList<Detalles> details = new ArrayList<>();
            
    public Factura() {
        System.out.println(fecVencimiento);
        /*Detalles e1 = new Detalles();
        Detalles e2 = new Detalles();
        details.add(e1);
        details.add(e2);*/
    }
    
    public void recibirClienteRuc(ClienteRuc cliente){
        this.client = new ClienteFactura(cliente);
    }
}
