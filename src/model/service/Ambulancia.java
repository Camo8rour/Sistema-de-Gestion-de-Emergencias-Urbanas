package model.service;

import model.Emergencia;

public class Ambulancia extends Servicios {
    
    public Ambulancia(String id, int personalDisponible, int combustible){
        super(id, personalDisponible, combustible);
    }
 
    @Override
    public void atenderEmergencia(Emergencia emergencia){
        System.out.println("La ambulancia esta en camino hacia el sitio!!!");
        System.out.printf("-> [Ambulancia %d]: %s", getId(), emergencia.toString());

        asignarPersonal(3);
        gastarCombustible(5);
    }
}
