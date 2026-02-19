package persistencia.dominio;

/**
 * Clase que representa la relación entre una Pizza y un Ingrediente.
 *
 * <p>
 * Modela una relación muchos a muchos, permitiendo almacenar información
 * adicional como la cantidad y unidad del ingrediente utilizado en una
 * pizza.</p>
 *
 * @author Brian Kaleb Sandoval Rodríguez - 00000262741
 * @author Alejandra Leal Armenta - 00000262719
 * @author Paulina Michel Guevara Cervantez - 00000262724
 */
public class PizzaIngrediente {

    /**
     * Pizza asociada al ingrediente.
     */
    private Pizza pizza;

    /**
     * Ingrediente utilizado en la pizza.
     */
    private Ingrediente ingrediente;

    /**
     * Cantidad utilizada del ingrediente.
     */
    private double cantidad;

    /**
     * Unidad de medida de la cantidad.
     */
    private String unidad;

    /**
     * Constructor por omisión.
     */
    public PizzaIngrediente() {
    }

    /**
     * Constructor que inicializa la relación Pizza–Ingrediente.
     *
     * @param pizza pizza asociada
     * @param ingrediente ingrediente utilizado
     * @param cantidad cantidad usada
     * @param unidad unidad de medida
     */
    public PizzaIngrediente(Pizza pizza, Ingrediente ingrediente,
            double cantidad, String unidad) {
        this.pizza = pizza;
        this.ingrediente = ingrediente;
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    /**
     * @return pizza asociada
     */
    public Pizza getPizza() {
        return pizza;
    }

    /**
     * @param pizza nueva pizza asociada
     */
    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    /**
     * @return ingrediente asociado
     */
    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    /**
     * @param ingrediente nuevo ingrediente
     */
    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    /**
     * @return cantidad utilizada
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad nueva cantidad
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return unidad de medida
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * @param unidad nueva unidad
     */
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
