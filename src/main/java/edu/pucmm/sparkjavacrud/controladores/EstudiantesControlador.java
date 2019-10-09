package edu.pucmm.sparkjavacrud.controladores;

import edu.pucmm.sparkjavacrud.encapsulacion.Estudiante;
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

        get("/nuevo", (request, response) -> {
            return TemplatesControlador.renderFreemarker(null, "estudiantesNew.ftl");
        });

        post("/nuevo", (request, response) -> {
            EstudianteServicio.getInstancia().crearEstudiante(request.queryParams("matricula"),
                    request.queryParams("nombre"), request.queryParams("apellido"), request.queryParams("telefono"));
            response.redirect("/estudiantes/" + request.queryParams("matricula"));
            return "";
        });

        get("estudiantes/:matricula", (request, response) -> {
            Estudiante estudiante = EstudianteServicio.getInstancia().obtenerEstudiante(request.params("matricula"));
            Map<String, Object> obj = new HashMap<>();
            obj.put("estudiante", estudiante);
            return TemplatesControlador.renderFreemarker(obj, "estudiantesDetail.ftl");
        });

        get("estudiantes/eliminar/:matricula", (request, response) -> {
            EstudianteServicio.getInstancia().eliminarEstudiante(request.params("matricula"));
            response.redirect("/");
            return "";
        });

        get("estudiantes/editar/:matricula", (request, response) -> {
            return TemplatesControlador.renderFreemarker(null, "estudiantesEdit.ftl");
        });
    }
}
