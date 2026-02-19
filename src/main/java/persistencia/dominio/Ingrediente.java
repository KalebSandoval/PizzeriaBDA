package persistencia.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un Ingrediente del sistema.
 *
 * <p>
 * Un ingrediente puede pertenecer a varias pizzas.</p>
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public class Ingrediente {

    /**
     * Identificador del ingrediente.
     */
    private int idIngrediente;

    /**
     * Nombre del ingrediente.
     */
    private String nombre;

    /**
     * Tipo del ingrediente.
     */
    private String tipo;

    /**
     * Costo del ingrediente.
     */
    private double costo;

    /**
     * Pizzas que utilizan este ingrediente.
     */
    private List<PizzaIngrediente> pizzas;

    /**
     * Constructor por omisión.
     */
    public Ingrediente() {
    }

    /**
     * Constructor completo.
     *
     * @param idIngrediente identificador
     * @param nombre nombre del ingrediente
     * @param tipo tipo
     * @param costo costo
     */
    public Ingrediente(int idIngrediente, String nombre,
            String tipo, double costo) {
        this.idIngrediente = idIngrediente;
        this.nombre = nombre;
        this.tipo = tipo;
        this.costo = costo;
        this.pizzas = new ArrayList<>();
    }

    /**
     * Constructor sin identificador.
     *
     * @param nombre nombre del ingrediente
     * @param tipo tipo
     * @param costo costo
     */
    public Ingrediente(String nombre, String tipo, double costo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.costo = costo;
        this.pizzas = new ArrayList<>();
    }

    /**
     * @return identificador
     */
    public int getIdIngrediente() {
        return idIngrediente;
    }

    /**
     * @param idIngrediente nuevo identificador
     */
    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    /**
     * @return nombre
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
     * @return tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo nuevo tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param costo nuevo costo
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * @return pizzas asociadas
     */
    public List<PizzaIngrediente> getPizzas() {
        return pizzas;
    }
}
