/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
import java.util.Scanner;

public class Player {
    private String name;
    
    public Player() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.name = scanner.nextLine();
    }
    
    public String getName() {
        return name;
    }
}
