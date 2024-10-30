/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mercado;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public abstract class Produto {
    String nome;
    double preco;
    
    public Produto(String nome,double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public void getProduto(){
        System.out.println("Nome: \n" + nome + "Preco: \n" + preco);
    }
}
