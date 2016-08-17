import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import javax.swing.JScrollPane;




public class Siparisleriniz {

	private JFrame frame;
	
	IkinciSayfa frm2;

	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Siparisleriniz window = new Siparisleriniz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Siparisleriniz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image img = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
		Image img1 = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();

		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_1241808946977229");
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(100, 100));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.setLayout(new BorderLayout(20, 0));
		lblNewLabel.setIcon(new ImageIcon(img));
		panel_1.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblCafeIn = new JLabel("CAFE IN");
		lblCafeIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCafeIn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(lblCafeIn, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("");
		
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		
		panel_1.add(lblNewLabel_1, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(100, 100));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(20, 0, 0, 0));
		panel_2.add(panel_5, BorderLayout.NORTH);
		
		JLabel lblYemekler = new JLabel("Sipari\u015Fleriniz");
		lblYemekler.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblYemekler.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblYemekler);
		
		
	
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(0, 0, 20, 20));
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel_2.add(panel_4, BorderLayout.SOUTH);
		
		JButton btnNewButton_3 = new JButton("Geri");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if (frm2 == null){
					frm2 = new IkinciSayfa();
				
					frm2.getFrame().setVisible(true);
				}
					frame.setVisible(false);
			}
		});
		
		JButton btnOnay = new JButton("Onay");
		panel_4.add(btnOnay);
		panel_4.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		scrollPane.setViewportView(panel_3);
		panel_3.setBorder(new EmptyBorder(50, 50, 50, 50));
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblMasa = new JLabel("Masa ");
		GridBagConstraints gbc_lblMasa = new GridBagConstraints();
		gbc_lblMasa.anchor = GridBagConstraints.WEST;
		gbc_lblMasa.insets = new Insets(0, 0, 5, 5);
		gbc_lblMasa.gridx = 0;
		gbc_lblMasa.gridy = 1;
		panel_3.add(lblMasa, gbc_lblMasa);
		lblMasa.setText( "MASA NUMARANIZ : " + Integer.toString(CafeIn.tableNo));
		for (int i=0; i<CafeIn.siparisler.size(); i++){
			Yemek yemek = CafeIn.siparisler.get(i);
			JLabel lblNewLabel_3 = new JLabel(" - " + yemek.getAd() + " - " + yemek.getAdet() + "  adet " + yemek.getFiyat() + "  TL birim fiyat");
			GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
			gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
			gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_3.gridx = 0;
			gbc_lblNewLabel_3.gridy = i+3;
			panel_3.add(lblNewLabel_3, gbc_lblNewLabel_3);			
		}
		
		JLabel lblNewLabel_2 = new JLabel("SÝPARÝÞLERÝNÝZ:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel_3.add(lblNewLabel_2, gbc_lblNewLabel_2);
		double toplam = 0;
		for (int i=0; i<CafeIn.siparisler.size(); i++){
			Yemek yemek = CafeIn.siparisler.get(i);
			toplam += yemek.getAdet() * yemek.getFiyat();
		
		}
		JLabel lblToplamFiyat = new JLabel("Toplam Fiyat:" + toplam);
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		GridBagConstraints gbc_lblToplamFiyat = new GridBagConstraints();
		gbc_lblToplamFiyat.anchor = GridBagConstraints.WEST;
		gbc_lblToplamFiyat.insets = new Insets(0, 0, 0, 5);
		gbc_lblToplamFiyat.gridx = 0;
		gbc_lblToplamFiyat.gridy = 9;
		panel_3.add(lblToplamFiyat, gbc_lblToplamFiyat);
	
		
		
		
		
		
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
