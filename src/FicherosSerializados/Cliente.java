package FicherosSerializados;

import java.io.Serializable;

public class Cliente implements Serializable {

    private String nombre = "";
    private int edad;

    /**
     *
     * @param nombre
     * @param edad
     */
    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
