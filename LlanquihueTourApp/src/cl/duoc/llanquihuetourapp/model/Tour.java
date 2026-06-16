package cl.duoc.llanquihuetourapp.model;

/**
 * Clase que representa un tour turístico.
 * Contiene información como nombre, destino, fecha, precio y tipo de tour.
 */
public class Tour {
    private String nombre;
    private String destino;
    private String fecha;
    private double precio;
    private String tipo;

    /**
     * Constructor de la clase Tour.
     * Permite crear un nuevo tour con todos sus datos principales.
     *
     * @param nombre nombre del tour
     * @param destino lugar donde se realiza el tour
     * @param fecha fecha en la que se realiza el tour
     * @param precio precio del tour
     * @param tipo tipo o categoría del tour
     */
    public Tour(String nombre, String destino, String fecha,
                double precio, String tipo) {
        this.nombre = nombre;
        this.destino = destino;
        this.fecha = fecha;
        this.precio = precio;
        this.tipo = tipo;
    }

    /**
     * Obtiene el nombre del tour.
     *
     * @return nombre del tour
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el destino del tour.
     *
     * @return destino del tour
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Obtiene la fecha del tour.
     *
     * @return fecha del tour
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Obtiene el precio del tour.
     *
     * @return precio del tour
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene el tipo de tour.
     *
     * @return tipo del tour
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Modifica el nombre del tour.
     *
     * @param nombre nuevo nombre del tour
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Modifica el destino del tour.
     *
     * @param destino nuevo destino del tour
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Modifica la fecha del tour.
     *
     * @param fecha nueva fecha del tour
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Modifica el precio del tour.
     *
     * @param precio nuevo precio del tour
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Modifica el tipo de tour.
     *
     * @param tipo nuevo tipo del tour
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve una representación en texto del objeto Tour.
     *
     * @return texto con los datos del tour
     */
    @Override
    public String toString() {
        return "Tour{" +
                "nombre=" + nombre +
                ", destino=" + destino +
                ", fecha=" + fecha + "\n" +
                ", precio=" + precio +
                ", tipo=" + tipo +
                '}';
    }

}