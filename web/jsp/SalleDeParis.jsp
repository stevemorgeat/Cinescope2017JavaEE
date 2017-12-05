<%--
    Document : ResultatRecherche.jsp
    Author : pascal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/Cinescope2017Web/css/main.css" />
        <link rel="stylesheet" type="text/css" href="/Cinescope2017Web/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="/Cinescope2017Web/jquery/jquery-ui.css" />
        <script src="/Cinescope2017Web/jquery/jquery.js"></script>
        <script src="/Cinescope2017Web/jquery/jquery-ui.js"></script>
        <title>ResultatRecherche.jsp</title>
    </head>

    <body>
        <div class="row"><!--  header-->
            <%@ include file="Header.jsp" %>           
        </div><!--  FIN  header-->
        <div class="row"><!--Nav-->
            <div class="col-md-2"><!--2/12-->
                <%@ include file="Nav.jsp" %>
            </div><!--FIN Nav-->
            <div class="col-md-offset-1 col-md-8">

                <article id="articleAccueil">
                    <h2>Les Salle de Paris</h2>

                    <div class="container-fluid">
                        <div class="col-xs-12">
                            <div class="table-responsive">
                                <table class="table table-bordered table-hover" id="cinemas">
                                    <thead>
                                        <tr>
                                            <th>Cinemas</th>
                                            <th>Metro</th>
                                            <th>Code Arrondissement</th>
                                            <th>Arrondissement</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="salle" items="${SallesDeParis}" >
                                            <tr>
                                                <td>${salle.nom_cinema}</td>
                                                <td>${salle.nom_station_metro}</td>
                                                <td>${salle.code_arrondissement}</td>
                                                <td>${salle.nom_arrondissement}</td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div><!--end of .table-responsive-->
                        </div>
                    </div>
                </article>
            </div>
        </div>


        <div class="row">
            <div class="col-lg-md">
                <%@ include file="Footer.jsp" %>
            </div>
        </div>
        <script src="/Cinescope2017Web/js/bootstrap.min.js"></script>
        <script src="/Cinescope2017Web/js/main.js"></script>
    </body>

</html>
