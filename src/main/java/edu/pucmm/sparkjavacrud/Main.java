package edu.pucmm.sparkjavacrud;

import edu.pucmm.sparkjavacrud.encapsulacion.Estudiante;

import java.util.ArrayList;

import static spark.Spark.staticFiles;

public class Main {
    public static void main(String[] args) {
        staticFiles.location("/publico");
        
    }
}
