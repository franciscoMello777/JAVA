/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */

public class Violao implements InstrumentoMusical{
    
    @Override //significa sobrescrever
    public String tocar(){
        return "o violao esta tocando...";
    }
    
    @Override
    public String afinar(){
        return "o violao esta sendo afinado...";
    }
    
}
