package com.politecnicomalaga.singleton;

import java.util.ArrayList;
import java.util.List;

public class Buzon {
    private List<String> solicitudes;
    private static Buzon instanciaBuzon = null;

    public Buzon(){
        solicitudes = new ArrayList<>();
    }

    public static Buzon getInstance(){
        if (instanciaBuzon == null)
            instanciaBuzon = new Buzon();
        return instanciaBuzon;
    }

    public void echar(String solicitud) {
        solicitudes.add(solicitud);
    }

    public List<String> getSolicitudes(){
        return solicitudes;
    }

    public void printSolicitudes()
    {
        for(String solicitud : getSolicitudes())
        {
            System.out.println(solicitud);
        }
    }
}
