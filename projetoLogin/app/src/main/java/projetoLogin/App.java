/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package projetoLogin;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {
       ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
       Connection conexao = conexaoSQLite.conectar();
       
       //Cria tabela.
       CriarTabela.criarTabela(conexao);
       
       //Inserindo dados dos usuarios no banco de dados.
       InserirUsuario.inserirUsuario(conexao, "Francisco", "senha");
       //InserirUsuario.inserirUsuario(conexao, "Paulo", "paulo@gmail.com");
       
       
       
       //atualizando usuario
       //AtualizarUsuarios.atualizarUsuarios(conexao, 1, "Francisco", "francisco@gmail.com");
       //AtualizarUsuarios.atualizarUsuarios(conexao, 2, "Lunnah", "lunnah@gmail.com");
       
       //deletando usuarios
       //DeletarUsuarios.deletarUsuarios(conexao, 3);
       
       //Listando usuarios
       //System.out.println(ListarUsuarios.listarUsuarios(conexao));
       
    }
}

