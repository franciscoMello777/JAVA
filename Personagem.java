/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personagem;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class Personagem {
    public String Nome;
    public int Vida;
    public int Ataque;
    
    public Personagem(String nome, int vida, int ataque) {
    this.Nome = nome;
    this.Vida= vida;
    this.Ataque = ataque;
    }
    
    public void atacar(Personagem oponente) {
        oponente.Vida = Vida - Ataque;
        System.out.println("a vida agora esta em " + Vida);
    }
    
    public void estaVivo() {
        if (this.Vida > 0){
            System.out.println("esta vivo");
         }else{
            System.out.println("esta morto");
        }
    }
    }
    