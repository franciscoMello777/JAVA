/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */


public class GuessValidator {
    public boolean validateGuess(int guess, int numberToGuess) {
        if (guess > numberToGuess) {
            System.out.println("Seu palpite e muito alto!");
            return false;
        } else if (guess < numberToGuess) {
            System.out.println("Seu palpite e muito baixo!");
            return false;
        } else {
            return true;
        }
    }
}
