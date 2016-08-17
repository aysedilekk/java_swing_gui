import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.CardLayout;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JComboBox;

import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.Component;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.LinkedList;
import java.util.List;


public class CafeIn {

	private JFrame frame;

	IkinciSayfa frm2;
	
	public static int tableNo;
	public static List<Yemek> siparisler= new LinkedList<Yemek>();
	
	
	
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CafeIn window = new CafeIn();
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
	public CafeIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.setBounds(100, 100, 1000, 850);
		frame.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_112060673681914");
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblCafeIn = new JLabel("CAFE IN");
		lblCafeIn.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(lblCafeIn);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 35));
		
		JLabel lblMasaNumaras = new JLabel("Masa Numaras\u0131:");
		lblMasaNumaras.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblMasaNumaras.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_3.add(lblMasaNumaras);
		
		
		String [] items = new String[11];
		
		items[0]="seçiniz";
		items[1]="1";
		items[2]="2";
		items[3]="3";
		items[4]="4";
		items[5]="5";
		items[6]="6";
		items[7]="7";
		items[8]="8";
		items[9]="9";
		items[10]="10";
		
		JComboBox tableCombo = new JComboBox(items);
		tableCombo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				 if(e.getStateChange() == ItemEvent.SELECTED){
					 tableNo = tableCombo.getSelectedIndex();
					 System.out.println(tableCombo.getSelectedIndex());
					 
				 } 
				 
				 
				 
				
					 			
				
			}
		});
		
		tableCombo.setToolTipText("");
		
		tableCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				if (frm2 == null){
					frm2 = new IkinciSayfa();
						
					}
					if(tableCombo.getSelectedIndex() ==0){
						
						JOptionPane.showMessageDialog(null, "Lütfen geçerli bir masa numarasý seçiniz");
						
					}
					else{
						frame.setVisible(false);
						frm2.getFrame().setVisible(true);
					}
				}
					
					
			
		});
		tableCombo.setBackground(UIManager.getColor("TextField.inactiveBackground"));
		tableCombo.setMaximumRowCount(20);
		
		 
		// add items to the combo box
		
		
		panel_3.add(tableCombo);

		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/aa.png")).getImage();
		panel_4.setLayout(new BorderLayout(0, 0));
		lblNewLabel.setIcon(new ImageIcon(img));
		panel_4.add(lblNewLabel);
	}

	public JFrame getFrame() {
		return frame;
	}
	
	
}
