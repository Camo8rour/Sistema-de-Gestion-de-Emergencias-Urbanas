package model.interfaces;

import model.Emergencia;

public interface ServicioEmergencia {
    
    String getId();

    int getPersonalDisponible();

    int getCombustible();

    boolean estaDisponible();

    void asignarPersonal(int cantidad);

    void libreraPersonal(int cantidad);

    void gastarCombustible(int cantidad);

    void tanquearCombustible(int cantidad);

    void atenderEmergencia(Emergencia emergencia);
}
