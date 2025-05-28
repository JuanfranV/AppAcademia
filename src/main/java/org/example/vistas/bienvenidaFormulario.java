package org.example.vistas;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;

public class bienvenidaFormulario extends JDialog{
    private JPanel bienvenida;
    private JButton buttonRegistrarse;
    private JButton buttonInicioSesion;

    public bienvenidaFormulario(){
        setSize(600, 400);
        setLocationRelativeTo(null);
        setContentPane(bienvenida);

    }

    public static void main(String[] args){
        try{
            UIManager.setLookAndFeel(new FlatLightLaf());
        }catch (Exception e){
            e.printStackTrace();
        }

        bienvenidaFormulario dialog = new bienvenidaFormulario();
        dialog.setVisible(true);
    }
}
