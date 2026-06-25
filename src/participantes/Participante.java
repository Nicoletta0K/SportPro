package participantes;
import java.time.LocalDate;
import personas.Persona;
public class Participante extends Persona {
    private Disciplina disciplinaInscrita; 
    public Participante(String identificacion, String Nombre, LocalDate fechaNacimiento, String telefono, Disciplina disciplinaInscrita) {
        super(identificacion, nombre, fechaNacimiento, telefono);
        this.disciplinaInscrita = disciplinaInscrita;
    }
    public Disciplina getDisciplinaInscrita() {
        return disciplinaInscrita;
    }
    public void setDisciplinaInscrita(Disciplina disciplinaInscrita) {
        this.disciplinaInscrita = disciplinaInscrita;
    }
    public String toString() {
        return "Participante: " + getNombre() + " | ID: " + getIdentificacion() + " | Disciplina: " + disciplinaInscrita.getNombre();
    }
}
