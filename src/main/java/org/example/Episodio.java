package org.example;

public class Episodio {
    private String titulo;
    private int duracion;

    public Episodio(String titulo, int duracion){
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public void procesar(){
        System.out.println("Iniciando procesamiento de: " + this.titulo + " ...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error al procesar el epsiodio: ");
        }
        System.out.println("Completado: " + this.titulo);
    }

}
