package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaInicio extends JFrame {

    JMenuBar menuBar;
    JMenu menu;
    public VentanaInicio(){
        getContentPane().setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("BASE DE DATOS DEL TEATRO");
        setSize(1300,900);
        setLocationRelativeTo(null);
        setVisible(true);

        menuBar = new JMenuBar();
        menu = new JMenu();
        menu.setIcon(new ImageIcon("./imagenes/menusito.png"));


        menuBar.add(menu); //AQUI SE AGREGAN TODAS LAS OPCIONES QUE ESTARAN EN EL MENUBAR
        setJMenuBar(menuBar);// AQUI YA SE AGREGA EL JMENU AL JSFRAME

    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaInicio();
            }
        });
    }//main
}//claseVentanaInicio
