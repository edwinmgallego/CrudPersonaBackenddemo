package model;

import javax.persistence.*;

@Entity
@Table(name = "Persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int  id;
    private  String nombre;
    private String apellido;
    private  int edad;
    private Pais pais;
    private Estado estado;




}
