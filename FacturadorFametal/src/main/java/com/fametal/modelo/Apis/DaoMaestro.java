/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fametal.modelo.Apis;

import javax.persistence.EntityManager;

/**
 *
 * @author Arian
 */
public class DaoMaestro {
    
    public void GuardarEntidad(Object objeto,EntityManager em){
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        em.close();
    }
}
