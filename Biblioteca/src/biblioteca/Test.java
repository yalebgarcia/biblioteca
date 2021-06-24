package biblioteca;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.biblioteca.excepciones.LibroNoEncontradoException;
import org.biblioteca.interfaces.Libro;

/**
 *
 * @author Coldr
 */
public class Test {

    public static void main(String[] args) throws LibroNoEncontradoException {
        BusquedaLibro buscar = new BusquedaLibro();

        System.out.println("Buscar Libro: ");
        String entrada = "";
        Scanner leer = new Scanner(System.in);
        entrada = leer.nextLine();

        List<Libro> libros = buscar.buscar(entrada);
        for (Libro libro : libros) {
            System.out.println(libro.getInformacion());
        }
        
    }

}
