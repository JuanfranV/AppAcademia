package org.example.vistas.consultaInfo;

import javax.swing.*;

public class infoActualizar extends JDialog{
    private JTextField textFieldNombres;
    private JTextField textFieldApellidos;
    private JTextField textFieldEmail;
    private JButton buttonActualizar;
    private JButton buttonVolver;
    private JPanel panelActuInfo;

    public infoActualizar(){
        setSize(600, 400);
        setLocationRelativeTo(null);
        setContentPane(panelActuInfo);


    }

    public static void main(String[] args){
        infoActualizar dialog = new infoActualizar();
        dialog.setVisible(true);
    }
}
