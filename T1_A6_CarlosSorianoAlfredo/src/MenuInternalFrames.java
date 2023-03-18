import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class VentanaInicio extends JFrame{
	JInternalFrame IF;
	GridBagConstraints gbc =new GridBagConstraints();
	GridBagLayout gbl = new GridBagLayout();
	
	GridBagConstraints gbc1 =new GridBagConstraints();
	GridBagLayout gbl1 = new GridBagLayout();
	
	GridBagConstraints gbc2 =new GridBagConstraints();
	GridBagLayout gbl2 = new GridBagLayout();
	
	GridBagLayout gbl3 = new GridBagLayout();
	GridBagConstraints gbc3 = new GridBagConstraints();
	
	GridBagLayout gbl4= new GridBagLayout();
	GridBagConstraints gbc4 = new GridBagConstraints();
	
	GridBagLayout gbl5= new GridBagLayout();
	GridBagConstraints gbc5 = new GridBagConstraints();
	
	GridBagLayout gbl6= new GridBagLayout();
	GridBagConstraints gbc6 = new GridBagConstraints();
	
	
	public VentanaInicio() {
			getContentPane().setLayout(gbl);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setTitle("Internal Frame");
			setMaximumSize(getMaximumSize());
			setVisible(true);
			
			JMenuBar menuBar = new JMenuBar();
			JMenu menuMasters = new JMenu("Masters");
			JMenu menubooking = new JMenu("booking");
			JMenu menuTest = new JMenu("Test Perform");
			JMenu menuprint = new JMenu("Printing");
			JMenu menuTransaction = new JMenu("Transaction");
			JMenu menuLab = new JMenu("Lab Report");
			JMenu menusetings = new JMenu("Setings");
			JMenu menuUtilities = new JMenu("Utilities");
			JMenu menuWindow = new JMenu("Window");
			JMenu menuhelp = new JMenu("help");
			
			menuBar.add(menuMasters);
			menuBar.add(menubooking);
			menuBar.add(menuTest);
			menuBar.add(menuprint);
			menuBar.add(menuTransaction);
			menuBar.add(menuLab);
			menuBar.add(menusetings);
			menuBar.add(menuUtilities);
			menuBar.add(menuWindow);
			menuBar.add(menuhelp);
			MetodoLlenado(menuBar, 0, 0, 3, 1);			
			
			
			JToolBar toolBar= new JToolBar(JToolBar.HORIZONTAL);
			JButton btnAdd = new JButton();
			btnAdd.setIcon(new ImageIcon("./assets/add.png"));
			toolBar.add(btnAdd);
			JButton btnEdit = new JButton();
			btnEdit.setIcon(new ImageIcon("./assets/edit.png"));
			toolBar.add(btnEdit);
			JButton btnback = new JButton();
			btnback.setIcon(new ImageIcon("./assets/back.png"));
			toolBar.add(btnback);
			JButton btnnext = new JButton();
			btnnext.setIcon(new ImageIcon("./assets/next.png"));
			toolBar.add(btnnext);
			JButton btnList = new JButton();
			btnList.setIcon(new ImageIcon("./assets/list.png"));
			toolBar.add(btnList);
			JButton btnsave = new JButton();
			btnsave.setIcon(new ImageIcon("./assets/save.png"));
			toolBar.add(btnsave);
			JButton btnprint = new JButton();
			btnprint.setIcon(new ImageIcon("./assets/print.png"));
			toolBar.add(btnprint);
			JButton btntest = new JButton();
			btntest.setIcon(new ImageIcon("./assets/icono.png"));
			toolBar.add(btntest);
			JButton btncancel = new JButton();
			btncancel.setIcon(new ImageIcon("./assets/cancel.png"));
			toolBar.add(btncancel);
			JButton btnsetting = new JButton();
			btnsetting.setIcon(new ImageIcon("./assets/settings.png"));
			toolBar.add(btnsetting);
			JButton btndelete = new JButton();
			btndelete.setIcon(new ImageIcon("./assets/delete.png"));
			toolBar.add(btndelete);
			JButton btnslip = new JButton();
			btnslip.setIcon(new ImageIcon("./assets/slip.png"));
			toolBar.add(btnslip);
			JButton btnExit = new JButton();
			btnExit.setIcon(new ImageIcon("./assets/exit.png"));
			toolBar.add(btnExit);
			MetodoLlenado(toolBar, 0, 1, 1, 1);
			
			
//			JDesktopPane desktopPane = new JDesktopPane();
			 IF = new JInternalFrame();
			IF.getContentPane().setLayout(gbl2);
			IF.setVisible(true);
			
			
			JPanel pnl1= new JPanel();
			pnl1.setLayout(gbl1);
			JLabel lbl= new JLabel("Patient ID:");
			MetodoLlenado1(lbl, 0, 0, 1, 1);
			pnl1.add(lbl);
			JTextField txt1 = new JTextField(5);
			MetodoLlenado1(txt1, 1, 0, 1, 1);
			pnl1.add(txt1);
			JLabel lbl2 = new JLabel("		Date	");
			MetodoLlenado1(lbl2, 2, 0, 1, 1);
			pnl1.add(lbl2);
			JComboBox<String> box1 = new JComboBox<String>();
			box1.addItem("12/12/2020");
			MetodoLlenado1(box1, 3, 0, 1, 1);
			pnl1.add(box1);
			
			JLabel lbl3 = new JLabel("  *Time (hh..mm)");
			MetodoLlenado1(lbl3, 4, 0, 1, 1);
			pnl1.add(lbl3);
			JTextField txt2 = new JTextField(1);
			MetodoLlenado1(txt2, 5,0, 1, 1);
			pnl1.add(txt2);
			JLabel lbl4 = new JLabel(":");
			MetodoLlenado1(lbl4, 6, 0, 1, 1);
			pnl1.add(lbl4);
			JTextField txt3 = new JTextField(1);
			MetodoLlenado1(txt3, 7, 0, 1, 1);
			pnl1.add(txt3);
			JLabel lbl5 = new JLabel("	Lab No.		");
			MetodoLlenado1(lbl5, 8, 0, 1, 1);
			pnl1.add(lbl5);
			JTextField txt4 = new JTextField(5);
			MetodoLlenado1(txt4, 9, 0, 1, 1);
			pnl1.add(txt4);
			gbc1.fill=GridBagConstraints.HORIZONTAL;
			JLabel lbl6 = new JLabel("Name:");
			MetodoLlenado1(lbl6, 0, 2, 1, 1);
			pnl1.add(lbl6);
			JComboBox<String> box2 = new JComboBox<String>();
			box2.addItem("MR.");
			MetodoLlenado1(box2, 1, 2, 1, 1);
			pnl1.add(box2);
			JTextField txt5 = new JTextField(10);
			MetodoLlenado1(txt5, 2,2, 1, 1);
			pnl1.add(txt5);
			JLabel lbl7 = new JLabel("Sex:");
			MetodoLlenado1(lbl7, 0, 3, 1, 1);
			pnl1.add(lbl7);
			JComboBox<String> box3 = new JComboBox<String>();
			box3.addItem("MALE");
			MetodoLlenado1(box3, 1, 3, 1, 1);
			pnl1.add(box3);
			JLabel lbl8 = new JLabel("Age");
			MetodoLlenado1(lbl8, 2, 3, 1, 1);
			pnl1.add(lbl8);
			JTextField txt6 = new JTextField(1);
			MetodoLlenado1(txt6, 3, 3, 1, 1);
			pnl1.add(txt6);
			JLabel lbl9 = new JLabel("MONS");
			MetodoLlenado1(lbl9, 4, 3, 1, 1);
			pnl1.add(lbl9);
			JTextField txt7 = new JTextField(1);
			MetodoLlenado1(txt7, 5, 3, 1, 1);
			pnl1.add(txt7);
			JLabel lbl10 = new JLabel("DAYS");
			MetodoLlenado1(lbl10, 6, 3, 1, 1);
			pnl1.add(lbl10);
			JTextField txt8 = new JTextField(1);
			MetodoLlenado1(txt8, 7, 3, 1, 1);
			pnl1.add(txt8);
			JLabel lbl11 = new JLabel("Sample by");
			MetodoLlenado1(lbl11, 8, 3, 1, 1);
			pnl1.add(lbl11);
			JTextField txt9 = new JTextField(5);
			MetodoLlenado1(txt9, 9, 3, 1, 1);
			pnl1.add(txt9);
			JLabel lbl12 = new JLabel("Referred by: ");
			MetodoLlenado1(lbl12, 0, 4, 1, 1);
			pnl1.add(lbl12);
			JTextField txt10 = new JTextField(4);
			MetodoLlenado1(txt10, 1, 4, 2, 1);
			pnl1.add(txt10);
			JTextField txt11 = new JTextField(4);
			MetodoLlenado1(txt11, 3, 4, 4, 1);
			pnl1.add(txt11);
			JLabel lbl13 = new JLabel("Panel Code");
			MetodoLlenado1(lbl13, 8, 4, 1, 1);
			pnl1.add(lbl13);
			JTextField txt12 = new JTextField(5);
			MetodoLlenado1(txt12, 9, 4, 1, 1);
			pnl1.add(txt12);
			JLabel lbl15 = new JLabel("     ");
			MetodoLlenado1(lbl15, 0, 5, 7, 1);
			pnl1.add(lbl15);
			JLabel lbl16 = new JLabel("Panel ID");
			MetodoLlenado1(lbl16, 8, 5, 1, 1);
			pnl1.add(lbl16);
			JTextField txt13 = new JTextField(5);
			MetodoLlenado1(txt13, 9, 5, 1, 1);
			pnl1.add(txt13);
			JLabel lbl18 = new JLabel("     ");
			MetodoLlenado1(lbl18, 0, 6, 7, 1);
			pnl1.add(lbl18);
			JLabel lbl17 = new JLabel("e-mail");
			MetodoLlenado1(lbl17, 8, 6, 1, 1);
			pnl1.add(lbl17);
			JTextField txt14 = new JTextField(5);
			MetodoLlenado1(txt14, 9, 6, 1, 1);
			pnl1.add(txt14);
			
			
			MetodoLlenado(IF, 0, 2, 10, 2);
			pnl1.setBackground(Color.LIGHT_GRAY);
//			gbc.fill=GridBagConstraints.HORIZONTAL;
			MetodoLlenado1(pnl1, 0, 0, 2, 2);
			IF.add(pnl1);
			
			
			
			JPanel pnlv = new JPanel();
			pnlv.setLayout(gbl5);
			MetodoLlenado1(pnlv, 2, 0, 2, 2);

			IF.add(pnlv);
			
			
			
			JPanel pnl2 = new JPanel();
			pnl2.setLayout(gbl3);
			pnl2.setBackground(Color.black);
			String[] columnNames = {"testID", "testName ", "Rate","Disc%","DisccounA","Tax(%)","Tax Amt"};
			Object[][] datos = {
					{"Test ID", "Test Name          ","Rate","Disc%","Discount Amount","Tax(%)","Tax Amt"},
					{"", "", "",""}};

			DefaultTableModel dtm = new DefaultTableModel(datos, columnNames);
			final JTable table = new JTable(dtm);
			table.setBackground(Color.cyan);
			pnl2.setBackground(Color.LIGHT_GRAY);
//			gbc3.fill=GridBagConstraints.BOTH;
			MetodoLlenado2(table, 0, 0, 1, 1);
			pnl2.add(table);
			MetodoLlenado1(pnl2, 0, 3, 2, 2);

			IF.add(pnl2);
			
			
			
			
			JPanel pnl3 = new JPanel();
			pnl3.setLayout(gbl4);
			pnl3.setBackground(Color.yellow);
//			MetodoLlenado(pn2, 1, 3, 1,1);

			JLabel lbl22= new JLabel("Total less");
			MetodoLlenado3(lbl22, 0, 0, 1, 1);
			pnl3.add(lbl22);
			
			JTextField tf1 = new JTextField(5);
			tf1.setBackground(Color.BLUE);
			MetodoLlenado3(tf1, 1, 0, 1,1);
			pnl3.add(tf1);
			
			JLabel lbl23= new JLabel("Test Amt");
			MetodoLlenado3(lbl23, 0, 2, 1, 1);
			pnl3.add(lbl23);
			
			JTextField tf15 = new JTextField(5);
			tf15.setBackground(Color.BLUE);
			MetodoLlenado3(tf15, 1,2, 1,1);
			pnl3.add(tf15);
			
			JLabel lbl24= new JLabel("Concession");
			MetodoLlenado3(lbl24, 0, 3, 1, 1);
			pnl3.add(lbl24);
			
			JTextField tf16 = new JTextField(5);
			tf16.setBackground(Color.BLUE);
			MetodoLlenado3(tf16, 1,3, 1,1);
			pnl3.add(tf16);
			
			JLabel lbl19= new JLabel("Home colection");
			MetodoLlenado3(lbl19, 0, 4, 1, 1);
			pnl3.add(lbl19);
			
			JTextField tf17 = new JTextField(5);
			tf17.setBackground(Color.BLUE);
			MetodoLlenado3(tf17, 1,4, 1,1);
			pnl3.add(tf17);
			
			JLabel lbl20= new JLabel("Tax Amt");
			MetodoLlenado3( lbl20, 0, 5, 1, 1);
			pnl3.add(lbl20);
			
			JTextField tf18 = new JTextField(5);
			tf18.setBackground(Color.BLUE);
			MetodoLlenado3(tf18, 1,5, 1,1);
			pnl3.add(tf18);
			
			JLabel lbl21= new JLabel("Net Amt");
			MetodoLlenado3(lbl21, 0, 6, 1, 1);
			pnl3.add(lbl21);
			
			JTextField tf19 = new JTextField(5);
			tf19.setBackground(Color.BLUE);
			MetodoLlenado3(tf19, 1,6, 1,1);
			pnl3.add(tf19);
			
			JLabel lbl222= new JLabel("Balance");
			MetodoLlenado3(lbl222, 0, 7, 1, 1);
			pnl3.add(lbl222);
			
			JTextField tf20 = new JTextField(5);
			tf20.setBackground(Color.BLUE);
			MetodoLlenado3(tf20, 1,7, 1,1);
			pnl3.add(tf20);
			
			MetodoLlenado1(pnl3, 2, 3, 2, 2);

			IF.add(pnl3);
			
			
			JPanel pnl4 = new JPanel();
			pnl4.setLayout(gbl6);
			
			JLabel lbl233= new JLabel("Home Collection");
			MetodoLlenado4(lbl233, 0,0, 1,1);
			pnl4.add(lbl233);
			
			JTextField tf21 = new JTextField(5);
			MetodoLlenado4(tf21, 1, 0, 1, 1);
			pnl4.add(tf21);

			JLabel lbl244= new JLabel("Paid");
			MetodoLlenado4(lbl244, 2, 0, 1, 1);
			pnl4.add(lbl244);

			JTextField tf22 = new JTextField(5);
			MetodoLlenado4(tf22, 3,0, 1, 1);
			pnl4.add(tf22);

			JLabel lbl25= new JLabel("Pay Type");
			MetodoLlenado4(lbl25, 4, 0, 1, 1);
			pnl4.add(lbl25);

			JTextField tf23 = new JTextField(5);
			MetodoLlenado4(tf23, 5, 0, 1,1);
			pnl4.add(tf23);

			JLabel lbl26= new JLabel("Receipt No");
			MetodoLlenado4(lbl26, 6, 0, 1, 1);
			pnl4.add(lbl26);

			JTextField tf24 = new JTextField(5);
			MetodoLlenado4(tf24,7, 0, 1,1);
			pnl4.add(tf24);

			JTextArea ta1= new JTextArea(3,3);
			ta1.setText("Comandos...");
			gbc6.fill=GridBagConstraints.HORIZONTAL;
			MetodoLlenado4(ta1, 0, 1, 13, 2);
			pnl4.add(ta1);

			MetodoLlenado1(pnl4, 0, 6, 2, 4);

			IF.add(pnl4);
			
			
			pack();
			setLocationRelativeTo(null);

	}//COnstructor
	
	public void MetodoLlenado(Component c,int gx,int gy,int gw,int gh) {
		gbc.gridx=gx;
		gbc.gridy=gy;
		gbc.gridwidth=gw;
		gbc.gridheight=gh;
		gbl.setConstraints(c, gbc);
		add(c);
	}
	public void MetodoLlenado1(Component c,int gx,int gy,int gw,int gh) {
		gbc1.gridx=gx;
		gbc1.gridy=gy;
		gbc1.gridwidth=gw;
		gbc1.gridheight=gh;
		gbl1.setConstraints(c, gbc1);
		add(c);
	}
	public void MetodoLlenado1(JPanel c,int gx,int gy,int gw,int gh) {
		gbc2.gridx=gx;
		gbc2.gridy=gy;
		gbc2.gridwidth=gw;
		gbc2.gridheight=gh;
		gbl2.setConstraints(c, gbc2);
		add(c);
	}
	public void MetodoLlenado3(Component com,int gx,int gy,int gw,int gh) {
		gbc4.gridx=gx;
		gbc4.gridy=gy;
		gbc4.gridwidth=gw;
		gbc4.gridheight=gh;
		gbl4.setConstraints(com, gbc4);
		add(com);
	}
	public void MetodoLlenado2(Component com,int gx,int gy,int gw,int gh) {
		gbc3.gridx=gx;
		gbc3.gridy=gy;
		gbc3.gridwidth=gw;
		gbc3.gridheight=gh;
		gbl3.setConstraints(com, gbc3);
		add(com);
	}
	public void MetodoLlenado4(Component com,int gx,int gy,int gw,int gh) {
		gbc6.gridx=gx;
		gbc6.gridy=gy;
		gbc6.gridwidth=gw;
		gbc6.gridheight=gh;
		gbl6.setConstraints(com, gbc6);
		add(com);
	}
	
	
	
}//class ventana



public class MenuInternalFrames {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
	}

}
