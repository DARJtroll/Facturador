/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fametal.dao;

import com.fametal.modelo.ClienteRuc;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Arian
 */
public class ClienteRucDAO {
    private EntityManager em;

    public ClienteRucDAO(EntityManager EM) {
        this.em = EM;
    }
    
    public List<ClienteRuc> listarClientesRuc(){
        String SQl = "SELECT C FROM ClienteRuc as C ";
        try{
            return em.createQuery(SQl,ClienteRuc.class).getResultList();
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
                
    }
    
    public List<ClienteRuc> buscarParecidoRuc(String ruc){
        String SQl = "SELECT C FROM ClienteRuc as C WHERE C.ruc LIKE :rucc";
        try{
            return em.createQuery(SQl,ClienteRuc.class).setParameter("rucc",ruc+"%").getResultList();
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
                
    }
    
}
