package cl.duoc.llanquihuetourapp.app;

import cl.duoc.llanquihuetourapp.data.GestorDatos;
import cl.duoc.llanquihuetourapp.model.Tour;
import java.util.ArrayList;

/**
 * Clase principal de la aplicación LlanquihueTourApp.
 * Se encarga de iniciar el programa, cargar los datos y mostrar distintos listados de tours.
 */
public class Main {
    /**
     * Método principal del programa.
     * Carga los tours desde un archivo de texto y muestra diferentes filtros por consola.
     *
     * @param args argumentos recibidos desde la línea de comandos
     */
    public static void main(String[] args) {

        // Crea un gestor de datos para cargar los tours desde el archivo.
        GestorDatos gestor = new GestorDatos();

        // Carga la información de los tours desde el archivo ubicado en la carpeta resources.
        gestor.cargarDatos("resources/tours.txt");

        // Obtiene la lista de tours cargados.
        ArrayList<Tour> tours = gestor.getTours();

        // Muestra todos los tours cargados.
        System.out.println("\n---Lista de tours---");
        for (Tour t : tours) {
            System.out.println(t);
        }

        // Muestra los tours cuyo precio sea mayor a 30000.
        System.out.println("\n---Tours con precio mayor a 30000---");
        for (Tour tour : tours) {
            if (tour.getPrecio() > 30000) {
                System.out.println(tour);
            }
        }

        // Muestra los tours cuyo precio sea menor a 15000.
        System.out.println("\n---Tours con precio menor a 15000");
        for (Tour tour : tours) {
            if (tour.getPrecio() < 15000) {
                System.out.println(tour);
            }
        }

        // Muestra únicamente los tours de tipo gastronómico.
        System.out.println("\n---Tours gastronómicos---");
        for (Tour tour : tours) {
            if ("Gastronómico".equalsIgnoreCase(tour.getTipo())) {
                System.out.println(tour);
            }
        }
    }
}