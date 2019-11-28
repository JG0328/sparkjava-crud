package edu.pucmm.sparkjavacrud;
import edu.pucmm.sparkjavacrud.controladores.EstudiantesControlador;
import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        port(getHerokuAssignedPort());

        staticFiles.location("/publico");

        new EstudiantesControlador().aplicarRutas();
    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567;
    }
}
