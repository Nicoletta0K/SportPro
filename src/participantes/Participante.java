package participantes;
import java.time.LocalDate;
import personas.Persona;
import Disciplina.DisciplinaDep; 

public class Participante extends Persona {
    private DisciplinaDep disciplinaInscrita;
   public Participante(String identificacion, String nombre, LocalDate fechaNacimiento, int telefono, DisciplinaDep disciplinaInscrita) {
        super(identificacion, nombre, fechaNacimiento, telefono);
        this.disciplinaInscrita = disciplinaInscrita;
    }
    public DisciplinaDep getDisciplinaInscrita() {
        return disciplinaInscrita;
    }
    public void setDisciplinaInscrita(DisciplinaDep disciplinaInscrita) {
        this.disciplinaInscrita = disciplinaInscrita;
    }

    @Override
    public String toString() {
        return "Participante: " + getNombre() + " | ID: " + getIdentificacion() + " | Disciplina: " + disciplinaInscrita.getNombre();
    }
}