/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personagem;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */

import java.util.Scanner;


public class JogoBatalha {
    public void start(){
        
        Scanner scanner = new Scanner(System.in);;
        
        System.out.println("Fale o nome do Mago: ");
        String nomeM = scanner.nextLine();
        Mago mago = new Mago(nomeM);
        
        System.out.println("Fale o nome do Guerreiro: ");
        String nomeG = scanner.nextLine();
        Guerreiro guerreiro = new Guerreiro(nomeG);
        
        System.out.println("Fale o nome do Arqueiro: ");
        String nomeA = scanner.nextLine();
        Arqueiro arqueiro = new Arqueiro(nomeA);
        
        while(guerreiro.Vida > 0 && arqueiro.Vida > 0 && mago.Vida >0){
            
            System.out.println("Mago: "+ mago.Vida + " Guerreiro: " + guerreiro.Vida + " Arqueiro: " + arqueiro.Vida);
            
            System.out.println("Digite o seu personagem: "
                    + "1 - Guerreiro "
                    + "2 - Arqueiro "
                    + "3 - Mago. ");
            int guess = scanner.nextInt();
            
            System.out.println("Digite o personagem que quer atacar: "
                    + "1 - Guerreiro "
                    + "2 - Arqueiro "
                    + "3 - Mago. ");
            int guess2 = scanner.nextInt();
            
            switch(guess){
                
                case 1:
                    switch(guess2){
                        
                        case 1:
                            System.out.println("O guerreiro nao pode atacar ele mesmo.");
                            break;
                        case 2:
                            System.out.println("O guerreiro atacou o arqueiro " + arqueiro.Nome);
                            arqueiro.Vida -= guerreiro.Ataque;
                            break;
                        case 3: 
                            System.out.println("O guerreiro atacou o mago " + mago.Nome);
                            mago.Vida -= guerreiro.Ataque;
                    }
                    break;
                case 2:
                    switch(guess2){
                        
                        case 1:
                            System.out.println("O arqueiro nao pode atacar ele mesmo.");
                            break;
                        case 2:
                            System.out.println("O arqueiro atacou o guerreiro " + guerreiro.Nome);
                            guerreiro.Vida -= arqueiro.Ataque;
                            break;
                        case 3: 
                            System.out.println("O arqueiro atacou o mago " + mago.Nome);
                            mago.Vida -= arqueiro.Ataque;
                    }    
                case 3:
                    switch(guess2){
                        
                        case 1:
                            System.out.println("O mago nao pode atacar ele mesmo.");
                            break;
                        case 2:
                            System.out.println("O mago atacou o arqueiro " + arqueiro.Nome);
                            arqueiro.Vida -= mago.Ataque;
                            break;
                        case 3: 
                            System.out.println("O mago atacou o guerreiro " + guerreiro.Nome);
                            guerreiro.Vida -= mago.Ataque;
                }  
            }
        }
    }
}

