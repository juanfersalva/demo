package com.mycompany.web.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/imc")
public class imcServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       double peso = Double.parseDouble(req.getParameter("peso"));
       double altura = Double.parseDouble(req.getParameter("altura"));

       double imc = peso/(altura*altura);

       req.setAttribute("imc",imc);

       RequestDispatcher respuesta = req.getRequestDispatcher("/resultado.jsp");
       respuesta.forward(req, resp);
    }
}
