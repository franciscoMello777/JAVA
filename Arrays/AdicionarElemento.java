/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class AdicionarElemento {
    public static void main (String[] args) {
        int [] numeros = {1,2,3}; //Array original
        
        int novoNumero = 4; //Numero que vai ser adicionado
        
        int [] novoArray = new int [numeros.length + 1]; 
        // cria um novo arry com o tamanho 4 (3 + 1)
        
        //copiar os elementos do array antigo para o novo
        for(int i = 0; i < numeros.length; i++) {
            novoArray[i] = numeros[i];
        }
        
        //Adiciona o ultimo elemento
        novoArray[3] = novoNumero;
        
        //Imprime o array
        for(int i = 0; i < novoArray.length; i++) {
            System.out.println(novoArray[i]);
        }
        
    }
}
