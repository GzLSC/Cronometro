/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Ursus
 */
public class PanelCronometro extends JPanel{
    JTextField campo1;
    JTextField campo2;
    JTextField campo3;
    JButton botonIniciar;
    JButton botonDetener;
    JButton botonReiniciar;
    JPanel panelInfo;
    JPanel panelBotones;
    
    public PanelCronometro(){
        super.setLayout(new GridLayout(2, 1));
        panelInfo = new JPanel();
        panelBotones = new JPanel();
        panelInfo.setLayout(new FlowLayout());
        panelBotones.setLayout(new FlowLayout());
        
        campo1 = new JTextField(4);
        campo2 = new JTextField(4);
        campo3 = new JTextField(4);
        
        campo1.setEditable(false);
        campo2.setEditable(false);
        campo3.setEditable(false);
        
        panelInfo.add(campo1);
        panelInfo.add(new JLabel(":"));
        panelInfo.add(campo2);
        panelInfo.add(new JLabel(":"));
        panelInfo.add(campo3);
        
        botonIniciar = new JButton("Iniciar");
        botonDetener = new JButton("Detener");
        botonReiniciar = new JButton("Reiniciar");
        
        panelBotones.add(botonIniciar);
        panelBotones.add(botonDetener);
        panelBotones.add(botonReiniciar);
        
        super.add(panelInfo);
        super.add(panelBotones);
    }
}
