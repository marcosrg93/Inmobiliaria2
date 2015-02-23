package es.marcos.inmobiliariacp;

import java.util.Comparator;


public class OrdenaTipos implements Comparator<Inmueble> {
    @Override
    public int compare(Inmueble j1, Inmueble j2) {
        if(j1.getTitulo().compareTo((j2.getTitulo()))>0){
            return 1;
        }
        if(j1.getTitulo().compareTo((j2.getTitulo()))<0)
            return -1;
        return 0;
    }
}