/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class DeletarUsuarios {
    
    //Metodo para deletar um ususario no banco com o ID fornecido
     public static void deletarUsuarios(Connection conexao, int id) {
        
         String sql = "DELETE FROM usuarios WHERE id = ?";
        
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            
            int rowsDeleted = pstmt.executeUpdate();
            
            if(rowsDeleted > 0) {
                System.out.println("Usuario deletado com sucesso!");
            } else {
                System.out.println("Nenhum usuario encontrado com o id fornecido!");
            }
            
            } catch (Exception e) {
                System.out.println("Erro ao deletar o usuario!" + e.getMessage());
        }
    }
    
}
