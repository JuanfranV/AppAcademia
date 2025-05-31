package org.example.vistas.administradorVistas;

import javax.swing.*;

public class administradorFormulario extends JDialog {


    private JPanel panelAdministradorFormulario;
    private JButton administrarCursosButton;
    private JButton administrarCategoríasButton;
    private JButton buttonAdmProfesor;
    private JButton deAdministradorButton;
    private JButton deProfesorButton;
    private JTextField textFieldContraseña;

    public administradorFormulario(){
        setSize(600, 400);
        setLocationRelativeTo(null);
        setContentPane(panelAdministradorFormulario);
    }

    public static void main(String[] args){
        administradorFormulario dialog = new administradorFormulario();
        dialog.setVisible(true);
    }

}
