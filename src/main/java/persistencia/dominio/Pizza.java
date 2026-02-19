package persistencia.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una Pizza del menú.
 *
 * <p>
 * Contiene información general de la pizza y una lista de ingredientes
 * asociados.</p>
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public class Pizza {

    /**
     * Identificador único de la pizza.
     */
    private int idPizza;

    /**
     * Nombre de la pizza.
     */
    private String nombre;

    /**
     * Tamaño de la pizza.
     */
    private String tamanio;

    /**
     * Descripción de la pizza.
     */
    private String descripcion;

    /**
     * Precio base de la pizza.
     */
    private double precio;

    /**
     * Lista de ingredientes de la pizza.
     */
    private List<PizzaIngrediente> ingredientes;

    /**
     * Constructor por omisión.
     */
    public Pizza() {
    }

    /**
     * Constructor completo con identificador.
     *
     * @param idPizza identificador de la pizza
     * @param nombre nombre de la pizza
     * @param tamanio tamaño de la pizza
     * @param descripcion descripción
     * @param precio precio base
     */
    public Pizza(int idPizza, String nombre, String tamanio,
            String descripcion, double precio) {
        this.idPizza = idPizza;
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.descripcion = descripcion;
        this.precio = precio;
        this.ingredientes = new ArrayList<>();
    }

    /**
     * Constructor sin identificador.
     *
     * @param nombre nombre de la pizza
     * @param tamanio tamaño de la pizza
     * @param descripcion descripción
     * @param precio precio base
     */
    public Pizza(String nombre, String tamanio,
            String descripcion, double precio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.descripcion = descripcion;
        this.precio = precio;
        this.ingredientes = new ArrayList<>();
    }

    /**
     * @return identificador de la pizza
     */
    public int getIdPizza() {
        return idPizza;
    }

    /**
     * @param idPizza nuevo identificador
     */
    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
    }

    /**
     * @return nombre de la pizza
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return tamaño de la pizza
     */
    public String getTamanio() {
        return tamanio;
    }

    /**
     * @param tamanio nuevo tamaño
     */
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * @return descripción de la pizza
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion nueva descripción
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return precio base
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio nuevo precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return lista de ingredientes
     */
    public List<PizzaIngrediente> getIngredientes() {
        return ingredientes;
    }
}
