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


import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import javax.swing.JScrollPane;




public class Yemekler {

	private JFrame frame;
	
	IkinciSayfa frm2;
	
	Kahvaltý frm3;
	
	Makarna frm4;
	
	Salata frm5;
	
	Atýþtýrmalýk frm6;
	
	Cafe_Lezzetleri frm7;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yemekler window = new Yemekler();
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
	public Yemekler() {
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
		
		JLabel lblYemekler = new JLabel("Yemekler");
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
		panel_4.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		scrollPane.setViewportView(panel_3);
		panel_3.setBorder(new EmptyBorder(50, 50, 50, 50));
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 0;
		panel_3.add(lblNewLabel_2, gbc_lblNewLabel_2);
		Image img2 = new ImageIcon(this.getClass().getResource("/koy.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		
		JLabel lblNewLabel_3 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 0;
		panel_3.add(lblNewLabel_3, gbc_lblNewLabel_3);
		Image img3 = new ImageIcon(this.getClass().getResource("/domatesli.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img3));
		
		JButton btnNewButton = new JButton("Kahvaltý");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (frm3 == null){
					frm3 = new Kahvaltý();
				
					frm3.getFrame().setVisible(true);
				}
					frame.setVisible(false);
	
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		panel_3.add(btnNewButton, gbc_btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Makarna");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (frm4 == null){
					frm4 = new Makarna();
				
					frm4.getFrame().setVisible(true);
				}
					frame.setVisible(false);
					
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 1;
		panel_3.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 2;
		panel_3.add(lblNewLabel_4, gbc_lblNewLabel_4);
		Image img4 = new ImageIcon(this.getClass().getResource("/akdeniz.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img4));
		
		JLabel lblNewLabel_5 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 2;
		panel_3.add(lblNewLabel_5, gbc_lblNewLabel_5);
		Image img5 = new ImageIcon(this.getClass().getResource("/cips.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img5));
		
		JButton btnNewButton_2 = new JButton("Salata");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (frm5 == null){
					frm5 = new Salata();
				
					frm5.getFrame().setVisible(true);
				}
					frame.setVisible(false);
				
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 3;
		panel_3.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Atýþtýrmalýk");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (frm6 == null){
					frm6 = new Atýþtýrmalýk();
				
					frm6.getFrame().setVisible(true);
				}
					frame.setVisible(false);
				
				
			}
		});
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4.gridx = 1;
		gbc_btnNewButton_4.gridy = 3;
		panel_3.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JLabel lblNewLabel_6 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 4;
		panel_3.add(lblNewLabel_6, gbc_lblNewLabel_6);
		Image img6 = new ImageIcon(this.getClass().getResource("/hamburger.png")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img6));
		
		JButton btnNewButton_6 = new JButton("Cafe Lezzetleri");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (frm7 == null){
					frm7 = new Cafe_Lezzetleri();
				
					frm7.getFrame().setVisible(true);
				}
					frame.setVisible(false);
				
				
			}
		});
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_6.gridx = 0;
		gbc_btnNewButton_6.gridy = 5;
		panel_3.add(btnNewButton_6, gbc_btnNewButton_6);
		
		
		
		
		
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
