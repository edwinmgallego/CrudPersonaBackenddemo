package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Persona")
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int  id;

    private  String nombre;
    private String apellido;
    private  int edad;
    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;
    @JoinColumn(name = "id_Estado")
    private Estado estado;


    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, Pais pais, Estado estado) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pais = pais;
        this.estado = estado;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
