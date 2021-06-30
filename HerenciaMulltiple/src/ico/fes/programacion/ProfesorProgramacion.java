
package ico.fes.programacion;

/**
 *
 * @author Saul
 */
public class ProfesorProgramacion extends Profesor implements Programador{
    private int anosExperiencia;
    private String lenguajeProgramacion;

    public ProfesorProgramacion() {
    }

    public ProfesorProgramacion(int anosExperiencia, String lenguajeProgramacion) {
        this.anosExperiencia = anosExperiencia;
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public ProfesorProgramacion(int anosExperiencia, String lenguajeProgramacion, String carrera, int antiguedad) {
        super(carrera, antiguedad);
        this.anosExperiencia = anosExperiencia;
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public ProfesorProgramacion(int anosExperiencia, String lenguajeProgramacion, String carrera, int antiguedad, String nombre, int eddad) {
        super(carrera, antiguedad, nombre, eddad);
        this.anosExperiencia = anosExperiencia;
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
    
    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString() + "ProfesorProgramacion{" + "anosExperiencia=" + anosExperiencia + ", lenguajeProgramacion=" + lenguajeProgramacion + '}';
    }

    @Override
    public int programar() {
        System.out.println("Programando en :\n" + this.lenguajeProgramacion);
        return 2;
    }

    @Override
    public void probrarCodigo() {
        System.out.println("Probando codigo en :\n" + this.lenguajeProgramacion);
    }
    
    
}
