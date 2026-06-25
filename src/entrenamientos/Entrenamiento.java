package entrenamientos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import Disciplina.DisciplinaDep;
import participantes.Participante;

public class Entrenamiento {
    private LocalDate Fecha;
    private LocalTime horaInicio;
    private double duracionHoras;
    private DisciplinaDep disciplina;
    private ArrayList<Participante> asistentes;

    public Entrenamiento(LocalDate fecha, LocalTime horaInicio, double duracionHoras, DisciplinaDep disciplina) {
        this.Fecha = fecha;
        this.horaInicio = horaInicio;
        this.duracionHoras = duracionHoras;
        this.disciplina = disciplina;
        this.asistentes = new ArrayList<>();
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public DisciplinaDep getDisciplina() {
        return disciplina;
    }

    public ArrayList<Participante> getAsistentes() {
        return asistentes;
    }

    public void setFecha(LocalDate fecha) {
        this.Fecha = Fecha;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public void setDisciplina(DisciplinaDep disciplina) {
        this.disciplina = disciplina; 
        
    }

    public void registrarAsistencia(Participante participante) {
        if (!asistentes.contains(participante)) {
            asistentes.add(participante);
        }
    }
}