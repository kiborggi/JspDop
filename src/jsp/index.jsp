<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="jsp.jsf.Person" %>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form method="post" action="controller">
      <input type = "text " name="name" value="name">
      <input type = "text " name="sex" value="sex">
       <input type="date" id="start" name="date"
          min="190-01-01" max="2020-12-31">
    <input type="submit" >

      <table >
        <tr class = "table" >
          <th style="border: solid"><h5> name </h5></th>
          <th style="border: solid"><h5> sex </h5></th>
          <th style="border: solid"><h5> date </h5></th>

        </tr>
          <% List<jsf.Person> arr =  null;
        try{
            arr = (List<jsf.Person>) getServletConfig().getServletContext().getAttribute("list");
            for (jsf.Person p : arr){
                %>

        <tr>
          <td style="border: solid"><%=p.getName()%></td>
          <td style="border: solid" ><%=p.getSex()%></td>
          <td style="border: solid"><%=p.getDate()%></td>
        </tr>
          <%
            }
        }catch (NullPointerException e){
            System.out.println("Null Pounter");
        }
%>

  </body>
</html>
