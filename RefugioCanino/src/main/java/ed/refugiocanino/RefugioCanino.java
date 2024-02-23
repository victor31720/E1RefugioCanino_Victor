
package ed.refugiocanino;

public class RefugioCanino {

    private String[] nombresPerros;
    private String[] razasPerros;
    private int cantidadPerros;

    public RefugioCanino() {
        nombresPerros = new String[100];
        razasPerros = new String[100];
        cantidadPerros = 0;
    }

    // Método para agregar un perro al refugio
    public void agregarPerro(String nombre, String raza) {
        nombresPerros[cantidadPerros] = nombre;
        razasPerros[cantidadPerros] = raza;
        cantidadPerros++;
    }

    // Método para mostrar la lista de perros en el refugio
    public void mostrarPerros() {
        for (int i = 0; i < cantidadPerros; i++) {
            System.out.println("Nombre: " + nombresPerros[i] + ", Raza: " + razasPerros[i]);
        }
    }

    // Método para obtener el número de perros en el refugio
    public int obtenerNumeroDePerros() {
        return cantidadPerros;
    }
}
