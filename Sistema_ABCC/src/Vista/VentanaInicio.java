package Vista;

import controlador.AlumnoDAO;
import modelo.Alumno;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInicio extends JFrame implements ActionListener {

    JMenuBar menuBar;
    String datos[]= {"1","2","3","4","5","6","7","8","9","10","11","12"};
    JMenu menu;
    JInternalFrame Altas, Bajas, Cambios ,Consultas;
    JMenuItem itemAltas,itemBajas,itemCambios,itemConsultas;
    JButton btnAgregar, btnBorrar,btnCancelar, btnEliminar2,btnCancelar2,btnBorrar2,btnGuadarC;
    JTextField tfnumControl,tfNombre,tfAp,tfAm,tfNumControl2,tfNombre2,tfAp2,tfAm2,tfNumControl3,tfNombre3,tfAp3,tfAm3;
    JComboBox<String> comboEdad,comboSemestre,comboCarrera,comboEdad2,comboCarrera2,comboEdad3,comboCarrera3;
    SpinnerListModel modeloDatos;
    JSpinner spinner,spinner2;
    JScrollPane scrollPane,scrollPane2;
    public VentanaInicio(){
        getContentPane().setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Sistema ABCC");
        setSize(700, 600);
        setLocationRelativeTo(null);
        setVisible(true);


        menuBar =new  JMenuBar();
        menu = new JMenu();
        menu.setIcon(new ImageIcon("./imagenes/menusito.png"));

        itemAltas = new JMenuItem("Agregar");
        itemAltas.setIcon(new ImageIcon("./imagenes/add.png"));
        itemAltas.addActionListener(this);
        menu.add(itemAltas);

        itemBajas = new JMenuItem("Bajas");
        itemBajas.setIcon(new ImageIcon("./imagenes/Remove.png"));
        itemBajas.addActionListener(this);
        menu.add(itemBajas);

        itemCambios = new JMenuItem("Cambios");
        itemCambios.setIcon(new ImageIcon("./imagenes/cambio.png"));
        itemCambios.addActionListener(this);
        menu.add(itemCambios);

        itemConsultas  = new JMenuItem("Consultas");
        itemConsultas.setIcon(new ImageIcon("./imagenes/buscar.png"));
        itemConsultas.addActionListener(this);

        menu.add(itemConsultas);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        //============================ALTAS==========================000

        //DesktoPane
        JDesktopPane desktopPane = new JDesktopPane();
        Altas = new JInternalFrame();
        Altas.getContentPane().setLayout(null);
        Altas.setDefaultCloseOperation(HIDE_ON_CLOSE);
        Altas.setTitle("ALTAS");
        Altas.setSize(690, 550);
        Altas.setClosable(true);
        Altas.setResizable(false);



        JLabel lbl1  = new JLabel("ALTAS");
        lbl1.setFont(new Font("Arial", Font.BOLD, 30));
        lbl1.setForeground(Color.white);
        lbl1.setBounds(15, 0, 685, 60);
        Altas.add(lbl1);
        JLabel fondo = new JLabel();
        fondo.setBounds(0, 0, 684, 60);
        fondo.setBackground(Color.green);
        fondo.setOpaque(true);
        Altas.add(fondo);

        JLabel lbl_numControl = new JLabel("NUMERO DE CONTROL: ");
        lbl_numControl.setBounds(90, 70, 150, 10);
        Altas.add(lbl_numControl);
        tfnumControl = new JTextField();
        tfnumControl.setBounds(240, 68, 170, 20);
        Altas.add(tfnumControl);

        JLabel lbl2 = new JLabel("NOMBRE(S): ");
        lbl2.setBounds(90, 95, 150, 15);
        Altas.add(lbl2);
        tfNombre = new JTextField();
        tfNombre.setBounds(240, 93, 170, 20);
        Altas.add(tfNombre);


        JLabel lbl3= new JLabel("Edad: ");
        lbl3.setBounds(90,120,200,15);
        Altas.add(lbl3);
        comboEdad=new JComboBox<String>();
        comboEdad.addItem("Selecciona Edad..");
        for (int i=1;i<=120;i++) {
            String n=String.valueOf(i);
            comboEdad.addItem(n);
        }
        comboEdad.setBounds(240,120,170,20);
        Altas.add(comboEdad);

        JLabel lblAp = new JLabel("APELLIDO PATERNO: ");
        lblAp.setBounds(90, 150, 150, 15);
        Altas.add(lblAp);

        tfAp = new JTextField();
        tfAp.setBounds(240, 150, 170, 20);
        Altas.add(tfAp);

        JLabel lblAm = new JLabel("APELLIDO MATERNO:");
        lblAm.setBounds(90, 180, 150, 15);
        Altas.add(lblAm);
        tfAm = new JTextField();
        tfAm.setBounds(240, 175, 170, 20);
        Altas.add(tfAm);

        JLabel lblSemestre = new JLabel("SEMESTRE:");
        lblSemestre.setBounds(90, 200, 150, 15);
        Altas.add(lblSemestre);

        comboSemestre=new JComboBox<String>();
        comboSemestre.addItem("Elige Semestre..");
        for (int i=1;i<=12;i++) {
            String n=String.valueOf(i);
            comboSemestre.addItem(n);
        }
        comboSemestre.setBounds(240,200,170,20);
        Altas.add(comboSemestre);

        JLabel lblCarrera = new JLabel("CARRERA:");
        lblCarrera.setBounds(90, 225, 150, 15);
        Altas.add(lblCarrera);
        String [] items2 = {"Elige Carrera:", "ISC", "IM", "IIA", "LA", "LCP"};
        comboCarrera = new JComboBox<>(items2);
        comboCarrera.setBounds(240, 228, 170, 20);
        Altas.add(comboCarrera);

        btnAgregar = new JButton("AGREGAR");
        btnAgregar.setBounds(450, 80, 100, 20);
        btnAgregar.addActionListener(this);
        Altas.add(btnAgregar);

        btnBorrar = new JButton("BORRAR");
        btnBorrar.setBounds(450, 160, 100, 20);
        Altas.add(btnBorrar);

        btnCancelar = new JButton("CANCELAR");
        btnCancelar.setBounds(450, 210, 100, 20);
        Altas.add(btnCancelar);

        String[] columnNames = {"No. De Control", "Nombre", "Edad", "Apellido Paterno", "Apellido Materno", "Semestre", "Carrera"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        JTable table = new JTable(model);
        scrollPane=  new JScrollPane(table);
        scrollPane.setBounds(90,300,480,100);
        Altas.add(scrollPane);

        desktopPane.add(Altas);

        //====================================BAJAS=============================================

        Bajas = new JInternalFrame();
        Bajas.getContentPane().setLayout(null);
        Bajas.setDefaultCloseOperation(HIDE_ON_CLOSE);
        Bajas.setTitle("Bajas");
        Bajas.setSize(690, 550);
        Bajas.setClosable(true);
        Bajas.setResizable(false);




        JLabel lblBajas = new JLabel("BAJAS");
        lblBajas.setFont(new Font("Arial", Font.BOLD, 30));
        lblBajas.setForeground(Color.white);
        lblBajas.setBounds(15, 0, 684, 60);
        Bajas.add(lblBajas);

        JLabel lblFondo2 = new JLabel();
        lblFondo2.setBounds(0, 0, 684, 60);
        lblFondo2.setBackground(Color.red);
        lblFondo2.setOpaque(true);
        Bajas.add(lblFondo2);

        JLabel lblNumControl2 = new JLabel("NUMERO DE CONTROL:");
        lblNumControl2.setBounds(70, 70, 150, 20);
        Bajas.add(lblNumControl2);
        tfNumControl2 = new JTextField();
        tfNumControl2.setBackground(Color.cyan);
        tfNumControl2.setBounds(220, 70, 100, 25);
        Bajas.add(tfNumControl2);

        JButton btnBuscar= new JButton();
        btnBuscar.setIcon(new ImageIcon("./imagenes/lupa.png"));
        btnBuscar.setBackground(Color.gray);
        btnBuscar.setBounds(340,70,100,25);
        btnBuscar.setBackground(Color.white);
        Bajas.add(btnBuscar);

        btnBorrar2= new JButton("BORRAR");
        btnBorrar2.setBounds(450,70,100,25);
        btnBorrar2.setBackground(Color.white);
        Bajas.add(btnBorrar2);

        JLabel lblNombre2 = new JLabel("NOMBRE(S):");
        lblNombre2.setBounds(70, 110, 150, 15);
        Bajas.add(lblNombre2);
        tfNombre2 = new JTextField();
        tfNombre2.setBounds(220, 110, 150, 20);
        Bajas.add(tfNombre2);



        JLabel lblEdad2 = new JLabel("EDAD: ");
        lblEdad2.setBounds(70,140,150,20);
        Bajas.add(lblEdad2);
        comboEdad2=new JComboBox<String>();
        comboEdad2.addItem("Selecciona Edad..");
        for (int i=1;i<=120;i++) {
            String n=String.valueOf(i);
            comboEdad2.addItem(n);
        }
        comboEdad2.setBounds(220,140,150,20);
        Bajas.add(comboEdad2);

        JLabel lblAp2 = new JLabel("APELLIDO PATERNO:");
        lblAp2.setBounds(70, 170, 150, 10);
        Bajas.add(lblAp2);
        tfAp2 = new JTextField();
        tfAp2.setBounds(220, 170, 150, 20);
        Bajas.add(tfAp2);

        JLabel lblAm2 = new JLabel("APELLIDO MATERNO:");
        lblAm2.setBounds(70, 200, 150, 10);
        Bajas.add(lblAm2);
        tfAm2 = new JTextField();
        tfAm2.setBounds(220, 200, 150, 20);
        Bajas.add(tfAm2);

        JLabel lblSemestre2 = new JLabel("SEMESTRE:");
        lblSemestre2.setBounds(70, 225, 150, 15);
        Bajas.add(lblSemestre2);

        modeloDatos = new SpinnerListModel(datos);
        spinner = new JSpinner(modeloDatos);
        spinner.setBounds(220,225,150,22);
        Bajas.add(spinner);

        JLabel lblCarrera2 = new JLabel("CARRERA:");
        lblCarrera2.setBounds(70, 260, 150, 10);
        Bajas.add(lblCarrera2);

        String carrera [] = {"Selecciona Carrera...","ISC", "IIA", "IM", "LA", "LCP"};
        comboCarrera2 = new JComboBox<>(carrera);
        comboCarrera2.setBounds(220, 260, 150, 20);
        Bajas.add(comboCarrera2);

        btnEliminar2 = new JButton("ELIMINAR");
        btnEliminar2.setBounds(450, 155, 100, 25);
        btnEliminar2.setBackground(Color.white);
        btnEliminar2.addActionListener(this);
        Bajas.add(btnEliminar2);

        btnCancelar2= new JButton("CANCELAR");
        btnCancelar2.setBounds(450,230,100,25);
        btnCancelar2.setBackground(Color.white);
        Bajas.add(btnCancelar2);

        JTable table2 = new JTable(model);
        scrollPane2=  new JScrollPane(table2);
        scrollPane2.setBounds(100,300,480,100);
        Bajas.add(scrollPane2);

        desktopPane.add(Bajas);

        //=======================================CAMBIOS========================

        Cambios= new JInternalFrame();
        Cambios.getContentPane().setLayout(null);
        Cambios.setDefaultCloseOperation(HIDE_ON_CLOSE);
        Cambios.setTitle("Cambios");
        Cambios.setSize(690, 550);
        Cambios.setClosable(true);
        Cambios.setResizable(false);




        JLabel lblCambios= new JLabel(" CAMBIOS");
        lblCambios.setFont(new Font("Arial", Font.BOLD, 30));
        lblCambios.setForeground(Color.white);
        lblCambios.setBounds(5, 0, 684, 60);
        Cambios.add(lblCambios);

        JLabel lblFondo3 = new JLabel();
        lblFondo3.setBounds(0, 0, 684, 60);
        lblFondo3.setBackground(Color.orange);
        lblFondo3.setOpaque(true);
        Cambios.add(lblFondo3);

        JLabel lblNumControl3 = new JLabel("NUMERO DE CONTROL:");
        lblNumControl3.setBounds(70, 70, 150, 20);
        Cambios.add(lblNumControl3);
        tfNumControl3 = new JTextField();
        tfNumControl3.setBackground(Color.cyan);
        tfNumControl3.setBounds(220, 70, 100, 25);
        Cambios.add(tfNumControl3);

        JButton btnBuscar2= new JButton();
        btnBuscar2.setIcon(new ImageIcon("./imagenes/lupa.png"));
        btnBuscar2.setBackground(Color.gray);
        btnBuscar2.setBounds(340,70,100,25);
        btnBuscar2.setBackground(Color.white);
        Cambios.add(btnBuscar2);

        JButton btnBorrar3= new JButton("BORRAR");
        btnBorrar3.setBounds(450,70,100,25);
        btnBorrar3.setBackground(Color.white);
        Cambios.add(btnBorrar3);

        JLabel lblNombre3 = new JLabel("NOMBRE(S):");
        lblNombre3.setBounds(70, 110, 150, 15);
        Cambios.add(lblNombre3);
        tfNombre3 = new JTextField();
        tfNombre3.setBounds(220, 110, 150, 20);
        Cambios.add(tfNombre3);



        JLabel lblEdad3 = new JLabel("EDAD: ");
        lblEdad3.setBounds(70,140,150,20);
        Cambios.add(lblEdad3);
        comboEdad3=new JComboBox<String>();
        comboEdad3.addItem("Selecciona Edad..");

        for (int i=1;i<=120;i++) {
            String n=String.valueOf(i);
            comboEdad3.addItem(n);
        }
        comboEdad3.setBounds(220,140,150,20);
        Cambios.add(comboEdad3);

        JLabel lblAp3 = new JLabel("APELLIDO PATERNO:");
        lblAp3.setBounds(70, 170, 150, 10);
        Cambios.add(lblAp3);
        tfAp3 = new JTextField();
        tfAp3.setBounds(220, 170, 150, 20);
        Cambios.add(tfAp3);

        JLabel lblAm3 = new JLabel("APELLIDO MATERNO:");
        lblAm3.setBounds(70, 200, 150, 10);
        Cambios.add(lblAm3);
        tfAm3 = new JTextField();
        tfAm3.setBounds(220, 200, 150, 20);
        Cambios.add(tfAm3);

        JLabel lblSemestre3 = new JLabel("SEMESTRE:");
        lblSemestre3.setBounds(70, 225, 150, 15);
        Cambios.add(lblSemestre3);

        spinner2 = new JSpinner(modeloDatos);
        spinner2.setBounds(220,225,150,22);
        Cambios.add(spinner2);

        JLabel lblCarrera3 = new JLabel("CARRERA:");
        lblCarrera3.setBounds(70, 260, 150, 10);
        Cambios.add(lblCarrera3);

        comboCarrera3 = new JComboBox<>(carrera);
        comboCarrera3.setBounds(220, 260, 150, 20);
        Cambios.add(comboCarrera3);

        btnGuadarC = new JButton("Guardar Cambios");
        btnGuadarC.setBounds(450, 155, 100, 25);
        btnGuadarC.setBackground(Color.white);
        btnGuadarC.addActionListener(this);
        Cambios.add(btnGuadarC);

        JButton btnCancelar3= new JButton("CANCELAR");
        btnCancelar3.setBounds(450,230,100,25);
        btnCancelar3.setBackground(Color.white);
        Cambios.add(btnCancelar3);

        JTable table3 = new JTable(model);
        JScrollPane scrollPane3=  new JScrollPane(table3);
        scrollPane3.setBounds(100,300,480,100);
        Cambios.add(scrollPane3);

        desktopPane.add(Cambios);

        //================================CONSULTAS=============================


        Consultas = new JInternalFrame();
        Consultas.getContentPane().setLayout(null);
        Consultas.setDefaultCloseOperation(HIDE_ON_CLOSE);
        Consultas.setTitle("Consultas");
        Consultas.setSize(690, 550);
        Consultas.setClosable(true);
        Consultas.setResizable(false);


        JLabel lblConsultas = new JLabel("CONSULTAS");
        lblConsultas.setFont(new Font("Arial", Font.BOLD, 30));
        lblConsultas.setForeground(Color.white);
        lblConsultas.setBounds(5, 0, 684, 60);
        Consultas.add(lblConsultas);

        JLabel lblFondo4 = new JLabel();
        lblFondo4.setBounds(0, 0, 684, 60);
        lblFondo4.setBackground(Color.blue);
        lblFondo4.setOpaque(true);
        Consultas.add(lblFondo4);



        JRadioButton radioTodos;


        JLabel seleccion = new JLabel("Selecciona Criterio de Busqueda");
        seleccion.setBounds(60, 60, 500, 30);
        Consultas.add(seleccion);

        radioTodos = new JRadioButton("TODOS");
        radioTodos.setBounds(40, 100, 80, 30);
        Consultas.add(radioTodos);

        JRadioButton radioNombre = new JRadioButton("NOMBRE:");
        radioNombre.setBounds(130, 100, 100, 30);
        Consultas.add(radioNombre);

        JTextField tfNombre4 = new JTextField();
        tfNombre4.setBounds(280, 100, 120, 20);
        Consultas.add(tfNombre4);


        JRadioButton radioEdad = new JRadioButton("EDAD: ");
        radioEdad.setBounds(130,140,100,20);
        Consultas.add(radioEdad);

        JComboBox<String> comboEdad4=new JComboBox<String>();
        comboEdad4.addItem("Selecciona Edad..");
        comboEdad4.setBounds(280,140,150,20);
        Consultas.add(comboEdad4);

        JRadioButton radioAp = new JRadioButton("APELLIDO PATERNO:");
        radioAp.setBounds(130, 180, 150, 20);
        Consultas.add(radioAp);

        JTextField txtAp1 = new JTextField();
        txtAp1.setBounds(280, 180, 120, 20);
        Consultas.add(txtAp1);

        JRadioButton radioAp2 = new JRadioButton("APELLIDO MATERNO:");
        radioAp2.setBounds(130, 220, 160, 20);
        Consultas.add(radioAp2);

        JTextField tfAp4 = new JTextField();
        tfAp4.setBounds(280, 220, 120, 20);
        Consultas.add(tfAp4);

        JRadioButton radioSemestre= new JRadioButton("SEMESTRE:");
        radioSemestre.setBounds(130, 260, 150, 20);
        Consultas.add(radioSemestre);

        JSpinner spinner3 = new JSpinner(modeloDatos);
        spinner3.setBounds(280,260,150,20);
        Consultas.add(spinner3);

        JRadioButton radioCarrera = new JRadioButton("CARRERA:");
        radioCarrera.setBounds(130, 290, 150, 20);
        Consultas.add(radioCarrera);

        JComboBox<String> comboCarrera4 = new JComboBox<>(carrera);
        comboCarrera4.setBounds(280, 290, 150, 20);
        Consultas.add(comboCarrera4);

        JButton botonBusqueda4 = new JButton();
        botonBusqueda4.setBounds(530, 135, 100, 35);
        botonBusqueda4.setIcon(new ImageIcon("./imagenes/lupa.png"));
        Consultas.add(botonBusqueda4);

        JButton btnCancelar4 = new JButton("CANCELAR");
        btnCancelar4.setBounds(530, 260, 100, 40);
        Consultas.add(btnCancelar4);

        JButton btnBorrar4 = new JButton("BORRAR");
        btnBorrar4.setBounds(530, 200, 100, 40);
        Consultas.add(btnBorrar4);

        JTable table4 = new JTable(model);
        JScrollPane scrollPane4=  new JScrollPane(table4);
        scrollPane4.setBounds(100,320,480,100);
        Consultas.add(scrollPane4);

        desktopPane.add(Consultas);
        add(desktopPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaInicio();
            }
        });

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Component c=(Component) e.getSource();
        if(c==itemAltas) {
            Altas.setVisible(true);
            Bajas.setVisible(false);
            Cambios.setVisible(false);
            Consultas.setVisible(false);
        }else if(c==itemBajas){
            Bajas.setVisible(true);
            Altas.setVisible(false);
            Cambios.setVisible(false);
            Consultas.setVisible(false);
        } else if (c==itemCambios) {
            Bajas.setVisible(false);
            Altas.setVisible(false);
            Cambios.setVisible(true);
            Consultas.setVisible(false);
        } else if (c==itemConsultas) {
            Bajas.setVisible(false);
            Altas.setVisible(false);
            Cambios.setVisible(false);
            Consultas.setVisible(true);
        }else if (c==btnAgregar){
            AlumnoDAO alumno1 =  new AlumnoDAO();
            Alumno a1= new Alumno (tfnumControl.getText(),tfNombre.getText(),tfAp.getText(),tfAm.getText(),
                    (byte) Integer.parseInt(String.valueOf((comboEdad.getSelectedIndex())+1)),  (byte) Integer.parseInt(String.valueOf((comboSemestre.getSelectedIndex())+1)),
                    comboCarrera.getItemAt(comboCarrera.getSelectedIndex()));
            System.out.println(alumno1.agregarAlumno(a1));
        } else if (c==btnEliminar2) {
            AlumnoDAO alumnoDAO =  new AlumnoDAO();
            System.out.println(alumnoDAO.eliminarAlumno(tfNumControl2.getText()));

        } else if (c== btnGuadarC) {
            AlumnoDAO alumnoDAO =  new AlumnoDAO();
            Alumno a1= new Alumno (tfNumControl3.getText(),tfNombre3.getText(),tfAp3.getText(),tfAm3.getText(),
                    (byte) Integer.parseInt(String.valueOf((comboEdad3.getSelectedIndex())+1)), Byte.parseByte(spinner2.getValue().toString()),
                    comboCarrera3.getItemAt(comboCarrera3.getSelectedIndex()));
            System.out.println(alumnoDAO.agregarAlumno(a1));
        }
    }
}
