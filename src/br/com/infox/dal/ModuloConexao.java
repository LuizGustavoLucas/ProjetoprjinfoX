package br.com.infox.dal;

import java.sql.*;

public class ModuloConexao {

    //método responsável por estabelecer a conexão com o banco de dados
    public static Connection conector() {

        java.sql.Connection conexao = null;
        //a linha abaixo chama o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        //armazenando informações referente ao banco de dados
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //estabelecendo a conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //a linha abaixo serve de apoio para esclarecer o erro de conexão
            //System.out.println(e);
            return null;
        }
    }

}
