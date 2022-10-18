package model;

import javax.persistence.*;


@Entity
@Table(name = "Estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private  Pais pais;
    private String nombre;

}
