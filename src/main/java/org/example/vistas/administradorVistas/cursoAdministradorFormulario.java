package org.example.vistas.administradorVistas;

import javax.swing.*;

public class cursoAdministradorFormulario extends JDialog{
    private JTextField textFieldNombre;
    private JComboBox comboBox1;
    private JTextArea textArea1;
    private JTextField textFieldFechaInicio;
    private JTextField textFieldFechaFin;
    private JPanel panelAdministrarCurso;

    public cursoAdministradorFormulario(){
        setSize(600,200);
        setLocationRelativeTo(null);
        setContentPane(panelAdministrarCurso);
    }

    public static void main(String[] args){
        cursoAdministradorFormulario dialog = new cursoAdministradorFormulario();
        dialog.setVisible(true);
    }
}
