package Disciplina;
import personas.Persona;
public class DisciplinaDep {
    public enum Categoria {
        INFANTIL,
        JUVENIL,
        ADULTA
    }
    private String nombre;

    private String categoria;
    private int capacidadMaxima;
    private int cantidadParticipantes;
    private Categoria categoria;
    private int capacidadMaxima;
    private final Persona[] participantes;
    private int cantidadParticipantes;
    public DisciplinaDep(String nombre, Categoria categoria, int capacidadMaxima) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.capacidadMaxima = capacidadMaxima;
        this.participantes = new Persona[capacidadMaxima];
        this.cantidadParticipantes = 0;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCategoria() {
    public Categoria getCategoria() {
        return categoria;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadParticipantes() {
        return cantidadParticipantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCategoria(String categoria) {
        if (categoria.equalsIgnoreCase("Infantil") ||
            categoria.equalsIgnoreCase("Juvenil") ||
            categoria.equalsIgnoreCase("Adulta")){
            
        this.categoria = categoria.toLowerCase();
    }else{
        System.out.println("Categoria invalida");
      }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public boolean agregarParticipante(Persona p) {
        if (cantidadParticipantes < capacidadMaxima) {
            participantes[cantidadParticipantes] = p;
            cantidadParticipantes++;
            return true;
        }
        return false;
    }
    public DisciplinaDep(String nombre, String categoria, int capacidadMaxima, int cantidadParticipantes) {
        this.nombre = nombre;
        setCategoria(categoria);
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadParticipantes = 0;
    }
    
    public boolean tieneEspaciosDisponibles() {
        return cantidadParticipantes < capacidadMaxima;
    }
    
    public boolean capacidadLlena() {
        return cantidadParticipantes >= capacidadMaxima;
    }
    
    public int obtenerCantidadParticipantes() {
        return cantidadParticipantes;
    }

}

    public boolean tieneEspaciosDisponibles() {
        return cantidadParticipantes < capacidadMaxima;
    }

    public boolean capacidadLlena() {
        return cantidadParticipantes >= capacidadMaxima;
    }

    public int obtenerCantidadParticipantes() {
        return cantidadParticipantes;
    }

    public void mostrarParticipantes() {
        for (int i = 0; i < cantidadParticipantes; i++) {
            System.out.println(participantes[i]);
        }
    }
}