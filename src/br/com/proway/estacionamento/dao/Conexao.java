package br.com.proway.estacionamento.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author fsens
 */
public class Conexao {
    
    // Constante ou seja uma parada que NÃO pode ser modificada
    private final String HOST = "jdbc:mysql://localhost:3306/exemplo_01";
    private final String USER = "root";
    private final String PASSWORD = "";
    
    public Connection conectar() throws SQLException{
        Connection conexao = DriverManager.getConnection(HOST, USER, PASSWORD);
        return conexao;
    }
    
}
