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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;




public class Makarna {

	private JFrame frame;
	
	Yemekler frm3;
	
	Siparisleriniz frm2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Makarna window = new Makarna();
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
	public Makarna() {
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
		
		JLabel lblKahvalt = new JLabel("Makarna");
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
					frm3 = new Yemekler();
				
					frm3.getFrame().setVisible(true);
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
		Image img2 = new ImageIcon(this.getClass().getResource("/domatesli.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		
		JCheckBox chckbxDomates = new JCheckBox("Domates  Soslu");
		GridBagConstraints gbc_chckbxSerpmeKahvalt = new GridBagConstraints();
		gbc_chckbxSerpmeKahvalt.anchor = GridBagConstraints.WEST;
		gbc_chckbxSerpmeKahvalt.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxSerpmeKahvalt.gridx = 1;
		gbc_chckbxSerpmeKahvalt.gridy = 0;
		panel_3.add(chckbxDomates, gbc_chckbxSerpmeKahvalt);
		
		JLabel lblDomates = new JLabel("12 TL");
		GridBagConstraints gbc_lblTl = new GridBagConstraints();
		gbc_lblTl.anchor = GridBagConstraints.WEST;
		gbc_lblTl.insets = new Insets(0, 0, 5, 5);
		gbc_lblTl.gridx = 2;
		gbc_lblTl.gridy = 0;
		panel_3.add(lblDomates, gbc_lblTl);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Adet Se\u00E7iniz", "1", "2", "3", "5", "6", "7", "8"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 0;
		panel_3.add(comboBox, gbc_comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 1;
		panel_3.add(lblNewLabel_3, gbc_lblNewLabel_3);
		Image img3= new ImageIcon(this.getClass().getResource("/kiymali.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img3));
		
		JCheckBox chckbxK�yma = new JCheckBox("K\u0131ymal\u0131");
		GridBagConstraints gbc_chckbxKyKahvalts = new GridBagConstraints();
		gbc_chckbxKyKahvalts.anchor = GridBagConstraints.WEST;
		gbc_chckbxKyKahvalts.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxKyKahvalts.gridx = 1;
		gbc_chckbxKyKahvalts.gridy = 1;
		panel_3.add(chckbxK�yma, gbc_chckbxKyKahvalts);
		
		JLabel lblK�yma = new JLabel("16 TL");
		GridBagConstraints gbc_lblTl_1 = new GridBagConstraints();
		gbc_lblTl_1.anchor = GridBagConstraints.WEST;
		gbc_lblTl_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTl_1.gridx = 2;
		gbc_lblTl_1.gridy = 1;
		panel_3.add(lblK�yma, gbc_lblTl_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Adet Se\u00E7iniz", "1", "2", "3", "4", "5", "6", "7", "8"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 3;
		gbc_comboBox_1.gridy = 1;
		panel_3.add(comboBox_1, gbc_comboBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 2;
		panel_3.add(lblNewLabel_4, gbc_lblNewLabel_4);
		Image img4= new ImageIcon(this.getClass().getResource("/yogurtlu.jpg")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img4));
		
		JCheckBox chckbxYogurt = new JCheckBox("Yo\u011Furtlu");
		GridBagConstraints gbc_chckbxSahandaYumurta = new GridBagConstraints();
		gbc_chckbxSahandaYumurta.anchor = GridBagConstraints.WEST;
		gbc_chckbxSahandaYumurta.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxSahandaYumurta.gridx = 1;
		gbc_chckbxSahandaYumurta.gridy = 2;
		panel_3.add(chckbxYogurt, gbc_chckbxSahandaYumurta);
		
		JLabel lblYogurt = new JLabel("12 TL");
		GridBagConstraints gbc_lblTl_2 = new GridBagConstraints();
		gbc_lblTl_2.anchor = GridBagConstraints.WEST;
		gbc_lblTl_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblTl_2.gridx = 2;
		gbc_lblTl_2.gridy = 2;
		panel_3.add(lblYogurt, gbc_lblTl_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Adet Se\u00E7iniz", "1", "2", "3", "4", "5", "6", "7", "8"}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 3;
		gbc_comboBox_2.gridy = 2;
		panel_3.add(comboBox_2, gbc_comboBox_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 3;
		panel_3.add(lblNewLabel_5, gbc_lblNewLabel_5);
		Image img5= new ImageIcon(this.getClass().getResource("/mantarli.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img5));
		
		JCheckBox chckbxKremal� = new JCheckBox("Kremal\u0131 Mantarl\u0131");
		GridBagConstraints gbc_chckbxMenemen = new GridBagConstraints();
		gbc_chckbxMenemen.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxMenemen.anchor = GridBagConstraints.WEST;
		gbc_chckbxMenemen.gridx = 1;
		gbc_chckbxMenemen.gridy = 3;
		panel_3.add(chckbxKremal�, gbc_chckbxMenemen);
		
		JLabel lblKremal� = new JLabel("14 TL");
		GridBagConstraints gbc_lblTl_3 = new GridBagConstraints();
		gbc_lblTl_3.anchor = GridBagConstraints.WEST;
		gbc_lblTl_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblTl_3.gridx = 2;
		gbc_lblTl_3.gridy = 3;
		panel_3.add(lblKremal�, gbc_lblTl_3);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Adet Se\u00E7iniz", "1", "2", "3", "4", "5", "6", "7", "8"}));
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 3;
		gbc_comboBox_3.gridy = 3;
		panel_3.add(comboBox_3, gbc_comboBox_3);
		
		JLabel lblNewLabel_6 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 4;
		panel_3.add(lblNewLabel_6, gbc_lblNewLabel_6);
		Image img6= new ImageIcon(this.getClass().getResource("/specialm.jpg")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img6));
		
		JCheckBox chckbxSpecial = new JCheckBox("Special");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 4;
		panel_3.add(chckbxSpecial, gbc_chckbxNewCheckBox);
		
		JLabel lblSpecial = new JLabel("13 TL");
		GridBagConstraints gbc_lblTl_4 = new GridBagConstraints();
		gbc_lblTl_4.anchor = GridBagConstraints.WEST;
		gbc_lblTl_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblTl_4.gridx = 2;
		gbc_lblTl_4.gridy = 4;
		panel_3.add(lblSpecial, gbc_lblTl_4);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Adet Se\u00E7iniz", "1", "2", "3", "4", "5", "6", "7", "8"}));
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.gridx = 3;
		gbc_comboBox_4.gridy = 4;
		panel_3.add(comboBox_4, gbc_comboBox_4);
		Image img7= new ImageIcon(this.getClass().getResource("/yiyecek.png")).getImage();
		
		
		
		
		JButton btnSipariiGr = new JButton("Sipari\u015Fi G\u00F6r");
		btnSipariiGr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxDomates.isSelected()){
					int label_text = lblDomates.getText().trim().indexOf('T');
					String fiyat_text = lblDomates.getText().substring(0, label_text);
					Double fiyat = Double.parseDouble(fiyat_text);
					Yemek yemek = new Yemek(chckbxDomates.getText(), fiyat ,comboBox.getSelectedIndex());
					CafeIn.siparisler.add(yemek);
				}
				
				if (chckbxK�yma.isSelected()){
					int label_text = lblK�yma.getText().trim().indexOf('T');
					String fiyat_text = lblK�yma.getText().substring(0, label_text);
					Double fiyat = Double.parseDouble(fiyat_text);
					Yemek yemek = new Yemek(chckbxK�yma.getText(),fiyat,comboBox_1.getSelectedIndex());
					CafeIn.siparisler.add(yemek);
					
					
				}
				if (chckbxYogurt.isSelected()){
					int label_text = lblYogurt.getText().trim().indexOf('T');
					String fiyat_text = lblYogurt.getText().substring(0, label_text);
					Double fiyat = Double.parseDouble(fiyat_text);
					Yemek yemek = new Yemek(chckbxYogurt.getText(),fiyat,comboBox_2.getSelectedIndex());
					CafeIn.siparisler.add(yemek);
					
					
				}
				if (chckbxKremal�.isSelected()){
					int label_text = lblKremal�.getText().trim().indexOf('T');
					String fiyat_text = lblKremal�.getText().substring(0, label_text);
					Double fiyat = Double.parseDouble(fiyat_text);
					Yemek yemek = new Yemek(chckbxKremal�.getText(),fiyat,comboBox_3.getSelectedIndex());
					CafeIn.siparisler.add(yemek);
					
					
				}
				if (chckbxSpecial.isSelected()){
					int label_text = lblSpecial.getText().trim().indexOf('T');
					String fiyat_text = lblSpecial.getText().substring(0, label_text);
					Double fiyat = Double.parseDouble(fiyat_text);
					Yemek yemek = new Yemek(chckbxSpecial.getText(),fiyat,comboBox_4.getSelectedIndex());
					CafeIn.siparisler.add(yemek);
					
				
				
				
				
				if (frm2 == null){
					frm2 = new Siparisleriniz();
				
					frm2.getFrame().setVisible(true);
				}
					frame.setVisible(false);

				}
				
			}
				
		});
		panel_4.add(btnSipariiGr);


		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
