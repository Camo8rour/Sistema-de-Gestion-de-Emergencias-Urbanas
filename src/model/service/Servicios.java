package model.service;

import model.Emergencia;
import model.interfaces.ServicioEmergencia;

public abstract class Servicios implements ServicioEmergencia{
    private String id;
    private int personalDisponible;
    private int combustible;

    public Servicios(String id, int personalDisponible, int combustible) {
        this.id = id;
        this.personalDisponible = personalDisponible;
        this.combustible = combustible;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getPersonalDisponible() {
        return personalDisponible;
    }

    @Override
    public int getCombustible() {
        return combustible;
    }

    @Override
    public boolean estaDisponible(){
        return personalDisponible > 0 && combustible > 0;
    }

    @Override
    public void asignarPersonal(int cantidad){
        if (cantidad <= personalDisponible) {
            personalDisponible -= cantidad;
        } else {
            System.out.printf("En el momento no hay suificiente personal dispoble en servicio (%d)", id);
        }
    }

    @Override
    public void libreraPersonal(int cantidad){
        personalDisponible += cantidad;
    }

    @Override
    public void gastarCombustible(int cantidad) {
        combustible = Math.max(0, combustible - cantidad);
    }

    @Override
    public void tanquearCombustible(int cantidad){
        combustible += cantidad;
    }

    public abstract void atenderEmergencia(Emergencia emergencia);

    @Override
    public String toString(){
        return "Servicios [id = " + id +
                ", personalDisponible = " + personalDisponible + 
                ", combustible = " + combustible + "]";
    }
    
}
