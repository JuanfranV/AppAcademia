package org.example.vistas.estudianteVistas;

import javax.swing.*;

public class cursoEstudianteFormulario extends JDialog{
    private JTable table1;
    private JButton buttonSalirCurso;
    private JTable table2;
    private JPanel panelCursoEstudiante;
    private JButton buttonEntrar;
    private JButton buttonVolver;

    public cursoEstudianteFormulario(){
        setSize(600, 400);
        setLocationRelativeTo(null);
        setContentPane(panelCursoEstudiante);
    }

    public static void main(String[] args){
        cursoEstudianteFormulario dialog = new cursoEstudianteFormulario();
        dialog.setVisible(true);
    }
}
