package biblioteca;

import org.biblioteca.interfaces.Libro;

/**
 *
 * @author Coldr
 */
public class LibroDetalle implements Libro {

    int id, unidDisponibles;
    String titulo, descripcion;

    LibroDetalle() {
    }

    LibroDetalle(int id, String titulo, String descripcion, int unidDisponibles) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.unidDisponibles = unidDisponibles;
    }

    @Override
    public String getInformacion() {
        String detalle = titulo + descripcion + "-" + unidDisponibles + " unidades disponibles. (" + Integer.toString(id) + ")";
        return detalle;
    }

}
