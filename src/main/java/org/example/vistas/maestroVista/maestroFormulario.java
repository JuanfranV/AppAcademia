package org.example.vistas.maestroVista;

import javax.swing.*;

public class maestroFormulario extends JDialog{
    private JButton buttonListarCursos;
    private JTable table1;
    private JTextField textFieldNumeroDetalles;
    private JButton buttonDetalles;
    private JPanel panelProfesor;
    private JButton buttonConsultarInfo;

    public maestroFormulario(){
        setSize(600, 400);
        setLocationRelativeTo(null);
        setContentPane(panelProfesor);


    }

    public static void main(String[] args){
        maestroFormulario dialog = new maestroFormulario();
        dialog.setVisible(true);
    }
}
