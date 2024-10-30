/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class Piano implements InstrumentoMusical{
    
    @Override // significa sobrescrever
    public String tocar() {
        return "O piano esta tocando...";
    }
    
    @Override
    public String afinar() {
        return "O piano esta sendo afinado...";
    }
    
}
    

