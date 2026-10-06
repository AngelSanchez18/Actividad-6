package modelo;

public class Ejemplar extends Libro{
    private String codigo;
    private EstadoEjemplar estado;

    public Ejemplar(String codigo, String titulo, String autor){
        super(titulo, autor);
        this.codigo = codigo;
        this.estado = EstadoEjemplar.DISPONIBLE;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public EstadoEjemplar getEstado(){
        return this.estado;
    }

    public void setEstado(EstadoEjemplar estado) {
        this.estado = estado;
    }
}