<!doctype html>
<html>
<head>
    <title>Detalles del Estudiante</title>
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
        <h3>Detalles del Estudiante</h3>
    </div>
    <div class="row">
        <table class="table">
            <tr>
                <th>Matricula</th>
                <td>${estudiante.matricula}</td>
            </tr>
            <tr>
                <th>Nombre</th>
                <td>${estudiante.nombre}</td>
            </tr>
            <tr>
                <th>Apellido</th>
                <td>${estudiante.apellido}</td>
            </tr>
            <tr>
                <th>Telefono</th>
                <td>${estudiante.telefono}</td>
            </tr>
        </table>
    </div>
    <div class="row">
        <div class="col-md-12">
            <a href="/nuevo" class="btn btn-success">Nuevo Estudiante</a>
            <a href="/estudiantes/editar/${estudiante.idEstudiante}" class="btn btn-secondary">Editar</a>
            <a href="/estudiantes/eliminar/${estudiante.idEstudiante}" class="btn btn-danger">Eliminar</a>
        </div>
    </div>
</div>
</body>
</html>