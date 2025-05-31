package org.example.vistas.administradorVistas;

import javax.swing.*;

public class cursoAdministradorFormulario extends JDialog{
    private JTextField textFieldNombre;
    private JComboBox comboBoxCategoria;
    private JTextArea textAreaDescripcion;
    private JTextField textFieldFechaInicio;
    private JTextField textFieldFechaFin;
    private JPanel panelAdministrarCurso;
    private JButton buttonCrearCurso;
    private JTable table1;
    private JButton buttonVolver;
    private JTextField textFieldnumeroElimEdit;
    private JButton buttonEditar;
    private JButton buttonEliminar;

    public cursoAdministradorFormulario(){
        setSize(650,400);
        setLocationRelativeTo(null);
        setContentPane(panelAdministrarCurso);
    }

    public static void main(String[] args){
        cursoAdministradorFormulario dialog = new cursoAdministradorFormulario();
        dialog.setVisible(true);
    }
}
