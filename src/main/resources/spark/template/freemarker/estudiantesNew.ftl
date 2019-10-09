<!doctype html>
<html>
<head>
    <title>Nuevo Estudiante</title>
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
            <h3>Crear nuevo Estudiante</h3>
        </div>
    </div>
    <div class="row margin-top-20">
        <div class="col-md-12">
            <form action="/nuevo" method="POST">
                <div class="form-group col-md-5">
                    <label class="col-form-label">Matricula</label>
                    <input name="matricula" type="text" placeholder="Matricula del estudiante" class="form-control"
                           required/>
                </div>
                <div class="form-group col-md-5">
                    <label class="col-form-label">Nombre</label>
                    <input name="nombre" type="text" placeholder="Nombre del estudiante" class="form-control" required/>
                </div>
                <div class="form-group col-md-5">
                    <label class="col-form-label">Apellido</label>
                    <input name="apellido" type="text" placeholder="Apellido del estudiante" class="form-control"
                           required/>
                </div>
                <div class="form-group col-md-5">
                    <label class="col-form-label">Telefono</label>
                    <input name="telefono" type="text" placeholder="Telefono del estudiante" class="form-control"
                           required/>
                </div>
                <div class="form-group col-md-5">
                    <div class="row">
                        <div class="col-md-6 text-left">
                            <a href="/" class="btn btn-dark">Cancelar</a>
                        </div>
                        <div class="col-md-6 text-right">
                            <button name="enviar" type="submit" class="btn btn-success">Crear</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>