package org.example.vistas;

import javax.swing.*;

public class inicioSesionFormulario extends JDialog{
    private JTextField textFieldEmail;
    private JPasswordField passwordFieldContraseña;
    private JPanel panelInicioSesion;
    private JButton buttonSiguiente;
    private JButton buttonVolver;

    public inicioSesionFormulario(){
        setSize(600, 400);
        setLocationRelativeTo(null);
        setContentPane(panelInicioSesion);
    }

    public static void main(String[] args){
        inicioSesionFormulario dialog = new inicioSesionFormulario();
        dialog.setVisible(true);
    }
}
