/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe.aula3;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
import java.util.Scanner;
public class RPSValidator {

    // Valida se o jogador ganhou
    public boolean validateChoice(int playerChoice, int computerChoice) {
        if (playerChoice == computerChoice) {
            System.out.println("Empate!");
            return false;
        } else if ((playerChoice == 1 && computerChoice == 3) || // Pedra ganha de Tesoura
                   (playerChoice == 2 && computerChoice == 1) || // Papel ganha de Pedra
                   (playerChoice == 3 && computerChoice == 2)) { // Tesoura ganha de Papel
            return true; // Jogador ganhou
        } else {
            return false; // Computador ganhou
        }
    }

    // Converte o número (1, 2, 3) para a escolha correspondente (Pedra, Papel, Tesoura)
    public String choiceToString(int choice) {
        switch (choice) {
            case 1:
                return "Pedra";
            case 2:
                return "Papel";
            case 3:
                return "Tesoura";
            default:
                return "Escolha inválida";
        }
    }
}