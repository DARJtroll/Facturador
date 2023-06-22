
package com.fametal.modelo.productos;


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
    private String Tipo;
    
    public TipoProducto(){
    
    }
        
    public String getDescripcion(){return "a";}

    public Long getId() {
        return id;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
}
