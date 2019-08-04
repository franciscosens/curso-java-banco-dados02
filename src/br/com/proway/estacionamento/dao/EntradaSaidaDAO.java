package br.com.proway.estacionamento.dao;

import br.com.proway.estacionamento.modelo.EntradaSaida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author fsens
 */
// DAO -> Data Access Object
public class EntradaSaidaDAO implements EntradaSaidaInterface {

    @Override
    public int inserir(EntradaSaida entradaSaida) {
        try {
            Connection conexao = new Conexao().conectar();
            PreparedStatement ps = conexao.prepareStatement(
                    "INSERT INTO entradas_saidas (modelo, placa, valor) VALUE (?,?,?)");
            ps.setString(1, entradaSaida.getModelo());
            ps.setString(2, entradaSaida.getPlaca());
            ps.setDouble(3, entradaSaida.getValor());
            ps.execute();
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public boolean alterar(EntradaSaida entradaSaida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean apagar(int id) {
        try{
            Connection conexao = new Conexao().conectar();
            PreparedStatement ps = conexao.prepareStatement("DELETE FROM entradas_saidas WHERE id =?");
            ps.setInt(1, id);
            int quantidadeAfetada = ps.executeUpdate();
            return quantidadeAfetada == 1;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public ArrayList<EntradaSaida> obterTodos(String placa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EntradaSaida obterPeloId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
