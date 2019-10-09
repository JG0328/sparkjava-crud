package edu.pucmm.sparkjavacrud.servicios;

import edu.pucmm.sparkjavacrud.encapsulacion.Estudiante;

import java.util.ArrayList;

public class EstudianteServicio {
    private static EstudianteServicio estudianteServicio;

    private ArrayList<Estudiante> misEstudiantes = new ArrayList<Estudiante>();

    private EstudianteServicio() {

    }

    public static EstudianteServicio getInstancia() {
        if (estudianteServicio == null)
            estudianteServicio = new EstudianteServicio();
        return estudianteServicio;
    }

    public void crearEstudiante(String matricula, String nombre, String apellido, String telefono) {
        Estudiante estudiante = new Estudiante(matricula, nombre, apellido, telefono);
        misEstudiantes.add(estudiante);
    }

    public Estudiante obtenerEstudiante(String matricula) {
        Estudiante estudiante = null;
        boolean encontrado = false;

        for (Estudiante est : misEstudiantes) {
            if (est.getMatricula().equalsIgnoreCase(matricula) && !encontrado) {
                estudiante = est;
                encontrado = true;
            }
        }

        return estudiante;
    }

    public void eliminarEstudiante(String matricula) {
        Estudiante estudiante = obtenerEstudiante(matricula);

        if (estudiante != null) {
            misEstudiantes.remove(estudiante);
        }
    }

    public ArrayList<Estudiante> getMisEstudiantes() {
        return misEstudiantes;
    }

    public void setMisEstudiantes(ArrayList<Estudiante> misEstudiantes) {
        this.misEstudiantes = misEstudiantes;
    }
}
