package personas;
import java.time.Period;
import java.time.LocalDate;

public abstract class Persona {
    protected String identificacion;
    protected String nombre;
    protected LocalDate fechaNacimiento;
    public int telefono;

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }
    public int getEdad(){
        Period Edad = Period.between(fechaNacimiento, LocalDate.now());
        return Edad.getYears();
    }

    public Persona(String identificacion, String nombre, LocalDate fechaNacimiento, int telefono) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }
    
}
