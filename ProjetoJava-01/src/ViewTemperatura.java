import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewTemperatura extends JFrame {

	private JPanel contentPane;
	private JTextField textTemperatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTemperatura frame = new ViewTemperatura();
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
	public ViewTemperatura() {
		setTitle("Challenge Oracle ONE Java");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(UIManager.getColor("Button.highlight"));
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBoxOpc = new JComboBox();
		comboBoxOpc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboBoxOpc.setEditable(true);
		comboBoxOpc.setBackground(new Color(255, 255, 255));
		comboBoxOpc.setFont(new Font("DejaVu Serif", Font.PLAIN, 18));
		comboBoxOpc.setForeground(new Color(0, 0, 255));
		comboBoxOpc.setModel(new DefaultComboBoxModel(new String[] {" Escolha uma op\u00E7\u00E3o", " Fahrenheit para Celsius", " Celsius para Fahrenheit"}));
		comboBoxOpc.setBounds(48, 53, 321, 44);
		contentPane.add(comboBoxOpc);
		
		JButton btnNewButton = new JButton("Converter");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int opc = comboBoxOpc.getSelectedIndex();
				String t = textTemperatura.getText();
				Double temperatura = Double.parseDouble(t);
				
				ConvTemp temp = new ConvTemp();
				
				Double resultado = temp.conversor(opc, temperatura);
				String r = String.valueOf(resultado);
				textTemperatura.setText(r);

				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setBounds(48, 112, 140, 44);
		contentPane.add(btnNewButton);
		
		textTemperatura = new JTextField();
		textTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textTemperatura.setBounds(198, 112, 171, 44);
		contentPane.add(textTemperatura);
		textTemperatura.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTemperatura.setText("");
			}
		});
		btnLimpar.setForeground(SystemColor.textHighlight);
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLimpar.setBackground(new Color(230, 230, 250));
		btnLimpar.setBounds(198, 167, 171, 44);
		contentPane.add(btnLimpar);
		
		JButton btnRetornar = new JButton("Retornar");
		btnRetornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal retorno = new Principal();
				retorno.setVisible(true);
				dispose();
			}
		});
		btnRetornar.setForeground(SystemColor.textHighlight);
		btnRetornar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRetornar.setBackground(new Color(230, 230, 250));
		btnRetornar.setBounds(48, 167, 140, 44);
		contentPane.add(btnRetornar);
	}
}
