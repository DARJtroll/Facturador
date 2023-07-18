
package com.fametal.facturador;

import com.fametal.dao.ServiciosGenerales;
import com.fametal.modelo.Producto;
import com.fametal.modelo.TipoMaterial;
import com.fametal.modelo.productos.Cuadrado;
import com.fametal.modelo.productos.Rectangular;
import com.fametal.modelo.productos.Redondo;
import com.fametal.modelo.productos.TipoProducto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FacturadorAgregarProducto {
private static EntityManagerFactory Factory = Persistence.createEntityManagerFactory("entidad");
    //Primero agregemos Tubos
    public static void main(String[] args) {
        
        EntityManager em = Factory.createEntityManager();
        
        
        ServiciosGenerales serv = new ServiciosGenerales(em);
        String[] grosores = {"1.5","1.8","2.0"};
        String[] medidas = {"1/2","5/8","3/4","1","1 1/4","1 1/2","2","2 1/2","3"};
        String[] anchuras = {"1","40","50"};
        String[] alturas = {"2","60","100","150"};
        
        //----------
        for(String grosor: grosores){
                        TipoProducto tipo = new Rectangular("40","80", grosor, TipoMaterial.Galvanizado);
                        Producto producto = new Producto(0, 0, 0,tipo);
                        //serv.GuardarEntidad(producto, em);    
                        System.out.println("Se incluyo tubo rectangular de "+"40"+" x " + "80" + " de " + grosor);            
        }

        em.close();
        //----------
        
        
        
    }
}
