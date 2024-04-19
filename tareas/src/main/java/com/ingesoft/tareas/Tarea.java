package com.ingesoft.tareas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Tarea {
    @Id
    @GeneratedValue
    Long id;

    String descripcion;

    String detalles;

    boolean completado;

}

