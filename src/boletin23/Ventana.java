package boletin23;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author epastorizalorenzo
 */
public class Ventana {
    
    public void crearVenta(){
 
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JFrame marco = new JFrame();
    JLabel etiqueta = new JLabel("NOME");
    JTextField casilla = new JTextField(8);
    JLabel etiqueta2 = new JLabel("PASSWORD");
    JPasswordField pass = new JPasswordField(8);
    JButton boton = new JButton("PREMER");
    JButton boton2 = new JButton("LIMPAR");
    JButton boton3 = new JButton("BOTON");
    String [] elementos = {"elementolista1","elementolista2","elementolista3"};
    JList lista = new JList(elementos);
    JTextArea area = new JTextArea("area texto");
    FlowLayout dis = new FlowLayout(FlowLayout.CENTER,5,5);
    dis.setHgap(65);
    dis.setVgap(65);
    
    //PARTE 1
    panel.setBounds(0,0,400,400);
    panel.setBackground(Color.RED);
    panel.setLayout(dis);
    panel.add(etiqueta);
    panel.add(casilla);
    panel.add(etiqueta2);
    panel.add(pass);
    panel.add(boton);
    panel.add(boton2);
    marco.add(panel);
    marco.setLayout(null);
    marco.setSize(400,800);
    marco.setVisible(true);
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.setLocationRelativeTo(null);
    
    //PARTE 2
    panel2.setBounds(0,400,420,420);
    panel2.setBackground(Color.BLUE);
    panel2.add(lista);
    panel2.add(boton3);
    panel2.add(area);
    marco.add(panel2);
    
    }
}