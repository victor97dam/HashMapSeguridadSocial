package HSS;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private double salario;
    private String numSS;

    public Persona(String dni, String numSS, String nombre, String apellidos, int edad, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
        this.numSS = numSS;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNumSS() {
        return numSS;
    }

    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", NumSeguridadSocial='" + numSS + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}' + System.lineSeparator();
    }
}