<%-- 
    Document   : list
    Created on : 05/08/2012, 00:00:46
    Author     : maykoone
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
    <head>
        <title>Gerenciador de Contatos</title>
    </head>
    <body>
        <h3>Lista de contatos</h3>
        <table border="1">
            <tr>
                <td>Id</td>
                <td>Nome</td>
                <td>Email</td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <c:forEach items="${contatoList}" var="contato">
                <tr>
                    <td>${contato.id}</td>
                    <td>${contato.nome}</td>
                    <td>${contato.email}</td>
                    <td><a href="contato/${contato.id}/form">Editar</a></td>
                    <td><a href="contato/${contato.nome}">Visualizar</a></td>
                    <td>
                        <form:form action="contato/${contato.id}" method="delete">
                            <button>Excluir</button>
                        </form:form>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <h5><a href="contato/form">Novo</a></h5>
    </body>
</html>
