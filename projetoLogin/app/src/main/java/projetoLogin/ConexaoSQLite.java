/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class ConexaoSQLite { //Declaracao da classe que gerencia a conexao com o SQLite.
    public Connection conectar() {
        
        //metodo para conectar ao banco de dados.
        Connection conexao = null; //declara uma variavel para armazenar a conexao.
        String url = "jdbc:sqlite:usuarios.db"; //define o caminho do banco de dados SQLite.
        
        try {
            //tenta estabelecer a conexao com o banco de dados usando a URL fornecida.
            conexao = DriverManager.getConnection(url);
            System.out.println("conexao com SQLite estabelecida!"); //mensgem de sucesso.
        } catch(SQLException e) {
            //caso ocorra um erro, ele sera capturado e exibido.
            System.out.println("Erro ao conectar ao banco!" + e.getMessage());
        }
        
        return conexao;
    }
    
    //metodo para fechar a conexao com o banco de dados.
    public void desconectar(Connection conexao) {
        try {
            //verifica se a conexao nao e nula (ou seja, se esta aberta).
            if(conexao != null) {
                conexao.close(); //conexao fechada
                System.out.println("Conexao fechada"); //mensagem de sucesso.
            }
            
            } catch(SQLException e) {
            //captura e exibe qualquer erro ao fechar .
            System.out.println("Erro ao fechar a conexao!" + e.getMessage());
            
        }
        
    }
    
}
