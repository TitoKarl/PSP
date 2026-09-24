package org.example;
import javax.xml.catalog.Catalog;
import java.util.ArrayList; // Herramientas nativas para listar elasticas
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        System.out.println("--- INICIANDO UDITVERSUM ---");
        // MALA PRACTICA: Toda la logica de negocio tirada al Main.
        // los diamantes <> obliga a que la lista solo acepte episodios
        ArrayList<Episodio> catalogo = new ArrayList();

        catalogo.add(new Episodio("Diseño 3D - Intro", 45));
        catalogo.add(new Episodio("Animacion",60));
        catalogo.add(new Episodio("Texturas", 50));
        catalogo.add(new Episodio("Nombre1", 60));
        catalogo.add(new Episodio("Nombre2", 60));
        catalogo.add(new Episodio("Nombre3", 60));
        catalogo.add(new Episodio("Nombre4", 60));
        catalogo.add(new Episodio("Nombre5", 60));

        // 2 MEDICION DE TIEMPO
        // Usamos 'long' por que los milisegundos son desde 1970 forman un numero
        // tan gigantesco que no cabe en la memoria int nomral

        long inicio = System.currentTimeMillis();

        //3. BUCLE FOR EACH "Por cada episodio dentro del catalogo"
        for (Episodio ep : catalogo) {
            ep.procesar(); //Aqui ocurre el bloqueo de 2 s
        }

        long fin = System.currentTimeMillis();

        //4 RESULTADO: Restamos el fin menos el inicio y dividimos entre mil (segundos)

        long totalSegundos = (fin - inicio) / 1000;

        System.out.println("Tiempo total: " + totalSegundos + " segundos de bloqueo");
    }
}