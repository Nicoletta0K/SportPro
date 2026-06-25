package entrenamientos;

import participantes.Participante;

public class Asistencia extends Entrenamiento {
    private Participante participante;
    private boolean presente;

    public Asistencia(Entrenamiento entrenamiento, Participante participante, boolean presente) {
        super(entrenamiento.getFecha(), entrenamiento.getHoraInicio(), 
              entrenamiento.getDuracionHoras(), entrenamiento.getDisciplina());
        this.participante = participante;
        this.presente = presente;
    }

    public Participante getParticipante() {
        return participante;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    @Override
    public String toString() {
        return "Asistencia{" +
                "participante=" + participante.getNombre() +
                ", presente=" + presente +
                ", " + super.toString() +
                '}';
    }
}