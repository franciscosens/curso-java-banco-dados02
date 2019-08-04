package br.com.proway.estacionamento.dao;

import br.com.proway.estacionamento.modelo.EntradaSaida;
import java.util.ArrayList;

/**
 *
 * @author fsens
 */
public interface EntradaSaidaInterface {
    // Método responsável por inserir o registro no BD
    int inserir(EntradaSaida entradaSaida);
    
    // Método responsável por alterar o registro no BD
    boolean alterar(EntradaSaida entradaSaida);
    
    // Método resposável por apagar o registro pelo id no BD
    boolean apagar(int id);
    
    // Obter todos do BD filtrando pela placa
    ArrayList<EntradaSaida> obterTodos(String placa);
    
    // Obter a Entrada Saída pelo Id
    EntradaSaida obterPeloId(int id);
}
