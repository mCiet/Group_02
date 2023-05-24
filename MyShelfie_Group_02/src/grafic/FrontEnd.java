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
import java.awt.Font;
import java.awt.Color;

public class FrontEnd extends JFrame {

	private JPanel contentPane;
	private JTable tBoard;
	private JTextField txtNGiocatori;

	
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
		panel.setBounds(10, 36, 132, 516);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtNGiocatori = new JTextField();
		txtNGiocatori.setText("N. Giocatori");
		txtNGiocatori.setBounds(23, 68, 89, 20);
		panel.add(txtNGiocatori);
		txtNGiocatori.setColumns(10);
		
		JLabel lblProva = new JLabel("");
		lblProva.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblProva.setBounds(10, 144, 112, 59);
		panel.add(lblProva);
		
		tBoard = new JTable(9,9);
		tBoard.setBackground(new Color(255, 255, 255));
		tBoard.setBorder(null);
		tBoard.setForeground(new Color(0, 0, 0));
		tBoard.setBounds(152, 25, 603, 516);
		contentPane.add(tBoard);
        
		
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
				if(Main.isNumeric(valoreTesto)) {
					nGiocatori = Integer.parseInt(valoreTesto);
					if(nGiocatori>=2 && nGiocatori<=4) {
						tBoard.setRowHeight(57);
						lblProva.setText(""+ nGiocatori);
						
						
					}else {
						lblProva.setText("<html>NSERIRE UN NUMERO <br> TRA 2 E 4 </html>");
					}
				}else {
					lblProva.setText("INSERIRE UN NUMERO ");
				}
				
				
				
			}
		});
		
		
		

	}
}
