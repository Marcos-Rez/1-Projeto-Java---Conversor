import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		
		setTitle("Challenge Oracle ONE Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor");
		lblNewLabel.setBounds(26, 66, 59, -24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Conversor");
		lblNewLabel_1.setForeground(new Color(240, 255, 255));
		lblNewLabel_1.setBackground(new Color(245, 255, 250));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(26, 58, 116, 40);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setEditable(true);
		comboBox.setForeground(new Color(0, 0, 255));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 24));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = comboBox.getSelectedIndex();
				String item = comboBox.getSelectedItem().toString();
				int v = comboBox.getComponentZOrder(comboBox);
				System.out.println(index);
				
				
				if(index == 1) {
					ViewMoedas moeda = new ViewMoedas();
					moeda.setVisible(true);
					dispose();//Fechar Principal -> Principal.java
				}
				
				else if(index == 2) {
					ViewTemperatura temp = new ViewTemperatura();
					temp.setVisible(true);
					dispose();//Fechar Principal -> Principal.java
;
				}

						
			}

	
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Escolha uma op\u00E7\u00E3o", "Conversor de moedas", "Conversor de Temperatura"}));
		comboBox.setBounds(26, 97, 298, 40);
		contentPane.add(comboBox);

	}
}
