package org.example.vistas.consultaInfo;

import javax.swing.*;

public class infoFormulario extends JDialog{
    private JTable table1;
    private JButton buttonEliminar;
    private JButton buttonEdidar;
    private JButton buttonVolver;
    private JPanel panelInfo;

    public infoFormulario(){
        setSize(600,400);
        setLocationRelativeTo(null);
        setContentPane(panelInfo);


    }

    public static void main(String[] args){
        infoFormulario dialog = new infoFormulario();
        dialog.setVisible(true);
    }
}
