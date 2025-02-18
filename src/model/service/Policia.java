package model.service;

import model.Emergencia;

public class Policia extends Servicios{

    public Policia(String id, int personalDisponible, int combustible) {
        super(id, personalDisponible, combustible);
    }

    @Override
    public void atenderEmergencia(Emergencia emergencia){
        System.out.println("La policia esta en camino hacia el sitio!!!");
        System.out.printf("-> [Policia %d]: %s", getId(), emergencia.toString());

        asignarPersonal(2);
        gastarCombustible(3);
    }
}
