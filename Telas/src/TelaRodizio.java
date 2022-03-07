import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class TelaRodizio extends JFrame {

	private JPanel contentPane;
	private JTextField txtPlaca1;
	private JTextField txtPlaca2;
	private JButton btnVerificar;
	private JLabel lblDia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRodizio frame = new TelaRodizio();
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
	public TelaRodizio() {
		setTitle("Tela Rodizio");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 300, 349, 236);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite a placa do Carro");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(51, 11, 230, 25);
		contentPane.add(lblNewLabel);
		
		txtPlaca1 = new JTextField();
		txtPlaca1.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtPlaca1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlaca1.setBounds(31, 60, 103, 41);
		contentPane.add(txtPlaca1);
		txtPlaca1.setColumns(10);
		
		txtPlaca2 = new JTextField();
		txtPlaca2.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtPlaca2.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlaca2.setBounds(191, 60, 115, 41);
		contentPane.add(txtPlaca2);
		txtPlaca2.setColumns(10);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaRodizio.this.dispose();
			}
		});
		btnFechar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFechar.setBounds(41, 118, 89, 35);
		contentPane.add(btnFechar);
		
		
		lblDia = new JLabel("...");
		lblDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblDia.setForeground(new Color(0, 0, 255));
		lblDia.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblDia.setBounds(77, 164, 204, 39);
		contentPane.add(lblDia);
		
		btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String placa = txtPlaca2.getText();
				   int ultimo = Integer.parseInt(placa.substring(3,4));
				
				if (ultimo == 1 | ultimo == 2) {
					lblDia.setText("Segunda-Feira");
				}else if (ultimo == 3 | ultimo == 4) {
					lblDia.setText("Terça-Feira");
				}else if (ultimo == 5 | ultimo == 6) {
					lblDia.setText("Quarta-Feira");
				}else if (ultimo == 7 | ultimo == 8) {
					lblDia.setText("Quinta-Feira");
				}else {
					lblDia.setText("Sexta-Feira");
				}
			}
		});
		btnVerificar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVerificar.setBounds(191, 118, 115, 35);
		contentPane.add(btnVerificar);
	}

}
