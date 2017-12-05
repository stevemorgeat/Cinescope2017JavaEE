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
            <div class="col-lg-8 col-lg-offset-1">
                <article id="articleHitParade">
                    <h2>Hit Parade du Public</h2>
                    <br>
                    <table border="1" class="table">
                        <thead>
                            <tr>
                                <th>Titre</th>
                                <th>Entrées de la semaine</th>
                                <th>Nombre de semaines</th>
                                <th>Total d'entrées</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="LHP" items="${tableau}">
                                <tr>
                                    <td>${LHP.lnom}</td>
                                    <td>${LHP.lentreeSe}</td>
                                    <td>${LHP.lsemaines}</td>
                                    <td>${LHP.lentreeTT}</td>
                                </tr>

                            </c:forEach>
                        </tbody>
                    </table>
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
