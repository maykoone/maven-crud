<%-- 
    Document   : create
    Created on : 05/08/2012, 00:12:58
    Author     : maykoone
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>


<html>
    <head>
        <title>Gerenciador de contatos</title>
    </head>
    <body>
        <h3>Editar contato</h3>
        <form:form action="${pageContext.request.contextPath}/contato/edit" method="put" commandName="contato">
            <form:hidden path="id" />
            <label>Nome:</label> <form:input path="nome" /><br />
            <label>E-mail:</label> <form:input path="email" /><br />
            <input type="submit">
        </form:form>
    </body>
</html>
