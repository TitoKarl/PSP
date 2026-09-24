package org.example;

import java.util.ArrayList;

public class Plataforma {
    private ArrayList<Episodio> catalogo = new ArrayList<>();
    public Plataforma(String nombre, int duracion) {
        this.catalogo = new ArrayList<>();

        }
    public void agregarEpisodio(Episodio ep){
        catalogo.add(ep);
    }
    public void procesarCatalogo(){
        for (Episodio ep : catalogo){

        }
    }
}


