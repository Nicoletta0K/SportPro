package entrenadores;
import java.time.LocalDate;
import personas.Persona;
import Disciplina.DisciplinaDep;
class Entrenador extends Persona{
    private DisciplinaDep disciplina;
    private int experiencia;
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public Entrenador(String identificacion, String nombre, LocalDate fechaNacimiento, int telefono, DisciplinaDep disciplina, int experiencia) {
        super(identificacion, nombre, fechaNacimiento, telefono);
        this.disciplina=disciplina;
        this.experiencia=experiencia;
    }
    @Override
    public String toString() {
        return "Entrenador{" + "experiencia=" + experiencia + "disciplina=" + disciplina.getNombre() + "}";
    }
}