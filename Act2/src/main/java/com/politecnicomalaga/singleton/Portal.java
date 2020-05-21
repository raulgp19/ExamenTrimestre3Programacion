package com.politecnicomalaga.singleton;

import java.util.ArrayList;
import java.util.List;

public class Portal {

    private int numero;
    private List<Vecino> vecinos;

    public Portal(int numero){
        this.numero = numero;
        vecinos = new ArrayList<>();
    }

    public void addVecino(Vecino vecino){
        vecinos.add(vecino);
    }

    public void echarSolicitudes(Buzon buzon){
        for (Vecino vecino : vecinos) {
            vecino.echarSolicitud(buzon);
        }
    }

}
