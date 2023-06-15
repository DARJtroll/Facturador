

package com.fametal.facturador;


import com.fametal.modelo.Producto;
import com.fametal.view.viewLogin;
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
        
        
        //tipoProductoLongitud cuadrado = new Cuadrado("1.2","0.9",TipoMaterial.Galvanizado);
        //Producto producto = new Producto(10, 10, 10, cuadrado);
        
        /*Cuenta cuenta = new Cuenta("david123", "WalterXD");
        em.getTransaction().begin();
        
        em.persist(cuenta);
        
        em.getTransaction().commit();*/
        
        //em.close();   //Solo cerrar cuando sea necesario XD
        
        Producto p = em.find(Producto.class,1L);
        //System.out.println("");
        System.out.println(p.getPrecioCompra());

    }
}
