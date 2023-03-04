import java.awt.*;
import javax.swing.*;

class VentanaPrueba extends JFrame{
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();

	public VentanaPrueba() {
		getContentPane().setLayout(gbl);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ventana Principal");
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		
		JLabel txt1 = new JLabel("The Classic Form includes all visible fields for");
		MetodoMagicoAcomodo(txt1,0, 0, 2, 1);
		gbc.fill=GridBagConstraints.HORIZONTAL;
			
		JLabel txt2 = new JLabel("this list");
		MetodoMagicoAcomodo(txt2,0, 1, 2, 1);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		
	
		JLabel espv1= new JLabel(" ");
		MetodoMagicoAcomodo(espv1,0, 2, 2, 1);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		
		JLabel txt3 = new JLabel("Form options");
		txt3.setFont(new Font("Arial", Font.BOLD, 15));
		MetodoMagicoAcomodo(txt3,0, 3, 2, 1);
		
		JLabel txt4 = new JLabel("Include the following:");
		MetodoMagicoAcomodo(txt4,0, 4, 2, 1);
		

		JLabel espv2 = new JLabel(" ");
		MetodoMagicoAcomodo(espv2,0, 5, 2, 1);
		
		JCheckBox box1 = new JCheckBox("a title for you form");
		MetodoMagicoAcomodo(box1,0, 5, 2, 1);
	
		JTextField caja1 = new JTextField();
		MetodoMagicoAcomodo(caja1,0, 6, 2, 1);

		JLabel espv3 = new JLabel(" ");
		MetodoMagicoAcomodo(espv3,0, 7, 2, 1);

		ButtonGroup grupo = new ButtonGroup();
		JRadioButton btn1 = new JRadioButton("only required fields");
		grupo.add(btn1);
		MetodoMagicoAcomodo(btn1,0, 8, 2, 1);
		JRadioButton btn2 = new JRadioButton("all fields");
		grupo.add(btn2);
		MetodoMagicoAcomodo(btn2,0, 9, 2, 1);

		JLabel txt5 = new JLabel("   (edit required fields in the form builder)");
		MetodoMagicoAcomodo(txt5,0, 10, 2, 1);
	
		JLabel espv4 = new JLabel(" ");
		MetodoMagicoAcomodo(espv4,0, 11, 2, 1);

		JCheckBox box2 = new JCheckBox("interest group fields");
		gbc.fill=GridBagConstraints.HORIZONTAL;
		MetodoMagicoAcomodo(box2,0, 12, 2, 1);

		JCheckBox box3 = new JCheckBox("required field indicators");
		MetodoMagicoAcomodo(box3,0, 13, 2, 1);
	
		JLabel espv5 = new JLabel(" ");
		MetodoMagicoAcomodo(espv5,0, 14, 2, 1);
		
		JLabel txt6 = new JLabel("Set form width");
		MetodoMagicoAcomodo(txt6,0, 15, 2, 1);
		
		JTextField caja2 = new JTextField();
		MetodoMagicoAcomodo(caja2,0, 16, 2, 1);


		JLabel espv6 = new JLabel(" ");
		MetodoMagicoAcomodo(espv6,0, 17, 2, 1);
	
		JLabel txt7 = new JLabel("Enhance your form");
		MetodoMagicoAcomodo(txt7,0, 18, 2, 1);

		JCheckBox box4 = new JCheckBox("eneable evil popup mode");
		MetodoMagicoAcomodo(box4,0, 19, 2, 1);

		JCheckBox box5 = new JCheckBox("disable all JavaScript i Info");
		MetodoMagicoAcomodo(box5,0, 20, 2, 1);

		JCheckBox box6 = new JCheckBox("include archive link i Info");
		MetodoMagicoAcomodo(box6,0, 21, 2, 1);

		JCheckBox box7 = new JCheckBox("include MonkeyRewards link");
		MetodoMagicoAcomodo(box7,0, 22, 2, 1);

		JLabel espv7 = new JLabel("          ");
		MetodoMagicoAcomodo(espv7,2, 0, 1, 1);

		JLabel txt8 = new JLabel("Preview");
		txt8.setFont(new Font("Arial", Font.BOLD, 15));
		MetodoMagicoAcomodo(txt8,3, 0, 4, 1);
		
		JLabel espv8= new JLabel(" ");
		MetodoMagicoAcomodo(espv8,3, 0, 4, 1);

		JLabel txt10 = new JLabel("Email Address");
		MetodoMagicoAcomodo(txt10,3, 1, 4, 1);

		JTextField caja3 = new JTextField(20);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		MetodoMagicoAcomodo(caja3,3, 2, 4, 1);

		JLabel txt11 = new JLabel("First Name");
		gbc.fill=GridBagConstraints.HORIZONTAL;
		MetodoMagicoAcomodo(txt11,3, 3, 6, 1);

		JTextField caja4 = new JTextField(20);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		MetodoMagicoAcomodo(caja4,3, 4, 5, 1);

		JLabel txt12 = new JLabel("Last Name");
		MetodoMagicoAcomodo(txt12,3, 5, 5, 1);

		JTextField caja5 = new JTextField(20);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		MetodoMagicoAcomodo(caja5,3, 6, 5, 1);

		JButton btn3 = new JButton("Suscribe");
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setForeground(Color.WHITE);
		gbc.anchor = GridBagConstraints.WEST;
		MetodoMagicoAcomodo(btn3, 3, 7, 2, 1);
	
		JLabel espv9= new JLabel(" ");
		MetodoMagicoAcomodo(espv9,3, 8, 5, 1);

		JLabel txt13 = new JLabel("Copy/paste into your site");
		gbc.fill=GridBagConstraints.VERTICAL;
		MetodoMagicoAcomodo(txt13,3, 9, 5, 1);

		JTextArea areaTexto = new JTextArea();
		areaTexto.setText("enter the text ");
		areaTexto.setLineWrap(true);
		areaTexto.setWrapStyleWord(true);
		gbc.fill=GridBagConstraints.BOTH;
		MetodoMagicoAcomodo(areaTexto,3, 10,5, 11);
		
		
		JScrollPane scroll = new JScrollPane(areaTexto);
		gbc.fill=GridBagConstraints.BOTH;
		MetodoMagicoAcomodo(scroll,3, 10,4, 11);
		pack();
		setLocationRelativeTo(null);
	}
	public void MetodoMagicoAcomodo(Component com,int gx,int gy,int gw,int gh) {
		gbc.gridx=gx;
		gbc.gridy=gy;
		gbc.gridwidth=gw;
		gbc.gridheight=gh;
		gbl.setConstraints(com, gbc);
		add(com);
	}
}//class


public class PruebaGridBagLayout {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaPrueba();
			}
		});
	}
}