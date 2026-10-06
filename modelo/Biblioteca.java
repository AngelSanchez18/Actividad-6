package modelo;
import java.util.*;

public class Biblioteca{
    private String nombre;
    private ArrayList<Usuario> lista = new ArrayList<>();

    Biblioteca(String nombre){
        this.nombre = nombre;
    }

    public void agregarUsuario(Usuario usuario){
        lista.add(usuario);
    }

    public String getNombre(){
        return this.nombre;
    }
}