
package com.fametal.dao;

import com.fametal.modelo.Producto;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Arian
 */
class ProductosDao {
        private EntityManager em;
    ProductosDao(EntityManager em) {
        this.em = em;
    }
    
    public List<Producto> listarTodo() {
        String SQL = "SELECT P FROM Producto as P";
        return em.createQuery(SQL,Producto.class).getResultList();
    }

    List<Producto> listarPorDescripcion(String descrip) {
        String SQL = "SELECT P FROM Producto as P WHERE P.descripcion LIKE :descrip";
        return em.createQuery(SQL,Producto.class).setParameter("descrip",descrip +"%").getResultList();
    }
    
    
    
}
