
package com.fametal.modelo;

/**
 *
 * @author Arian
 */
class Detalles {
    /*
    "unidad": "NIU",
    "descripcion": "PRODUCTO 1",
    "cantidad": 2,
    "mtoValorUnitario": 100,
    "mtoValorVenta": 200,
    "mtoBaseIgv": 200,
    "porcentajeIgv": 18,
    "igv": 36,
    "tipAfeIgv": 10,
    "totalImpuestos": 36,
    "mtoPrecioUnitario": 118*/
    private final String unidad = "NIU";
    private String descripcion;
    private String cantidad;
    private float mtoValorUnitario;
    private float mtoValorVenta;
    private float mtoBaseIgv;
    private float igv;
    private final String tipoAfeIgv = "10";
    private float totalImpuestos;
    private float mtoPrecioUnitario;

    public Detalles(Item produc){
        
    }
    
    
}
