package br.com.souzadias.web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Cadastro servlet funcionando");
        System.out.println("Método " + request.getMethod());
        response.getWriter().append("<html><h1>Estou no cadastro</h1></html>");
    }

}
