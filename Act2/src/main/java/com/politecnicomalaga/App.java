package com.politecnicomalaga;

import com.politecnicomalaga.singleton.Buzon;
import com.politecnicomalaga.singleton.Portal;
import com.politecnicomalaga.singleton.Vecino;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        /*
        Buzon buzon1 = new Buzon();
        Buzon buzon2 = new Buzon();
        Buzon buzon3 = new Buzon();

        Portal portal1 = new Portal(1);
        Portal portal2 = new Portal(2);
        Portal portal3 = new Portal(3);

        portal1.addVecino(new Vecino("Juan Pérez", 1, "Se ha roto el ascensor de mi portal"));
        portal1.addVecino(new Vecino("Ana García", 1, "Tengo una gotera en el bajo"));
        portal1.addVecino(new Vecino("Pedro Gutiérrez", 1, "La pared del pasillo está desconchada"));

        portal2.addVecino(new Vecino("Jorge Díaz", 2, "No se abre la puerta del garaje"));
        portal2.addVecino(new Vecino("Rocío González", 2, "La cerradura del portal está rota y la puerta está abierta"));

        portal3.addVecino(new Vecino("Raúl Gómez", 3, "El vecino del 3º tiene pájaros muy ruidosos"));
        portal3.addVecino(new Vecino("Carla Jiménez", 3, "El vecino del 3º tiene pájaros muy ruidosos"));

        portal1.echarSolicitudes(buzon1);
        portal2.echarSolicitudes(buzon2);
        portal3.echarSolicitudes(buzon3);

        List<String> solicitudesBuzon1 = buzon1.getSolicitudes();
        for (String solicitud : solicitudesBuzon1) {
            System.out.println(solicitud);
        }

        List<String> solicitudesBuzon2 = buzon2.getSolicitudes();
        for (String solicitud : solicitudesBuzon2) {
            System.out.println(solicitud);
        }

        List<String> solicitudesBuzon3 = buzon3.getSolicitudes();
        for (String solicitud : solicitudesBuzon3) {
            System.out.println(solicitud);
        }*/

        Buzon buzon = Buzon.getInstance();


        Portal portal1 = new Portal(1);
        Portal portal2 = new Portal(2);
        Portal portal3 = new Portal(3);

        portal1.addVecino(new Vecino("Juan Pérez", 1, "Se ha roto el ascensor de mi portal"));
        portal1.addVecino(new Vecino("Ana García", 1, "Tengo una gotera en el bajo"));
        portal1.addVecino(new Vecino("Pedro Gutiérrez", 1, "La pared del pasillo está desconchada"));

        portal2.addVecino(new Vecino("Jorge Díaz", 2, "No se abre la puerta del garaje"));
        portal2.addVecino(new Vecino("Rocío González", 2, "La cerradura del portal está rota y la puerta está abierta"));

        portal3.addVecino(new Vecino("Raúl Gómez", 3, "El vecino del 3º tiene pájaros muy ruidosos"));
        portal3.addVecino(new Vecino("Carla Jiménez", 3, "El vecino del 3º tiene pájaros muy ruidosos"));

        portal1.echarSolicitudes(buzon);
        portal2.echarSolicitudes(buzon);
        portal3.echarSolicitudes(buzon);

        buzon.printSolicitudes();
    }
}
