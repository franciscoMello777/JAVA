/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mercado;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Mercado {
    public void start() {
        
        ArrayList<Produto>carrinho = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        boolean index = false;
        
        while(!index) {
            System.out.println("1 - Add item: \n 2 - Remover item: \n 3 - ver carrinho: \n 4 - Pagamento: \n 5 - sair: ");
            String escolha = scanner.nextLine();
            
            switch(escolha){
                case "1":
                    System.out.println("Escolha um corredor\n 1 - Comida: \n 2 - Eletronico: \n 3 - Brinquedos: \n 4 - Roupas: \n 5 - Limpeza: ");
                    String corredor = scanner.nextLine();
                    
            switch(corredor) {
                case "1":
                    System.out.println("Fale o nome do produto: ");
                    String produtoC = scanner.nextLine();
                    double precoC = Math.random() * 100;
                    Produto newComida = new Comida(produtoC, precoC);
                    carrinho.add(newComida);
                    break;
                    
                case "2":
                    System.out.println("Fale o nome do produto: ");
                    String produtoE = scanner.nextLine();
                    double precoE = Math.random() * 100;
                    Produto newEletronicos = new Eletronico(produtoE, precoE);
                    carrinho.add(newEletronicos);
                    break;
                    
                case "3":
                    System.out.println("Fale o nome do produto: ");
                    String produtoB = scanner.nextLine();
                    double precoB = Math.random() * 100;
                    Produto newBrinquedos = new Brinquedo(produtoB, precoB);
                    carrinho.add(newBrinquedos);
                    break;
                    
                case "4":
                    System.out.println("Fale o nome do produto: ");
                    String produtoR = scanner.nextLine();
                    double precoR = Math.random() * 100;
                    Produto newRoupas = new Roupa(produtoR, precoR);
                    carrinho.add(newRoupas);
                    break;
                  
                case "5":
                    System.out.println("Fale o nome do produto: ");
                    String produtoL = scanner.nextLine();
                    double precoL = Math.random() * 100;
                    Produto newLimpezas = new Limpeza(produtoL, precoL);
                    carrinho.add(newLimpezas);
                    break;
                  
                    default:
                        System.out.println("Opcao invalida, tente novamente!");
                        break;
                        
            }
                        break;
                        
                case "2":
                    for(int i = 0; i < carrinho.size(); i++) {
                        System.out.println(i + " - " + carrinho.get(i).nome);
                    }
                    System.out.println("fale o numero do produto que queira tirar do carrinho: ");
                    int remove = scanner.nextInt();
                    carrinho.remove(remove);
                    break;
                
                case "3":
                    System.out.println("Produtos no carrinho: ");
                    
                    for(int i = 0; i < carrinho.size(); i++) {
                        System.out.print(carrinho.get(i).nome + ", ");
                        System.out.println("R$ " + df.format(carrinho.get(i).preco));
                        
                    }
                    break;
                    
                case "4":
                    System.out.println("Vc pagou!!");
                    carrinho.clear();
                    break;
                    
                case "5":
                    System.out.println("saindo...");
                    
                default:
                    System.out.println("opcao invalida, tente novamente...");
                    
            }
        }
    }
}
