package com.politecnicomalaga.singleton;

public class Vecino {
    private String nombre;
    private int portal;
    private String solicitud;

    public Vecino(String nombre, int portal, String solicitud){
        this.nombre = nombre;
        this.portal = portal;
        this.solicitud = solicitud;
    }

    public void echarSolicitud(Buzon buzon){
        buzon.echar(nombre + " del portal " + portal + " expone: " + solicitud);
    }

}
