/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ClassesAbstracts;

public class App {
    public static void main(String[] args) {
        Mobilia meuSofa = new Sofa("Azul", "tecido e madeira."); 
        Mobilia minhaMesa = new Mesa("Preta", "marmore e metal.");
        
        meuSofa.montar();
        minhaMesa.montar();
        minhaMesa.desmontar();
        
            }
}
