package biblioteca;
import modelo.*;
import servicio.*;
import java.time.LocalDate;

/**
 * @author Mejia Avila Ingrid Jaqueline
 * @author Sanchez Ramirez Angel ALberto
 * @version 1.0
 * @since 06-10-2026
/*/

public class biblioteca{
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Ejemplar ejemplar1 = new Ejemplar("123",  "Mi maravillosa", "Ingrid Mejia");
        Usuario usuario = new Usuario("Alan", "67");
        Prestamo prestamo1 = new Prestamo(today, today.plusDays(7), ejemplar1, usuario);
        System.out.println(prestamo1.realizarPrestamo());
    }
}