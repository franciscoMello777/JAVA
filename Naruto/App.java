/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Naruto;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class App {
    
    public static void main(String[] args) {
        Cla uchiha = new Uchiha("Uchiha","Morto");
        Cla hyuga = new Hyuga("Hiuga","Hinata");
        Cla nara = new Nara("Nara","Shikamaru");
        Cla akimichi = new Akimichi("Akimichi","Choji");
        
        uchiha.habilidadeEspecial();
        uchiha.obterDetalhes();
        
        hyuga.habilidadeEspecial();
        hyuga.obterDetalhes();
        
        nara.habilidadeEspecial();
        nara.obterDetalhes();
        
        akimichi.habilidadeEspecial();
        akimichi.obterDetalhes();
    }
}
