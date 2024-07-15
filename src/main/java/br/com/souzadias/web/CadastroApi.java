package br.com.souzadias.web;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/cadastroApi")
public class CadastroApi extends HttpServlet {
    private static final long serialVersionUID = 1L;

    List<Usuario> usuarios = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Gson gson = new Gson();
        String usuariosConvertidos = gson.toJson(usuarios);

        response.getWriter().append(usuariosConvertidos);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));

        String line = "";

        StringBuilder sb = new StringBuilder();

        while ((line = br.readLine()) != null) {
            sb.append(line);
        }

        System.out.println(sb.toString());

        Gson gson = new Gson();

        Usuario usuario = gson.fromJson(sb.toString(), Usuario.class);

        usuarios.add(usuario);
    }

    public static class Usuario {
        private String nome;
        private String email;

        public Usuario(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
