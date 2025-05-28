package org.example.vistas;

import javax.swing.*;

public class registrarseFormulario extends JDialog{
    private JPanel panelRegistrarse;
    private JTextField textFieldNombres;
    private JTextField textFieldApellidos;
    private JComboBox comboBoxRol;
    private JTextField textFieldEmail;
    private JButton buttonVolver;
    private JButton buttonSiguiente;
    private JPasswordField passwordField1;

    public registrarseFormulario(){
        setSize(600, 450);
        setLocationRelativeTo(null);
        setContentPane(panelRegistrarse);

    }

    public static void main(String[] args){
        registrarseFormulario dialog = new registrarseFormulario();
        dialog.setVisible(true);
    }
}
