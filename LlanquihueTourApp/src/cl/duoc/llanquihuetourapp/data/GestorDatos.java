package cl.duoc.llanquihuetourapp.data;

import cl.duoc.llanquihuetourapp.model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase encargada de gestionar la carga de datos de los tours.
 * Lee la información desde un archivo de texto y la almacena en una lista.
 */
public class GestorDatos {
    private ArrayList<Tour> tours;

    /**
     * Constructor de la clase GestorDatos.
     * Inicializa la lista donde se almacenarán los tours cargados.
     */
    public GestorDatos() {
        this.tours = new ArrayList<>();
    }

    /**
     * Carga los datos de los tours desde un archivo de texto.
     * Cada línea del archivo debe tener el siguiente formato:
     * nombre;destino;fecha;precio;tipo
     *
     * @param archivo ruta del archivo que contiene los datos de los tours
     */
    public void cargarDatos(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int contador = 0;

            // Lee el archivo línea por línea hasta llegar al final.
            while ((linea = br.readLine()) != null) {
                // Verifica que la línea no esté vacía antes de procesarla.
                if (!linea.trim().isEmpty()) {
                    // Separa los datos usando el punto y coma como delimitador.
                    String[] datos = linea.split(";");

                    // Valida que la línea tenga exactamente los 5 datos necesarios.
                    if (datos.length == 5) {
                        String nombre = datos[0];
                        String destino = datos[1];
                        String fecha = datos[2];
                        double precio = Double.parseDouble(datos[3]);
                        String tipo = datos[4];

                        // Crea un objeto Tour con los datos leídos desde el archivo.
                        Tour tour = new Tour(nombre, destino, fecha,
                                precio, tipo);

                        // Agrega el tour creado a la lista de tours.
                        tours.add(tour);
                        contador++;
                    }
                }
            }

            System.out.println("Se cargaron " + contador + " tours correctamente.");

        } catch (IOException e) {
            // Captura errores relacionados con la lectura del archivo.
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Captura errores cuando el precio no tiene un formato numérico válido.
            System.out.println("Error en formato de número: " + e.getMessage());
        }
    }

    /**
     * Obtiene la lista de tours cargados desde el archivo.
     *
     * @return lista de tours
     */
    public ArrayList<Tour> getTours() {
        return tours;

    }
}