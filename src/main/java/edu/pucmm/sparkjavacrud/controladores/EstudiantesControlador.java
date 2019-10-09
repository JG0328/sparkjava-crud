package edu.pucmm.sparkjavacrud.controladores;

import edu.pucmm.sparkjavacrud.servicios.EstudianteServicio;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class EstudiantesControlador {
    public void aplicarRutas() {
        get("/", (request, response) -> {
            Map<String, Object> misEstudiantes = new HashMap<>();
            misEstudiantes.put("estudiantes", EstudianteServicio.getInstancia().getMisEstudiantes());
            return TemplatesControlador.renderFreemarker(misEstudiantes, "estudiantesList.ftl");
        });
    }
}
