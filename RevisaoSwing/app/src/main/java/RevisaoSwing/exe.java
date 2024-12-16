/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RevisaoSwing;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


/**
 *
 * @author FRANCISCOPESDEMELLO
 */
public class exe extends JFrame {
    
    public exe() {
        
        JFrame frame = new JFrame("Minha Janela");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JButton b1 = new JButton("Botao1");
        panel.add(b1);
        
        JLabel label = new JLabel("Oii ");
        panel.add(label);
        
        JTextField text = new JTextField(20);
        panel.add(text);
        
        JTextArea area = new JTextArea(5, 20);
        panel.add(area);
        
        JCheckBox box = new JCheckBox("Marque aqui!");
        panel.add(box);
        
        JRadioButton radio1 = new JRadioButton("Opcao 1: ");
        JRadioButton radio2 = new JRadioButton("Opcao 2: ");
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        panel.add(radio1);
        panel.add(radio2);
        
        String[] options = {"Item 1: ", "Item 2: ", "Item 3: "};
        JComboBox<String> comboBox = new JComboBox<>(options);
        panel.add(comboBox);
        
        String[] listItens = {"Item A: ", "Item B: ", "Item C: ", "Item D: ", "Item E: ", "Item F: ", "Item G: ", "Item H: ", "Item I: ", "Item J: ", "Item K: ", "Item L: ", "Item M: "};
        JList<String> list = new JList<>(listItens);
        panel.add(new JScrollPane(list));
        
        String[] [] data = {{"1", "Alice"}, {"2", "Bob"}};
        String[] columns = {"ID", "Nome"};
        JTable table = new JTable(data, columns);
        frame.add(new JScrollPane(table));
    
        JSlider slider = new JSlider(0,100);
        panel.add(slider);
        
        JProgressBar progressBar = new JProgressBar(0,100);
        progressBar.setValue(10);
        panel.add(progressBar);
        
        JOptionPane.showMessageDialog(frame, "Mensagem exibida!");
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Arquivo");
        JMenuItem menuItem = new JMenuItem("Abrir");
        menu.add(menuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        
        JTextArea largeText = new JTextArea(0,100);
        panel.add(new JScrollPane(largeText));
        
    }
    
    public static void main(String [] args) {
        
        exe frame = new exe();
        frame.setVisible(true);
        
    }
    
}
