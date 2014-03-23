<%-- 
    Document   : menu
    Created on : 16-mar-2014, 18:18:59
    Author     : Lucas
--%>

<header>
    <%@taglib prefix="s" uri="/struts-tags"%>
    <link href="../css/dashboard.css" rel="stylesheet">
    <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">GCH</a>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">Dashboard</a></li>
                    <li><a href="#">Settings</a></li>
                    <li><a href="#">Profile</a></li>
                    <li><a href="logout">Logout</a></li>
                        <!--<s:a action="logout"/>-->
                    
                </ul>
                <form class="navbar-form navbar-right">
                    <input type="text" class="form-control" placeholder="Search...">
                </form>
            </div>
        </div>
    </div>
</header>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="listarProfesores">Profesores</a></li>
                <li><a href="#">Laboratorios</a></li>
                <li><a href="#">Frecuencias</a></li>
                <li><a href="#">Programas</a></li>
                <li><a href="#">Cursos</a></li>
            </ul>            
        </div>

    </div>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
