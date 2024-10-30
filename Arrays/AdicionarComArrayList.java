/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */

import java.util.ArrayList;

public class AdicionarComArrayList {
    public static void main (String[] args) {
        ArrayList<Integer>numeros = new ArrayList<>();//criar um arrayList
        
        //Adicionar elementos
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        
        //remover elementos
        numeros.remove(2); //Remove o elemento de indice 2
        
        //imprimir o arrayList
        System.out.println(numeros);
        
        //Get - retorna o elemento na posiçao especificada
        System.out.println(numeros.get(2)); //4
        
        //set - altera o elemento na posicao especificada
        numeros.set(2, 77);
        System.out.println(numeros.get(2)); //77
        
        //remover todos os elementos da lista
        numeros.clear();
        
        //Retorna o tamanho da lista 
        numeros.size();
        
        //retorna se a lista esta vazia ou nao 
        numeros.isEmpty(); //retorna true se a lista estiver vazia
        
        //retorna true se a lista contiver o elemento
        numeros.contains(5); //False
        
    }
}
