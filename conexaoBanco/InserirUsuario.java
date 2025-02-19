/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement; // preparedStatement e usuada para executar uma consulta no SQL com parametros 

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class InserirUsuario {
    
    //definimos o metodo inserirUsuario, que recebe uma conexao com o banco de dados (conexao).
    //um nome de usuario (nome) e um email de usuario (email).
    public static void inserirUsuario(Connection conexao, String nome, String email) {
            
    //insere na tabela 'usuarios' vai inserir os registros nome e email.    
    String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";
        
    //o metodo setString substitui ? pelos valores passados.
    try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
        pstmt.setString(1, nome); //substitui o primeiro ? por nome.
        pstmt.setString(2, email); //substitui o segundo ? por email.
            
        //insere o usuario na tabela 
        pstmt.executeUpdate();
        System.out.println("Usuario insirido com sucesso!");
    } catch (Exception e) {
        System.out.println("Erro ao inserir o usuario!" + e.getMessage()); // mensagem de erro.
    }
  }
}
