
package com.fametal.dao;

import com.fametal.modelo.Cuenta;
import javax.persistence.EntityManager;

/**
 *
 * @author Arian
 */
public class CuentaDao {
    private EntityManager em;

    public CuentaDao(EntityManager EM) {
        this.em = EM;
    }
    
    public Cuenta BuscarPorNombre(String nombre){
        String sql = "SELECT P FROM Cuenta AS P WHERE P.usuario = :nombre";
        try{
            return em.createQuery(sql,Cuenta.class).setParameter("nombre",nombre).getSingleResult();
            }catch(Exception ex){
            return null;
        }
    }
    
}
