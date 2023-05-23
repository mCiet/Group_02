package grafic;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import main.Main;
import javax.swing.JLabel;

public class FrontEnd extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtNGiocatori;

	/**
	 * Launch the application.
	 */
	public static void Window(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontEnd frame = new FrontEnd();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	int nGiocatori=0;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	public FrontEnd() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 967, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 36, 132, 502);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtNGiocatori = new JTextField();
		txtNGiocatori.setText("N. Giocatori");
		txtNGiocatori.setBounds(23, 68, 89, 20);
		panel.add(txtNGiocatori);
		txtNGiocatori.setColumns(10);
		
		JLabel lblProva = new JLabel("");
		lblProva.setBounds(46, 146, 49, 14);
		panel.add(lblProva);
		
		table = new JTable();
		table.setBounds(141, 36, 543, 503);
		contentPane.add(table);
		
		JButton btnAvvio = new JButton("AVVIA");
		btnAvvio.setBounds(23, 99, 89, 23);
		panel.add(btnAvvio);
		
		lblNewLabel = new JLabel("Scegliere il numero \r\n");
		lblNewLabel.setBounds(0, 27, 132, 14);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("di giocatori da 2 a 4");
		lblNewLabel_1.setBounds(0, 43, 132, 14);
		panel.add(lblNewLabel_1);
		
		btnAvvio.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				String valoreTesto= txtNGiocatori.getText();
				
				//	if(!Main.isNumeric(valoreTesto)) {
				//		lblProva.setText("<html>INSERIRE UN NUMERO <br> COMPRESO TRA 2 E 4 </html>");
				//	}
				nGiocatori = Integer.parseInt(valoreTesto);
				lblProva.setText(""+ nGiocatori);
				
				
			}
		});
		
		
		

	}
}
