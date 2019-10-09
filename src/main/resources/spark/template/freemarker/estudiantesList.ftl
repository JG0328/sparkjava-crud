<!doctype html>
<html>
<head>
    <title>Lista de Estudiantes</title>
    <link href="/css/bootstrap.css" rel="stylesheet">
    <link href="/css/miEstilo.css" rel="stylesheet">
    <script src="/js/jquery-3.4.1.min.js"></script>
    <script src="/js/bootstrap.js"></script>
</head>
<body>
<#--Navbar-->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Estudiantes</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/">Principal<span class="sr-only">(current)</span></a>
            </li>
        </ul>
    </div>
</nav>
<div class="container">
    <div class="row margin-top-20">
        <div class="col-md-12">
            <h3>Lista de Estudiantes</h3>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <a href="/nuevo" class="btn btn-success">Nuevo</a>
        </div>
    </div>
    <div class="row margin-top-20">
        <div class="col-md-12">
            <table class="table">
                <tr>
                    <th>Matricula</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Telefono</th>
                    <th>Acciones</th>
                </tr>
                <#list estudiantes as estudiante>
                    <tr>
                        <td>${estudiante.getMatricula()}</td>
                        <td>${estudiante.getNombre()}</td>
                        <td>${estudiante.getApellido()}</td>
                        <td>${estudiante.getTelefono()}</td>
                        <td>
                            <a href="estudiantes/${estudiante.getMatricula()}" class="btn btn-primary">Ver</a>
                            <a href="estudiantes/editar/${estudiante.getMatricula()}"
                               class="btn btn-primary">Actualizar</a>
                            <a href="estudiantes/eliminar/${estudiante.getMatricula()}"
                               class="btn btn-danger">Eliminar</a>
                        </td>
                    </tr>
                </#list>
            </table>
        </div>
    </div>
</div>
</body>
</html>