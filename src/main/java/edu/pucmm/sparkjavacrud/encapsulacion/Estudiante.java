package edu.pucmm.sparkjavacrud.encapsulacion;

import edu.pucmm.sparkjavacrud.servicios.EstudianteServicio;

public class Estudiante {
    private int idEstudiante;
    private String matricula;
    private String nombre;
    private String apellido;
    private String telefono;

    public Estudiante() {

    }

    public Estudiante(String matricula, String nombre, String apellido, String telefono) {
        this.idEstudiante = EstudianteServicio.getInstancia().getMisEstudiantes().size() + 1;
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return String.format("Matricula: %d, Nombre: %s, Apellido: %s, Telefono: %s", matricula, nombre, apellido, telefono);
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
