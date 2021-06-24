package biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.biblioteca.excepciones.LibroNoEncontradoException;
import org.biblioteca.interfaces.Buscar;
import org.biblioteca.interfaces.Libro;

/**
 *
 * @author Coldr
 */
public class BusquedaLibro implements Buscar {

    List<LibroDetalle> listaLibros;

    public BusquedaLibro() {
        this.listaLibros = Arrays.asList(new LibroDetalle(150, "La Odisea", "(Poema épico griego compuesto por 24 cantos)", 100),
                new LibroDetalle(151, "La Divina Comedia", "(Poema escrito por Dante Alighieri)", 100),
                new LibroDetalle(152, "El Llano en Llamas", "(Compilación de cuentos escritos por Juan Rulfo)", 100),
                new LibroDetalle(153, "Los Cuatro Acuerdos", "(Un libro de sabiduría tolteca: Miguel Ruiz)", 120),
                new LibroDetalle(154, "La Odisea 2", "(Poema épico griego compuesto por 24 cantos)", 100));
    }

    @Override
    public List<Libro> buscar(String... strings) throws LibroNoEncontradoException {
        List<Libro> resultado = new ArrayList();

        for (LibroDetalle libro : this.listaLibros) {//primer elemento es el iterador y el segundo es el listado que se va a iterar
            if (libro.getInformacion().contains(strings[0])) {
                resultado.add(libro);
            }
        }
        if (resultado.isEmpty()) {
            throw new LibroNoEncontradoException("Libro no encontrado");
        }
        return resultado;
    }
}
