/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoLogin;

import java.sql.Connection;
import java.sql.PreparedStatement; // preparedStatement e usuada para executar uma consulta no SQL com parametros 
import java.sql.ResultSet;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class InserirUsuario {
    
    //definimos o metodo inserirUsuario, que recebe uma conexao com o banco de dados (conexao).
    //um nome de usuario (nome) e um email de usuario (email).
   public static boolean inserirUsuario(Connection conexao, String nome, String senha) {
            
    String sqlCheck = "SELECT * FROM usuarios WHERE nome = ?";    
    //insere na tabela 'usuarios' vai inserir os registros nome e senha.    
    String sqlInsert = "INSERT INTO usuarios (nome, senha) VALUES (?, ?)";
        
    //o metodo setString substitui ? pelos valores passados.
    try (PreparedStatement checkStmt = conexao.prepareStatement(sqlCheck)) {
        
        checkStmt.setString(1, nome); //substitui o primeiro ? por nome.
        ResultSet rs = checkStmt.executeQuery();
            
        if(rs.next()) {
            System.out.println("Usuario ja existente no banco de dados! ");
            return false;
        }
        
        try (PreparedStatement insertStmt = conexao.prepareStatement(sqlInsert)) {
        //insere o usuario na tabela 
        insertStmt.setString(1, nome);
        insertStmt.setString(2,senha);
        
        insertStmt.executeUpdate();
        
        System.out.println("Usuario inseriodo com sucesso!");
        return true;
        }
        
    } catch  (Exception e) {
        System.out.println("Erro ao inserir o usuario!" + e.getMessage()); // mensagem de erro.
    }
    return false;
   }
}
 
