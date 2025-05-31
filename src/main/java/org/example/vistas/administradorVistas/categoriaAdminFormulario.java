package org.example.vistas.administradorVistas;

import javax.swing.*;

public class categoriaAdminFormulario extends JDialog{
    private JPanel panel1;
    private JTextField textFieldNombre;
    private JTable table1;
    private JTextArea textAreaDescripcion;
    private JButton buttonEliminar;
    private JButton buttonEditar;
    private JButton buttonCrear;
    private JTextField textFieldNumCategoria;
    private JButton buttonVolver;

    public categoriaAdminFormulario(){
        setSize(600, 400);
        setLocationRelativeTo(null);
        setContentPane(panel1);
    }

    public static void main(String[] args){
        categoriaAdminFormulario dialog = new categoriaAdminFormulario();
        dialog.setVisible(true);
    }
}
