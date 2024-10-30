/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class Produto {
    public int Quantidade;
    public String Nome;
    public int Preco;
    
    public Produto(String nome, int quantidade, int preco) {
    this.Nome = nome;
    this.Quantidade = quantidade;
    this.Preco = preco;
}
    
    public void get() {
        System.out.println("Produto: " + Nome + ", Quantidade: " + Quantidade + ", Preco: " + Preco);
    }
    
    public String calcula() {
        System.out.print(Quantidade * Preco);
    

