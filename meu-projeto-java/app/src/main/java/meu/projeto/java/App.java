/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package meu.projeto.java;

public class App {
    
    public static void main(String[] args) {
        
    String nome = "Francisco"; //Para string sempre duas "".
    int idade = 17; //Numeros inteiros.
    int num1 = 2;
    int num2 = 3;
    int num3 = 4;
    double altura = 1.90; //Numeros com decimais.
    boolean seiJava = false; //Boolean.
    char letraInicial = 'F'; //Para char sempre uma ''. char apenas um caracter.
    
    System.out.println("Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura + ", seiJava?: " + seiJava + ", Minha letra inicial: " + letraInicial);
    
    System.out.println("Meu nome e " + nome + " e tenho " + idade + " anos" + " e tenho " + altura + " de altura ");
    
    System.out.println(num1 + num2);
    
    System.out.println((num1 + num2 + num3) /3);
    
    if (num1 %2 == 0) {
        System.out.println("Esse numero e par");
    } else {
        System.out.println("Esse numero e impar");
        }
    
    }
}
