package servicio;
import java.time.LocalDate;
import modelo.*;

public class Prestamo{
    private Ejemplar ejemplar;
    private Usuario usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion, Ejemplar ejemplar, Usuario usuario){
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.ejemplar = ejemplar;
        this.usuario = usuario;
    }

    public String realizarPrestamo(){
        if(ejemplar.getEstado() == EstadoEjemplar.DISPONIBLE){
            this.ejemplar.setEstado(EstadoEjemplar.PRESTADO);
            return "Préstamo realizado con éxito.";
        } else {
            return "El ejemplar no está disponible para préstamo.";
        }
    }

    public void devolver(){
        if(ejemplar.getEstado() != null){
            this.ejemplar.setEstado(EstadoEjemplar.DISPONIBLE);
        }
    }

    public boolean estaVencido(){
        if(ejemplar.getEstado() == EstadoEjemplar.PRESTADO){
            LocalDate today = LocalDate.now();
            return today.isAfter(fechaDevolucion);
        }
        return false;
    }
}