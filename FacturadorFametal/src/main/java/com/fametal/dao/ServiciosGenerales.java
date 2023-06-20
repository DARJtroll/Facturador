/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fametal.dao;

import com.fametal.modelo.ClienteRuc;
import com.fametal.modelo.Cuenta;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Arian
 */
public class ServiciosGenerales {
    
    private ClienteRucDAO clienteRucDAO;
    private CuentaDao cuentaDao;
    public ServiciosGenerales(EntityManager em){
        this.clienteRucDAO = new ClienteRucDAO(em);
        this.cuentaDao = new CuentaDao(em);
    }
    
    public List<ClienteRuc>listarClientesRuc(){
        return clienteRucDAO.listarClientesRuc();
    }
    public Cuenta buscarPorNombre(String nombre){
        return cuentaDao.BuscarPorNombre(nombre);
    }
    
    public List<ClienteRuc> buscarPorParecidoRuc(String ruc){
        return clienteRucDAO.buscarParecidoRuc(ruc);
    }
}