<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Cadastro de usuário</title>
</head>
<body>
    <form action="cadastroUsuario" method="post">
        <label for="nome">Digite seu nome:</label>
        <input type="text" name="nome" id="nome" />
        <br/>
        <label for="email">Digite seu email:</label>
        <input type="email" name="email" id="email" />
        <br/>
        <input type="submit" value="Cadastrar" />
    </form>
</body>
</html>
