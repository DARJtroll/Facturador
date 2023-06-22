
package com.fametal.facturador;

import com.fametal.dao.ServiciosGenerales;
import com.fametal.modelo.Producto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FacturadorAgregarProducto {
private static EntityManagerFactory Factory = Persistence.createEntityManagerFactory("entidad");
    //Primero agregemos Tubos
    public static void main(String[] args) {
        
        EntityManager em = Factory.createEntityManager();
        
        
        ServiciosGenerales serv = new ServiciosGenerales(em);
        
        //----------
        Producto producto = new Producto(0, 0, 0, tipoProducto);
        //----------
        
        serv.GuardarEntidad(producto, em);
        
    }
}
