package model.service;

import model.Emergencia;

public class Bomberos extends Servicios{
    
    public Bomberos(String id, int personalDisponible, int combustible){
        super(id, personalDisponible, combustible);
    }

    @Override
    public void atenderEmergencia(Emergencia emergencia){
        System.out.println("Los bomberos estan en camino hacia el sitio!!!");
        System.out.printf("-> [Bomberos %d]: %s", getId(), emergencia.toString());

        asignarPersonal(5);
        gastarCombustible(10);
    }
}
