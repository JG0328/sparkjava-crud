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
            Estudiante estudiante = EstudianteServicio.getInstancia().crearEstudiante(request.queryParams("matricula"),
                    request.queryParams("nombre"), request.queryParams("apellido"), request.queryParams("telefono"));
            response.redirect("/estudiantes/" + estudiante.getIdEstudiante());
            return "";
        });

        get("estudiantes/:id", (request, response) -> {
            Estudiante estudiante = EstudianteServicio.getInstancia().obtenerEstudiante(new Integer(request.params("id")));
            Map<String, Object> obj = new HashMap<>();
            obj.put("estudiante", estudiante);
            return TemplatesControlador.renderFreemarker(obj, "estudiantesDetail.ftl");
        });

        get("estudiantes/eliminar/:id", (request, response) -> {
            EstudianteServicio.getInstancia().eliminarEstudiante(new Integer(request.params("id")));
            response.redirect("/");
            return "";
        });

        get("estudiantes/editar/:id", (request, response) -> {
            Estudiante estudiante = EstudianteServicio.getInstancia().obtenerEstudiante(new Integer(request.params("id")));
            Map<String, Object> obj = new HashMap<>();
            obj.put("estudiante", estudiante);
            return TemplatesControlador.renderFreemarker(obj, "estudiantesEdit.ftl");
        });

        post("estudiantes/actualizar/:id", (request, response) -> {
            EstudianteServicio.getInstancia().actualizarEstudiante(new Integer(request.params("id")), request.queryParams("matricula"), request.queryParams("nombre"), request.queryParams("apellido"), request.queryParams("telefono"));
            response.redirect("/estudiantes/" + request.params("id"));
            return "";
        });
    }
}
