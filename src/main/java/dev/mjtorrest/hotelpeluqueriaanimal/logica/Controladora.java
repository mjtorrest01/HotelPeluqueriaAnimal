package dev.mjtorrest.hotelpeluqueriaanimal.logica;

import dev.mjtorrest.hotelpeluqueriaanimal.persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, 
            String alergico, String atencionEsp, String nombreDuenio, String tel) {
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(tel);

        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atencionEsp);
        masco.setObservaciones(observaciones);
        masco.setUnduenio(duenio);
        
        controlPersis.gurdar(duenio, masco);
    }
    
}
