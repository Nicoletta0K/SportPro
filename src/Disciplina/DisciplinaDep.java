package Disciplina;

public final class DisciplinaDep{
    private String nombre;

    private String categoria;
    private int capacidadMaxima;
    private int cantidadParticipantes;
    private Categoria categoria;
    private int capacidadMaxima;
    private int cantidadParticipantes;
    public enum Categoria {
    Infantil,
    Juvenil,
    Adulta
    }
     public DisciplinaDep(String nombre, Categoria categoria, int capacidadMaxima) {
        this.nombre = nombre;
        setCategoria(categoria);
        this.capacidadMaxima = capacidadMaxima;
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

    public void setCantidadParticipantes(int cantidadParticipantes) {
        this.cantidadParticipantes = cantidadParticipantes;
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
}