/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Arrays;

public class App {
    public static void main(String[] args) {
        
        int [] numeros;//array de numeros inteiros;
        numeros = new int[5];
        
        int [] numeros2 = {1,2,3,4,5,6,7,8,9,10,1,8,9};//inicializa o array com valores;
        
        //acessando valores no array;
        System.out.println(numeros2[0]);
        System.out.println(numeros2[5]);
        
        //modificar valores no array;
        numeros2[0] = 90;
        System.out.println(numeros2[0]);
        
        //comprimento do array 
        System.out.println(numeros2.length);
        
        //iterando sobre os elementos do array;
        /*for(int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        */
        for(int numero: numeros2) {
            System.out.println(numero);
        }
        
        //crie um arry com 5 nomes 
        //mude o 3 nome para "Jobiscleison"
        //imprima todos os nomes usando for each
        
        String [] nomes;
        nomes = new String[5];
        
        String [] nomes2 = {"Paulo", "Jeff", "Francisco", "Dani", "Amanda"};
        
        nomes2[2] = "Jobiscleison";
        
        for(String nome: nomes2) {
            System.out.println(nome);
        }
        
        
        
    }
}
