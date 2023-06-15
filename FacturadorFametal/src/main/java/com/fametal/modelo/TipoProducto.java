
package com.fametal.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_productos")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class TipoProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    public TipoProducto(){
    
    }
     
    public String getDescripcion(){return "a";}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
