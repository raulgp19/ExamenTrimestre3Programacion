package com.politecnicomalaga.singleton;

import java.util.ArrayList;
import java.util.List;

public class Buzon {
    private List<String> solicitudes;

    public Buzon(){
        solicitudes = new ArrayList<>();
    }

    public void echar(String solicitud) {
        solicitudes.add(solicitud);
    }

    public List<String> getSolicitudes(){
        return solicitudes;
    }

}
