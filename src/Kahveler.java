import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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




public class Kahveler {

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
					Kahveler window = new Kahveler();
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
	public Kahveler() {
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
		
		JLabel lblKahvalt = new JLabel("Kahveler");
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
		Image img2 = new ImageIcon(this.getClass().getResource("/espresso.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		
		JCheckBox espresso = new JCheckBox("Espresso");
		GridBagConstraints gbc_chckbxSerpmeKahvalt = new GridBagConstraints();
		gbc_chckbxSerpmeKahvalt.anchor = GridBagConstraints.WEST;
		gbc_chckbxSerpmeKahvalt.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxSerpmeKahvalt.gridx = 1;
		gbc_chckbxSerpmeKahvalt.gridy = 0;
		panel_3.add(espresso, gbc_chckbxSerpmeKahvalt);
		
		JLabel lblespresso = new JLabel("8 TL");
		GridBagConstraints gbc_lblTl = new GridBagConstraints();
		gbc_lblTl.anchor = GridBagConstraints.WEST;
		gbc_lblTl.insets = new Insets(0, 0, 5, 5);
		gbc_lblTl.gridx = 2;
		gbc_lblTl.gridy = 0;
		panel_3.add(lblespresso, gbc_lblTl);
		
		JComboBox comboespresso = new JComboBox();
		comboespresso.setModel(new DefaultComboBoxModel(new String[] {"Adet Se\u00E7iniz", "1", "2", "3", "5", "6", "7", "8"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 0;
		panel_3.add(comboespresso, gbc_comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 1;
		panel_3.add(lblNewLabel_3, gbc_lblNewLabel_3);
		Image img3= new ImageIcon(this.getClass().getResource("/macchiato.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img3));
		
		JCheckBox macchiato = new JCheckBox("Macchiato");
		GridBagConstraints gbc_chckbxKyKahvalts = new GridBagConstraints();
		gbc_chckbxKyKahvalts.anchor = GridBagConstraints.WEST;
		gbc_chckbxKyKahvalts.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxKyKahvalts.gridx = 1;
		gbc_chckbxKyKahvalts.gridy = 1;
		panel_3.add(macchiato, gbc_chckbxKyKahvalts);
		
		JLabel lblmacchiato = new JLabel("10 TL");
		GridBagConstraints gbc_lblTl_1 = new GridBagConstraints();
		gbc_lblTl_1.anchor = GridBagConstraints.WEST;
		gbc_lblTl_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTl_1.gridx = 2;
		gbc_lblTl_1.gridy = 1;
		panel_3.add(lblmacchiato, gbc_lblTl_1);
		
		JComboBox combomacchiato = new JComboBox();
		combomacchiato.setModel(new DefaultComboBoxModel(new String[] {"Adet Se\u00E7iniz", "1", "2", "3", "4", "5", "6", "7", "8"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 3;
		gbc_comboBox_1.gridy = 1;
		panel_3.add(combomacchiato, gbc_comboBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 2;
		panel_3.add(lblNewLabel_4, gbc_lblNewLabel_4);
		Image img4= new ImageIcon(this.getClass().getResource("/cappuccino.jpg")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img4));
		
		JCheckBox cappuccino = new JCheckBox("Cappuccino");
		GridBagConstraints gbc_chckbxSahandaYumurta = new GridBagConstraints();
		gbc_chckbxSahandaYumurta.anchor = GridBagConstraints.WEST;
		gbc_chckbxSahandaYumurta.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxSahandaYumurta.gridx = 1;
		gbc_chckbxSahandaYumurta.gridy = 2;
		panel_3.add(cappuccino, gbc_chckbxSahandaYumurta);
		
		JLabel lblcappuccino = new JLabel("9.5 TL");
		GridBagConstraints gbc_lblTl_2 = new GridBagConstraints();
		gbc_lblTl_2.anchor = GridBagConstraints.WEST;
		gbc_lblTl_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblTl_2.gridx = 2;
		gbc_lblTl_2.gridy = 2;
		panel_3.add(lblcappuccino, gbc_lblTl_2);
		
		JComboBox combocappuccino = new JComboBox();
		combocappuccino.setModel(new DefaultComboBoxModel(new String[] {"Adet Se\u00E7iniz", "1", "2", "3", "4", "5", "6", "7", "8"}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 3;
		gbc_comboBox_2.gridy = 2;
		panel_3.add(combocappuccino, gbc_comboBox_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 3;
		panel_3.add(lblNewLabel_5, gbc_lblNewLabel_5);
		Image img5= new ImageIcon(this.getClass().getResource("/latte.jpg")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img5));
		
		JCheckBox latte = new JCheckBox("Caffe latte");
		GridBagConstraints gbc_chckbxMenemen = new GridBagConstraints();
		gbc_chckbxMenemen.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxMenemen.anchor = GridBagConstraints.WEST;
		gbc_chckbxMenemen.gridx = 1;
		gbc_chckbxMenemen.gridy = 3;
		panel_3.add(latte, gbc_chckbxMenemen);
		
		JLabel lbllatte = new JLabel("12 TL");
		GridBagConstraints gbc_lblTl_3 = new GridBagConstraints();
		gbc_lblTl_3.anchor = GridBagConstraints.WEST;
		gbc_lblTl_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblTl_3.gridx = 2;
		gbc_lblTl_3.gridy = 3;
		panel_3.add(lbllatte, gbc_lblTl_3);
		
		JComboBox combolatte = new JComboBox();
		combolatte.setModel(new DefaultComboBoxModel(new String[] {"Adet Se\u00E7iniz", "1", "2", "3", "4", "5", "6", "7", "8"}));
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 3;
		gbc_comboBox_3.gridy = 3;
		panel_3.add(combolatte, gbc_comboBox_3);
		
		JLabel lblNewLabel_6 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 4;
		panel_3.add(lblNewLabel_6, gbc_lblNewLabel_6);
		Image img6= new ImageIcon(this.getClass().getResource("/turk.jpg")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img6));
		
		JCheckBox turkkahvesi = new JCheckBox("Türk kahvesi");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 4;
		panel_3.add(turkkahvesi, gbc_chckbxNewCheckBox);
		
		JLabel lblturkkahvesi = new JLabel("6 TL");
		GridBagConstraints gbc_lblTl_4 = new GridBagConstraints();
		gbc_lblTl_4.anchor = GridBagConstraints.WEST;
		gbc_lblTl_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblTl_4.gridx = 2;
		gbc_lblTl_4.gridy = 4;
		panel_3.add(lblturkkahvesi, gbc_lblTl_4);
		
		JComboBox comboturkkahvesi = new JComboBox();
		comboturkkahvesi.setModel(new DefaultComboBoxModel(new String[] {"Adet Se\u00E7iniz", "1", "2", "3", "4", "5", "6", "7", "8"}));
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.gridx = 3;
		gbc_comboBox_4.gridy = 4;
		panel_3.add(comboturkkahvesi, gbc_comboBox_4);
		
		
		JButton btnSipariiGr = new JButton("Sipari\u015Fi G\u00F6r");
		btnSipariiGr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (espresso.isSelected()){
					int label_text = lblespresso.getText().trim().indexOf('T');
					String fiyat_text = lblespresso.getText().substring(0, label_text);
					Double fiyat = Double.parseDouble(fiyat_text);
					Yemek yemek = new Yemek(espresso.getText(), fiyat ,comboespresso.getSelectedIndex());
					CafeIn.siparisler.add(yemek);
				}
				
				if (macchiato.isSelected()){
					int label_text = lblmacchiato.getText().trim().indexOf('T');
					String fiyat_text = lblmacchiato.getText().substring(0, label_text);
					Double fiyat = Double.parseDouble(fiyat_text);
					Yemek yemek = new Yemek(macchiato.getText(),fiyat,combomacchiato.getSelectedIndex());
					CafeIn.siparisler.add(yemek);
					
					
				}
				if (cappuccino.isSelected()){
					int label_text = lblcappuccino.getText().trim().indexOf('T');
					String fiyat_text = lblcappuccino.getText().substring(0, label_text);
					Double fiyat = Double.parseDouble(fiyat_text);
					Yemek yemek = new Yemek(cappuccino.getText(),fiyat,combocappuccino.getSelectedIndex());
					CafeIn.siparisler.add(yemek);
					
					
				}
				if (latte.isSelected()){
					int label_text = lbllatte.getText().trim().indexOf('T');
					String fiyat_text = lbllatte.getText().substring(0, label_text);
					Double fiyat = Double.parseDouble(fiyat_text);
					Yemek yemek = new Yemek(latte.getText(),fiyat,combolatte.getSelectedIndex());
					CafeIn.siparisler.add(yemek);
					
					
				}
				if (turkkahvesi.isSelected()){
					int label_text = lblturkkahvesi.getText().trim().indexOf('T');
					String fiyat_text = lblturkkahvesi.getText().substring(0, label_text);
					Double fiyat = Double.parseDouble(fiyat_text);
					Yemek yemek = new Yemek(turkkahvesi.getText(),fiyat,comboturkkahvesi.getSelectedIndex());
					CafeIn.siparisler.add(yemek);
					
					
				}
				
				
				if (frm2 == null){
					frm2 = new Siparisleriniz();
				}
				
				else{
					
					frm2.getFrame().setVisible(true);
					
					frame.setVisible(false);
				}
					
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
