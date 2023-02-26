import java.awt.*;
import javax.swing.*;

class VentanaPrueba extends JFrame{
	public VentanaPrueba() {
		getContentPane().setLayout(null);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ventana");
		setSize(850, 470);
		setLocationRelativeTo(null);
		setVisible(true);

		JLabel vent1= new JLabel("The Classic Form includes all visibles fields fort this list");
		vent1.setBounds(15, 0, 420, 20);
		vent1.setFont(new Font("Arial", 0 , 14));
		add(vent1);

		JLabel vent2= new JLabel("Form options");
		vent2.setBounds(15, 25, 400, 25);
		vent2.setFont(new Font("Arial", 0 , 16));
		add(vent2);

		JLabel vent3= new JLabel("Include the following:");
		vent3.setBounds(15, 55, 200, 10);
		vent3.setFont(new Font("Arial", 0 , 11));
		add(vent3);

		JCheckBox caja1= new JCheckBox("  a title for your form");
		caja1.setBounds(15, 70, 90, 10);
		caja1.setFont(new Font("Arial", 0 , 11));
		add(caja1);

		JTextField caja2= new JTextField();
		caja2.setBounds(15, 85, 200, 20);
		caja2.setText(" Subscribe to our mailing list");
		add(caja2);

		ButtonGroup grupo= new ButtonGroup();

		JRadioButton btn1= new JRadioButton(" only required fields");
		btn1.setFont(new Font("Arial", 0 , 11));
		grupo.add(btn1);
		btn1.setBounds(15, 140, 200, 15);
		add(btn1);
		JRadioButton btn2= new JRadioButton(" all fields");
		btn2.setFont(new Font("Arial", 0 , 11));
		grupo.add(btn2);
		btn2.setBounds(15, 160, 200, 15);
		add(btn2);

		JLabel txt = new JLabel("(edit required fields in the form builder)");
		txt.setFont(new Font("Arial", 0 , 11));
		txt.setBounds(40, 180, 250, 20);
		add(txt);

		JCheckBox box1= new JCheckBox("interest group fields");
		box1.setBounds(15, 220, 200, 15);
		box1.setFont(new Font("Arial", 0 , 11));
		add(box1);
		JCheckBox box2= new JCheckBox("required fields indicators");
		box2.setBounds(15, 240, 250, 15);
		box2.setFont(new Font("Arial", 0 , 11));
		add(box2);

		JLabel txt2= new JLabel("Set form width");
		txt2.setBounds(15, 270, 200, 15);
		txt2.setFont(new Font("Arial", 0 , 11));
		add(txt2);

		JTextField caja3=new JTextField();
		caja3.setBounds(15, 290, 200,25);
		add(caja3);

		JLabel txt3= new JLabel("Enhance your form");
		txt3.setBounds(15, 320, 100, 15);
		txt3.setFont(new Font("Arial", 0 , 11));
		add(txt3);

		JCheckBox box3= new JCheckBox("enable evil popup mode");
		box3.setBounds(15, 340, 200, 15);
		box3.setFont(new Font("Arial", 0 , 11));
		add(box3);
		JCheckBox box4= new JCheckBox("disable all JavaScript");
		box4.setBounds(15, 360, 250, 15);
		box4.setFont(new Font("Arial", 0 , 11));
		add(box4);
		JCheckBox box5= new JCheckBox("inlcude archive link");
		box5.setBounds(15, 380, 200, 15);
		box5.setFont(new Font("Arial", 0 , 11));
		add(box5);
		JCheckBox box6= new JCheckBox("include MonkeyRewards Link");
		box6.setBounds(15, 400, 250, 15);
		box6.setFont(new Font("Arial", 0 , 11));
		add(box6);

		
		JLabel txtP7 = new JLabel("Preview");   
		txtP7.setBounds(400, 5, 100, 15);
		txtP7.setFont(new Font("Arial", 0, 16));
		add(txtP7);
		
		JLabel txt6 = new JLabel("Email Address");
		txt6.setBounds(400, 30, 100, 20);
		txt6.setFont(new Font("Arial", 0 , 14));
		add(txt6);
		JTextField txt66= new JTextField();
		txt66.setBounds(400, 50, 400, 20);
		add(txt66);
		
		
		JLabel txt7 = new JLabel("First Name");
		txt7.setBounds(400, 75, 100, 15);
		txt7.setFont(new Font("Arial", 0 , 14));
		add(txt7);
		JTextField txt77= new JTextField();
		txt77.setBounds(400, 90, 400, 20);
		add(txt77);
		
		JLabel txt8 = new JLabel("Last Name");
		txt8.setBounds(400, 115, 100, 15);
		txt8.setFont(new Font("Arial", 0 , 14));
		add(txt8);
		JTextField txt88= new JTextField();
		txt88.setBounds(400, 130, 400, 20);
		add(txt88);
		
		JButton bton = new JButton("Subscribe");
		bton.setBounds(400, 160, 100, 20);
		bton.setBackground(Color.LIGHT_GRAY);
		bton.setForeground(Color.WHITE);
		add(bton);
		
		JLabel txt9 = new JLabel("Copy/paste onto your site");
		txt9.setBounds(380, 225, 190, 20);
		txt9.setFont(new Font("Arial", 0 , 15));
		add(txt9);
		JTextArea areaTexto = new JTextArea(400, 110);
		areaTexto.setBounds(380, 250, 420, 120);
		areaTexto.setText("Hola, aqui va todo el texto");
		add(areaTexto);
	}
}


public class Prueba_Layout_Null {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaPrueba();
			}
		});
	}//main

}//proyecto
