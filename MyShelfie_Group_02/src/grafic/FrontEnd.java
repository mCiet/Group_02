package grafic;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JTextField;
import main.Main;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import grafic_utils.*;
import java.util.List;
import java.util.ArrayList;
import player.*;
import gameController.*;


public class FrontEnd extends JFrame {

	private JPanel contentPane;
	private JTextField txtNGiocatori;
	private GridTiles board;
	private ShelfTiles shelf;
	private GameController controller;
	
	


	
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
		
		JPanel panelGiocatori = new JPanel();
		panelGiocatori.setBounds(10, 36, 180, 516);
		contentPane.add(panelGiocatori);
		panelGiocatori.setLayout(null);
		
		txtNGiocatori = new JTextField();
		txtNGiocatori.setText("N. Giocatori");
		txtNGiocatori.setBounds(23, 68, 89, 20);
		panelGiocatori.add(txtNGiocatori);
		txtNGiocatori.setColumns(10);
		
		JLabel lblProva = new JLabel("");
		lblProva.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblProva.setBounds(10, 144, 112, 59);
		panelGiocatori.add(lblProva);
        
		
		JButton btnAvvio = new JButton("AVVIA");
		btnAvvio.setBounds(23, 99, 89, 23);
		panelGiocatori.add(btnAvvio);
		
		lblNewLabel = new JLabel("Scegliere il numero \r\n");
		lblNewLabel.setBounds(0, 27, 132, 14);
		panelGiocatori.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("di giocatori da 2 a 4");
		lblNewLabel_1.setBounds(0, 43, 132, 14);
		panelGiocatori.add(lblNewLabel_1);
		
		JPanel boardPanel = new JPanel();
		boardPanel.setBorder(new MatteBorder(1,1,1,1, (Color) new Color(0, 0, 0)));
		boardPanel.setVisible(false);
		boardPanel.setBounds(200, 36, 449, 516);
		contentPane.add(boardPanel);
		
		JPanel shelfPanel = new JPanel();
		shelfPanel.setBorder(new MatteBorder(1,1,1,1, (Color) new Color(0, 0, 0)));
		shelfPanel.setVisible(false);
		shelfPanel.setBounds(659, 36, 284, 516);
		contentPane.add(shelfPanel);
		
		
		
		
		btnAvvio.addActionListener(new ActionListener(){
			
			
			
			public void actionPerformed(ActionEvent e) {
				String valoreTesto= txtNGiocatori.getText();
				if(Main.isNumeric(valoreTesto)) {
					nGiocatori = Integer.parseInt(valoreTesto);
					if(nGiocatori>=2 && nGiocatori<=4) {

						lblProva.setText(""+ nGiocatori);
						board = new GridTiles();
						boardPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null,null,null));
						boardPanel.setLayout(new BorderLayout(0,0));
						boardPanel.add(board, BorderLayout.CENTER);
						
						
						shelf = new ShelfTiles();
						shelfPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null,null,null));
						shelfPanel.setLayout(new BorderLayout(0,0));
						shelfPanel.add(board, BorderLayout.CENTER);
						
						List<Player> giocatori=  new ArrayList<Player>();
						for(int k=0; k<nGiocatori; k++) {
							giocatori.add(new Player(" Giocatore "+ k));
						}
						controller.startGame(nGiocatori);
						
						
						
						
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
