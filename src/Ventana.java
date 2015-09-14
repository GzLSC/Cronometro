/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Ursus
 */
public class Ventana extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu util;
    private JMenuItem cronoItem;
    private JMenuItem tempItem;
    private JMenuItem salirItem;
    private PanelCronometro panelCrono;
    
    public Ventana () {
        super.setTitle("Prototipo");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(null);
        super.setSize(350, 250);
        
        menuBar = new JMenuBar();
        util = new JMenu("Utilitarios");
        cronoItem  = new JMenuItem("Cronometro");
        tempItem = new JMenuItem("ºF a ºC");
        salirItem = new JMenuItem("Salir");
        
        util.add(cronoItem);
        util.add(tempItem);
        util.add(salirItem);
        menuBar.add(util);
        super.setJMenuBar(menuBar);
        
        cronoItem.addActionListener(this);
        tempItem.addActionListener(this);
        salirItem.addActionListener(this);
        
        panelCrono = new PanelCronometro();
        panelCrono.setBounds(20, 50, 300, 120);
        super.setVisible(true);
        super.add(panelCrono);
        panelCrono.setVisible(false);
    }
    
    public static void main (String [] args){
        Ventana ventana = new Ventana();
    }
    
    public void actionPerformed(ActionEvent e) {
        JMenuItem fuente = (JMenuItem)(e.getSource());
        String texto =  fuente.getText();
//        System.out.println("1");
//        System.out.println(texto);
        if(texto.equals("Cronometro")){
            panelCrono.setVisible(true);
        }
        if(texto.equals("ºF a ºC")){
            panelCrono.setVisible(false);
        }
        if(texto.equals("Salir")){
            System.exit(0);
        }
    }
}
