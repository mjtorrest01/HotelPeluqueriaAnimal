package dev.mjtorrest.hotelpeluqueriaanimal.persistencia;

import dev.mjtorrest.hotelpeluqueriaanimal.logica.Duenio;
import dev.mjtorrest.hotelpeluqueriaanimal.logica.Mascota;

public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void gurdar(Duenio duenio, Mascota masco) {
        duenioJpa.create(duenio);
        mascoJpa.create(masco);
    }
}
