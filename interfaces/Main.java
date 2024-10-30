/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */

public class Main {
    
    public static void main(String[] args) {
        
        Piano meuPiano = new Piano();
        Violao meuViolao = new Violao();
        
       
        System.out.println(meuViolao.tocar());
        System.out.println(meuViolao.afinar());
        
        System.out.println( meuPiano.tocar());
        System.out.println(meuPiano.afinar());
        
    }
    
}
