package org.example.vistas.administradorVistas;

import javax.swing.*;

public class editarCursoFormulario extends JDialog{
    private JTextField textFieldNombre;
    private JComboBox comboBoxCategoria;
    private JTextArea textAreaDescripcion;
    private JButton buttonVolver;
    private JTextField textFieldFechaInicio;
    private JTextField textFieldFechaFin;
    private JButton buttonActualizar;
    private JPanel panelEditarCurso;

    public editarCursoFormulario(){
        setSize(600, 450);
        setLocationRelativeTo(null);
        setContentPane(panelEditarCurso);


    }

    public static void main(String[] args){
        editarCursoFormulario dialog = new editarCursoFormulario();
        dialog.setVisible(true);
    }

}
