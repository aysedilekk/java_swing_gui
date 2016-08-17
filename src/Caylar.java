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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;




public class Caylar {

	private JFrame frame;
	
	SicakIcecekler frm3;
	Siparisleriniz frm2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caylar window = new Caylar();
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
	public Caylar() {
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
		
		JLabel lblKahvalt = new JLabel("\u00C7aylar");
		lblKahvalt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_5.add(lblKahvalt);
		
		
	
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(0, 0, 20, 20));
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel_2.add(panel_4, BorderLayout.SOUTH);
		
		JButton btnNewButton_3 = new JButton("Geri");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (frm3 == null){
					frm3 = new SicakIcecekler();
				
					frm3.getFrame().setVisible(true);
				}
					frame.setVisible(false);
			}
		});
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		scrollPane.setViewportView(panel_3);
		panel_3.setBorder(new EmptyBorder(50, 50, 50, 50));
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 0;
		panel_3.add(lblNewLabel_2, gbc_lblNewLabel_2);
		Image img2 = new ImageIcon(this.getClass().getResource("/incebelli.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		
		JCheckBox incebelli = new JCheckBox("\u0130nce Belli");
		GridBagConstraints gbc_chckbxSerpmeKahvalt = new GridBagConstraints();
		gbc_chckbxSerpmeKahvalt.anchor = GridBagConstraints.WEST;
		gbc_chckbxSerpmeKahvalt.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxSerpmeKahvalt.gridx = 1;
		gbc_chckbxSerpmeKahvalt.gridy = 0;
		panel_3.add(incebelli, gbc_chckbxSerpmeKahvalt);
		
		JLabel lblincebelli = new JLabel("2 TL");
		GridBagConstraints gbc_lblTl = new GridBagConstraints();
		gbc_lblTl.anchor = GridBagConstraints.WEST;
		gbc_lblTl.insets = new Insets(0, 0, 5, 5);
		gbc_lblTl.gridx = 2;
		gbc_lblTl.gridy = 0;
		panel_3.add(lblincebelli, gbc_lblTl);
		
		JComboBox comboincebelli = new JComboBox();
		comboincebelli.setModel(new DefaultComboBoxModel(new String[] {"Adet Se\u00E7iniz", "1", "2", "3", "5", "6", "7", "8"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 0;
		panel_3.add(comboincebelli, gbc_comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 1;
		panel_3.add(lblNewLabel_3, gbc_lblNewLabel_3);
		Image img3= new ImageIcon(this.getClass().getResource("/fincan.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img3));
		
		JCheckBox fincan = new JCheckBox("Fincan");
		GridBagConstraints gbc_chckbxKyKahvalts = new GridBagConstraints();
		gbc_chckbxKyKahvalts.anchor = GridBagConstraints.WEST;
		gbc_chckbxKyKahvalts.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxKyKahvalts.gridx = 1;
		gbc_chckbxKyKahvalts.gridy = 1;
		panel_3.add(fincan, gbc_chckbxKyKahvalts);
		
		JLabel lblfincan = new JLabel("4 TL");
		GridBagConstraints gbc_lblTl_1 = new GridBagConstraints();
		gbc_lblTl_1.anchor = GridBagConstraints.WEST;
		gbc_lblTl_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTl_1.gridx = 2;
		gbc_lblTl_1.gridy = 1;
		panel_3.add(lblfincan, gbc_lblTl_1);
		
		JComboBox combofincan = new JComboBox();
		combofincan.setModel(new DefaultComboBoxModel(new String[] {"Adet Se\u00E7iniz", "1", "2", "3", "4", "5", "6", "7", "8"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 3;
		gbc_comboBox_1.gridy = 1;
		panel_3.add(combofincan, gbc_comboBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 2;
		panel_3.add(lblNewLabel_4, gbc_lblNewLabel_4);
		Image img4= new ImageIcon(this.getClass().getResource("/karadut.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img4));
		
		JCheckBox karadut = new JCheckBox("Karadut");
		GridBagConstraints gbc_chckbxSahandaYumurta = new GridBagConstraints();
		gbc_chckbxSahandaYumurta.anchor = GridBagConstraints.WEST;
		gbc_chckbxSahandaYumurta.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxSahandaYumurta.gridx = 1;
		gbc_chckbxSahandaYumurta.gridy = 2;
		panel_3.add(karadut, gbc_chckbxSahandaYumurta);
		
		JLabel lblkaradut = new JLabel("5 TL");
		GridBagConstraints gbc_lblTl_2 = new GridBagConstraints();
		gbc_lblTl_2.anchor = GridBagConstraints.WEST;
		gbc_lblTl_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblTl_2.gridx = 2;
		gbc_lblTl_2.gridy = 2;
		panel_3.add(lblkaradut, gbc_lblTl_2);
		
		JComboBox combokaradut = new JComboBox();
		combokaradut.setModel(new DefaultComboBoxModel(new String[] {"Adet Se\u00E7iniz", "1", "2", "3", "4", "5", "6", "7", "8"}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 3;
		gbc_comboBox_2.gridy = 2;
		panel_3.add(combokaradut, gbc_comboBox_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 3;
		panel_3.add(lblNewLabel_5, gbc_lblNewLabel_5);
		Image img5= new ImageIcon(this.getClass().getResource("/adacayi.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img5));
		
		JCheckBox adacay = new JCheckBox("Ada �ay�");
		GridBagConstraints gbc_chckbxMenemen = new GridBagConstraints();
		gbc_chckbxMenemen.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxMenemen.anchor = GridBagConstraints.WEST;
		gbc_chckbxMenemen.gridx = 1;
		gbc_chckbxMenemen.gridy = 3;
		panel_3.add(adacay, gbc_chckbxMenemen);
		
		JLabel lbladacay = new JLabel("5 TL");
		GridBagConstraints gbc_lblTl_3 = new GridBagConstraints();
		gbc_lblTl_3.anchor = GridBagConstraints.WEST;
		gbc_lblTl_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblTl_3.gridx = 2;
		gbc_lblTl_3.gridy = 3;
		panel_3.add(lbladacay, gbc_lblTl_3);
		
		JComboBox comboadacay = new JComboBox();
		comboadacay.setModel(new DefaultComboBoxModel(new String[] {"Adet Se\u00E7iniz", "1", "2", "3", "4", "5", "6", "7", "8"}));
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 3;
		gbc_comboBox_3.gridy = 3;
		panel_3.add(comboadacay, gbc_comboBox_3);
		
		JLabel lblNewLabel_6 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 4;
		panel_3.add(lblNewLabel_6, gbc_lblNewLabel_6);
		Image img6= new ImageIcon(this.getClass().getResource("/ihlamur.png")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img6));
		
		JCheckBox ihlamur = new JCheckBox("Ihlamur");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 4;
		panel_3.add(ihlamur, gbc_chckbxNewCheckBox);
		
		JLabel lblihlamur = new JLabel("6 TL");
		GridBagConstraints gbc_lblTl_4 = new GridBagConstraints();
		gbc_lblTl_4.anchor = GridBagConstraints.WEST;
		gbc_lblTl_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblTl_4.gridx = 2;
		gbc_lblTl_4.gridy = 4;
		panel_3.add(lblihlamur, gbc_lblTl_4);
		
		JComboBox comboihlamur = new JComboBox();
		comboihlamur.setModel(new DefaultComboBoxModel(new String[] {"Adet Se\u00E7iniz", "1", "2", "3", "4", "5", "6", "7", "8"}));
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.gridx = 3;
		gbc_comboBox_4.gridy = 4;
		panel_3.add(comboihlamur, gbc_comboBox_4);
		
		JLabel lblNewLabel_7 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 5;
		panel_3.add(lblNewLabel_7, gbc_lblNewLabel_7);
		Image img7= new ImageIcon(this.getClass().getResource("/rezene.png")).getImage();
		lblNewLabel_7.setIcon(new ImageIcon(img7));
		
		JCheckBox rezene = new JCheckBox("Rezene");
		GridBagConstraints gbc_chckbxYumurtalEkmek = new GridBagConstraints();
		gbc_chckbxYumurtalEkmek.anchor = GridBagConstraints.WEST;
		gbc_chckbxYumurtalEkmek.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxYumurtalEkmek.gridx = 1;
		gbc_chckbxYumurtalEkmek.gridy = 5;
		panel_3.add(rezene, gbc_chckbxYumurtalEkmek);
		
		JLabel lblrezene = new JLabel(" 6 TL");
		GridBagConstraints gbc_lblTl_5 = new GridBagConstraints();
		gbc_lblTl_5.anchor = GridBagConstraints.WEST;
		gbc_lblTl_5.insets = new Insets(0, 0, 0, 5);
		gbc_lblTl_5.gridx = 2;
		gbc_lblTl_5.gridy = 5;
		panel_3.add(lblrezene, gbc_lblTl_5);
		
		JComboBox comborezene = new JComboBox();
		comborezene.setModel(new DefaultComboBoxModel(new String[] {"Adet Se\u00E7iniz", "1", "2", "3", "4", "5", "6", "7", "8"}));
		GridBagConstraints gbc_comboBox_5 = new GridBagConstraints();
		gbc_comboBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_5.gridx = 3;
		gbc_comboBox_5.gridy = 5;
		panel_3.add(comborezene, gbc_comboBox_5);
		
		
		
		
		JButton btnSipariiGr = new JButton("Sipari\u015Fi G\u00F6r");
		btnSipariiGr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					
					if (incebelli.isSelected()){
						int label_text = lblincebelli.getText().trim().indexOf('T');
						String fiyat_text = lblincebelli.getText().substring(0, label_text);
						Double fiyat = Double.parseDouble(fiyat_text);
						Yemek yemek = new Yemek(incebelli.getText(), fiyat ,comboincebelli.getSelectedIndex());
						CafeIn.siparisler.add(yemek);
					}
					
					if (fincan.isSelected()){
						int label_text = lblfincan.getText().trim().indexOf('T');
						String fiyat_text = lblfincan.getText().substring(0, label_text);
						Double fiyat = Double.parseDouble(fiyat_text);
						Yemek yemek = new Yemek(fincan.getText(),fiyat,combofincan.getSelectedIndex());
						CafeIn.siparisler.add(yemek);
						
						
					}
					if (karadut.isSelected()){
						int label_text = lblkaradut.getText().trim().indexOf('T');
						String fiyat_text = lblkaradut.getText().substring(0, label_text);
						Double fiyat = Double.parseDouble(fiyat_text);
						Yemek yemek = new Yemek(karadut.getText(),fiyat,combokaradut.getSelectedIndex());
						CafeIn.siparisler.add(yemek);
						
						
					}
					if (adacay.isSelected()){
						int label_text = lbladacay.getText().trim().indexOf('T');
						String fiyat_text = lbladacay.getText().substring(0, label_text);
						Double fiyat = Double.parseDouble(fiyat_text);
						Yemek yemek = new Yemek(adacay.getText(),fiyat,comboadacay.getSelectedIndex());
						CafeIn.siparisler.add(yemek);
						
						
					}
					if (ihlamur.isSelected()){
						int label_text = lblihlamur.getText().trim().indexOf('T');
						String fiyat_text = lblihlamur.getText().substring(0, label_text);
						Double fiyat = Double.parseDouble(fiyat_text);
						Yemek yemek = new Yemek(ihlamur.getText(),fiyat,comboihlamur.getSelectedIndex());
						CafeIn.siparisler.add(yemek);
						
						
					}
					if (rezene.isSelected()){
						int label_text = lblrezene.getText().trim().indexOf('T');
						String fiyat_text = lblrezene.getText().substring(0, label_text);
						Double fiyat = Double.parseDouble(fiyat_text);
						Yemek yemek = new Yemek(rezene.getText(),fiyat,comborezene.getSelectedIndex());
						CafeIn.siparisler.add(yemek);
						
						
					}
				
				if (frm2 == null){
					frm2 = new Siparisleriniz();
				
					frm2.getFrame().setVisible(true);
				}
					frame.setVisible(false);
			
			}
		});
		panel_4.add(btnSipariiGr);
		panel_4.add(btnNewButton_3);


		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
