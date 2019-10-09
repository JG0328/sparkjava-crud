package edu.pucmm.sparkjavacrud.servicios;

import edu.pucmm.sparkjavacrud.encapsulacion.Estudiante;

import java.util.ArrayList;

public class EstudianteServicio {
    private static EstudianteServicio estudianteServicio;

    private ArrayList<Estudiante> misEstudiantes;

    private EstudianteServicio() {

    }

    public static EstudianteServicio getInstancia() {
        if (estudianteServicio == null)
            estudianteServicio = new EstudianteServicio();
        return estudianteServicio;
    }

    public void iniciarEstudiantes() {
        misEstudiantes = new ArrayList<Estudiante>();
    }

    public void crearEstudiante(int matricula, String nombre, String apellido, String telefono) {
        Estudiante estudiante = new Estudiante(matricula, nombre, apellido, telefono);
        misEstudiantes.add(estudiante);
    }

    public Estudiante obtenerEstudiante(int matricula) {
        Estudiante estudiante = null;
        boolean encontrado = false;

        for (Estudiante est : misEstudiantes) {
            if (est.getMatricula() == matricula && !encontrado) {
                estudiante = est;
                encontrado = true;
            }
        }

        return estudiante;
    }

    public void eliminarEstudiante(int matricula) {
        Estudiante estudiante = obtenerEstudiante(matricula);

        if (estudiante != null) {
            misEstudiantes.remove(estudiante);
        }
    }
}
