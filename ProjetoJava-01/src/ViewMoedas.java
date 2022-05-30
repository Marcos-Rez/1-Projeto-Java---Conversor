import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class ViewMoedas extends JFrame {

	private JPanel contentPane;
	private JTextField textValor;
	
	Boolean padrao = false;
	int tipoDeEntrada;
	private JTextField textInformarCotacao;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMoedas frame = new ViewMoedas();
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
	public ViewMoedas() {
		setTitle("Challenge Oracle ONE Java");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 51, 153));
		comboBox.setEditable(true);
		comboBox.setBackground(SystemColor.textHighlightText);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 26));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textValor.setText("");
	
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {" Selecione Uma Das Op\u00E7\u00F5es", "1 - Real para Dolar", "2 - Dolar para Real", "3 - Real para Euro", "4 - Euro para real", "5 - Real para Libra Esterlina", "6 - Libra Esterlina para Real", "7 - Real para Peso Argentino", "8 - Peso Argentino para Real", "9 - Real para Peso Chileno", "10 - Peso Chileno para Real"}));
		
		textValor = new JTextField();
		textValor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			}
		});
		textValor.setColumns(10);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConverter.setBackground(SystemColor.control);
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int opc = comboBox.getSelectedIndex();
				System.out.println("index: "+opc);

				Conversor opcao = new Conversor();
				String dinheiro = textValor.getText();
				Double valor = Double.parseDouble(dinheiro);
				
				//CotacaoPadraoRadioButton.isSelected();
				
				System.out.println("tipoDeEntrada: "+tipoDeEntrada);
				
				//opcao.moedas(opc, valor, tipoDeEntrada);
				if(tipoDeEntrada == 1) {
				
				Double resultado = opcao.moedas(opc, valor, tipoDeEntrada, null);
				String r = String.valueOf(resultado);
				textValor.setText(r);

			}else if(tipoDeEntrada == 2){
				String cotacao = textInformarCotacao.getText();
				Double cotacao1 = Double.parseDouble(cotacao);
				Double resultado = opcao.moedas(opc, valor,tipoDeEntrada, cotacao1);
				String r = String.valueOf(resultado);
				textValor.setText(r);
				}
			}
				
		});
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValor.setText("");
				textInformarCotacao.setText("");
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnLimpar.setBackground(SystemColor.inactiveCaption);
		
		JButton btnRetorno = new JButton("Retornar");
		btnRetorno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal retorno = new Principal();
				retorno.setVisible(true);
				dispose();
			}
		});
		btnRetorno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRetorno.setBackground(SystemColor.inactiveCaption);
		
		ButtonGroup group = new ButtonGroup();//Criando um grupo para haver apenas um JRadioButtom marcaco
		
		JRadioButton CotacaoPadraoRadioButton = new JRadioButton("Cota\u00E7\u00E3o Padr\u00E3o");
		CotacaoPadraoRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				group.add(CotacaoPadraoRadioButton);//Adicionando ao grupo
				padrao = CotacaoPadraoRadioButton.isSelected();
				if(padrao) {
				tipoDeEntrada = 1;
				}
		}
		});
		CotacaoPadraoRadioButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		CotacaoPadraoRadioButton.setForeground(Color.WHITE);
		CotacaoPadraoRadioButton.setBackground(new Color(0, 51, 102));
		
		JRadioButton InformarCotacaoNewRadioButton = new JRadioButton("Informar a Cota\u00E7\u00E3o");
		InformarCotacaoNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				group.add(InformarCotacaoNewRadioButton);//Adicionando ao grupo
				padrao = InformarCotacaoNewRadioButton.isSelected();
				if(padrao) {
					tipoDeEntrada = 2;
				}
			}
		});
		InformarCotacaoNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		InformarCotacaoNewRadioButton.setForeground(Color.WHITE);
		InformarCotacaoNewRadioButton.setBackground(new Color(0, 51, 102));
		
		textInformarCotacao = new JTextField();
		textInformarCotacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textInformarCotacao.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(CotacaoPadraoRadioButton, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addGap(1)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(InformarCotacaoNewRadioButton, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addComponent(textInformarCotacao, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnConverter, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(textValor, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnRetorno, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(btnLimpar, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(CotacaoPadraoRadioButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addComponent(InformarCotacaoNewRadioButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(36)
							.addComponent(textInformarCotacao, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
					.addGap(16)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnConverter, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(textValor, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRetorno, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLimpar, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
