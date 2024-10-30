/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */

public class App {
     public static void main(String[] args) {
     Livro livro = new Livro("todos contra todos", "Leandro Carnal", 22);
     Aluno aluno = new Aluno("TDS", "Francisco", 7);
     Produto produto = new Produto("PC", 10, 8000);
     
     livro.get();
     aluno.get();
     produto.get();
     produto.calcula();
     
     }
}
