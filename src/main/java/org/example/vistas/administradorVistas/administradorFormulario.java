package org.example.vistas.administradorVistas;

import javax.swing.*;

public class administradorFormulario extends JDialog {


    private JPanel panelAdministradorFormulario;
    private JButton administrarCursoButton;
    private JButton administrarCategoríaButton;
    private JButton administrarMaestrosButton;
    private JButton deAdministradorButton;
    private JButton deProfesorButton;

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
