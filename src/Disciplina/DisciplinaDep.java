package Disciplina;
import personas.Persona;
public class DisciplinaDep {
    public enum Categoria {
        INFANTIL,
        JUVENIL,
        ADULTA
    }
    private String nombre;
    private Categoria categoria;
    private int capacidadMaxima;
    private final Persona[] participantes;
    private int cantidadParticipantes;
    public DisciplinaDep(String nombre, Categoria categoria, int capacidadMaxima) {
        this.nombre = nombre;
        this.categoria = categoria;
        if (capacidadMaxima <= 0) {
            this.capacidadMaxima = 1;
        } else {
            this.capacidadMaxima = capacidadMaxima;
        }
        this.participantes = new Persona[this.capacidadMaxima];
        this.cantidadParticipantes = 0;
    }

    public String getNombre() {
        return nombre;
    }

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

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        if (capacidadMaxima > 0) {
            this.capacidadMaxima = capacidadMaxima;
        }
    }

    public boolean agregarParticipante(Persona p) {
        if (cantidadParticipantes < capacidadMaxima) {
            participantes[cantidadParticipantes] = p;
            cantidadParticipantes++;
            return true;
        }
        return false;
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

    public double porcentajeOcupacion() {
        return (cantidadParticipantes * 100.0) / capacidadMaxima;
    }

    @Override
    public String toString() {
        return "Disciplina: " + nombre +
                "\nCategoria: " + categoria +
                "\nCapacidad Maxima: " + capacidadMaxima +
                "\nParticipantes: " + cantidadParticipantes +
                "\nEspacios disponibles: " + (capacidadMaxima - cantidadParticipantes) +
                "\nOcupacion: "+ porcentajeOcupacion() + "%";
    }
}