/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class Aluno {
    public String Curso;
    public String Nome;
    public int Matricula;
    
    public Aluno(String curso, String nome, int matricula) {
    this.Nome = nome;
    this.Matricula = matricula;
    this.Curso = curso;
}
    public void get() {
        System.out.println("Aluno: " + Nome + ", Curso: " + Curso + ", Maticula: " + Matricula);
    }
}
