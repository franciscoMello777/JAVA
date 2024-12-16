/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RevisaoSwing;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class Eventos extends javax.swing.JFrame {
    
    public Eventos() {
        
        JFrame frame = new JFrame("Minha Janela");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JButton botao = new JButton("Clique aqui! ");
        panel.add(botao);
        botao.setText("Outro texto!"); //muda texto.
        System.out.println(botao.getText()); //pega o texto.
        
        JLabel texto = new JLabel("Este é meu texto ");
        panel.add(texto);
        Icon eletric = new ImageIcon(getClass().getResource("Pikachu.png"));
        texto.setIcon(eletric);
        panel.add(texto);
        
        JTextField text = new JTextField("Escreva aqui! ");
        text.setEditable(false);
        panel.add(text);
        
        JTextArea area = new JTextArea("Texto exemplo! ");
        area.append("Texto adicionado! ");
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        panel.add(area);
        
    }
    
    public static void main(String [] args) {
        
        Eventos frame = new Eventos();
        frame.setVisible(true);
        
    }
    
}
