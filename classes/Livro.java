/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class Livro {
    public String Titulo;
    public String Autor;
    public int Paginas;
    
    public Livro(String titulo, String autor, int paginas) {
    this.Autor = autor;
    this.Paginas = paginas;
    this.Titulo = titulo;
}
    public void get() {
        System.out.println("titulo do livro: " + Titulo + ", Autor: " + Autor + ", Paginas: " + Paginas);
    }
    
}
