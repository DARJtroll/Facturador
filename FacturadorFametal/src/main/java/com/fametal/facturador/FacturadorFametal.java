

package com.fametal.facturador;


import com.fametal.modelo.Apis.LocalDateTimeAdapter;
import com.fametal.modelo.ClienteRuc;
import com.fametal.modelo.Factura;
import com.fametal.view.viewLogin;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import java.time.LocalDateTime;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Arian
 */
public class FacturadorFametal {
    private static EntityManagerFactory Factory = Persistence.createEntityManagerFactory("entidad");
    public static void main(String[] args) {
        
        EntityManager em = Factory.createEntityManager();
        
        
        viewLogin log = new viewLogin(em);
        log.setVisible(true);
        
        Factura fac = new Factura();
        
        Gson gg = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter()).setPrettyPrinting().create();
        String json = gg.toJson(fac);
        
        System.out.println(json);
        //tipoProductoLongitud cuadrado = new Cuadrado("1.2","0.9",TipoMaterial.Galvanizado);
        //Producto producto = new Producto(10, 10, 10, cuadrado);
        
        /*Cuenta cuenta = new Cuenta("david123", "WalterXD");
        em.getTransaction().begin();
        
        em.persist(cuenta);
        
        em.getTransaction().commit();*/
        
        //em.close();   //Solo cerrar cuando sea necesario XD


    }
}
