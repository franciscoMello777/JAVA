/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoLogin;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class CriarTabela { //declaracao da classe.
    //metodo cria tabela "Usuarios" no banco de dados.
    public static void criarTabela(Connection conexao) {
        //cria uma string contendo o comando SQL para criar a tabela, se nao existir.
        String sql = "CREATE TABLE IF NOT EXISTS usuarios("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "nome TEXT NOT NULL,"
                +"senha TEXT NOT NULL)";
        
        try(Statement stmt = conexao.createStatement()){
            stmt.execute(sql);
            System.out.println("Tabela 'usuarios' criada ou ja existente");
        }catch(Exception e) {
            System.out.println("Erro ao criar tabela" + e.getMessage());
            
        }
        
    }
    
}
