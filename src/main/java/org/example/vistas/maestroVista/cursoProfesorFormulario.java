package org.example.vistas.maestroVista;

import javax.swing.*;

public class cursoProfesorFormulario extends JDialog{
    private JTable table1;
    private JTable table2;
    private JTextField textFieldNumParticipante;
    private JButton buttonPonerNota;
    private JButton buttonExpulsar;
    private JPanel panelCursoProfesor;
    private JButton buttonVolver;

    public cursoProfesorFormulario(){
        setSize(600, 400);
        setLocationRelativeTo(null);
        setContentPane(panelCursoProfesor);


    }

    public static void main(String[] args){
        cursoProfesorFormulario dialog = new cursoProfesorFormulario();
        dialog.setVisible(true);
    }
}
