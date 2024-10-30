/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesAbstracts;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
abstract class Mobilia {
    protected String cor;
    protected String material;

    // Construtor
    public Mobilia(String cor, String material) {
        this.cor = cor;
        this.material = material;
    }

    // Método abstrato (sem implementação)
    public abstract void montar();

    // Método concreto (com implementação)
    public void desmontar() {
        System.out.println("Desmontando a mobília.");
    }
}
