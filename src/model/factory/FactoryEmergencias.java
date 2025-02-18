package model.factory;

import model.Emergencia;
import model.Incendio;
import model.AccidenteVehicular;
import model.Robo;
import utils.NivelGravedad;
import utils.TipoEmergencia;

public class FactoryEmergencias {

    public static Emergencia crearEmergencia(TipoEmergencia tipo, String ubicacion, NivelGravedad nivelGravedad,
            int tiempoRespuesta) {
        switch (tipo) {
            case INCENDIO:
                return new Incendio(ubicacion, nivelGravedad, tiempoRespuesta);

            case ROBO:
                return new Robo(ubicacion, nivelGravedad, tiempoRespuesta);

            case ACCIDENTE_VEHICULAR:
                return new AccidenteVehicular(ubicacion, nivelGravedad, tiempoRespuesta);

            default:
                return null;
        }
    }
}
