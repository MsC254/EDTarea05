/**
 * Representa a un cliente con información sobre si es VIP, su nombre e ID.
 */
public class Cliente {
    private boolean esVip;
    private String nombre;
    private int id;

    /**
     * Constructor para crear un cliente con los atributos proporcionados.
     *
     * @param esVip Indica si el cliente es VIP.
     * @param nombre El nombre del cliente.
     * @param id El ID del cliente.
     */
    public Cliente(boolean esVip, String nombre, int id) {
        this.esVip = esVip;
        this.nombre = nombre;
        this.id = id;
    }

    /**
     * Obtiene el estado VIP del cliente.
     *
     * @return true si el cliente es VIP, false en caso contrario.
     */
    public boolean isEsVip() {
        return esVip;
    }

    /**
     * Establece el estado VIP del cliente.
     *
     * @param esVip El nuevo estado VIP del cliente.
     */
    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre El nuevo nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el ID del cliente.
     *
     * @return El ID del cliente.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del cliente.
     *
     * @param id El nuevo ID del cliente.
     */
    public void setId(int id) {
        this.id = id;
    }
}
