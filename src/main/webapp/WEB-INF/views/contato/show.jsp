<%-- 
    Document   : show
    Created on : 05/08/2012, 00:47:36
    Author     : maykoone
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerenciador de contatos</title>
    </head>
    <body>
        <h3>Visualização do contato</h3>
        <ul>
            <li>Nome: <c:out value="${contato.nome}"/></li>
            <li>Nome: <c:out value="${contato.email}"/></li>
        </ul>
        <a href="/contato">Voltar</a>  
    </body>
</html>
