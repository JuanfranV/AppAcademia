package org.example.vistas.administradorVistas;

import javax.swing.*;

public class editarCategoria extends JDialog{
    private JTextField textFieldNombre;
    private JTextArea textAreaDescripcion;
    private JButton buttonActualizar;
    private JPanel panelEditarCategoria;
    private JButton buttonVolver;

    public editarCategoria(){
        setSize(600, 400);
        setLocationRelativeTo(null);
        setContentPane(panelEditarCategoria);
    }

    public static void main(String[] args){
        editarCategoria dialog = new editarCategoria();
        dialog.setVisible(true);
    }
}
