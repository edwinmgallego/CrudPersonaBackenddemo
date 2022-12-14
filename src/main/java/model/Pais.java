package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Pais")
public class Pais implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private  String nombre;

    public Pais() {
    }

    public Pais(String nombre) {
        super();
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
