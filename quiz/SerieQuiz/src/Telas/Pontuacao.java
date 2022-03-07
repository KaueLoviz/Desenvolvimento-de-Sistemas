package Telas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;



public class Pontuacao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Pontuacao() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 399, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Pontuacao.class.getResource("/img/pontua.png")));
		label.setBounds(0, 0, 383, 118);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 102));
		panel.setBounds(0, 118, 383, 321);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Acertos: ");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(34, 60, 104, 28);
		panel.add(lblNewLabel);
		
		JLabel lblErros = new JLabel("Erros: ");
		lblErros.setForeground(Color.WHITE);
		lblErros.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblErros.setBounds(34, 99, 104, 28);
		panel.add(lblErros);
		
		JLabel lblAcertos = new JLabel("Acertos (%): ");
		lblAcertos.setForeground(Color.WHITE);
		lblAcertos.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblAcertos.setBounds(34, 138, 104, 28);
		panel.add(lblAcertos);
		
		JLabel lblErros_1 = new JLabel("Erros (%): ");
		lblErros_1.setForeground(Color.WHITE);
		lblErros_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblErros_1.setBounds(34, 177, 104, 28);
		panel.add(lblErros_1);
		
		JLabel lblAcerto = new JLabel("0");
		lblAcerto.setHorizontalAlignment(SwingConstants.CENTER);
		lblAcerto.setForeground(Color.WHITE);
		lblAcerto.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblAcerto.setBounds(232, 70, 46, 14);
		panel.add(lblAcerto);
		
		JLabel lblErro = new JLabel("0");
		lblErro.setHorizontalAlignment(SwingConstants.CENTER);
		lblErro.setForeground(Color.WHITE);
		lblErro.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblErro.setBounds(232, 109, 46, 14);
		panel.add(lblErro);
		
		JLabel lblPorAcerto = new JLabel("0%");
		lblPorAcerto.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorAcerto.setForeground(Color.WHITE);
		lblPorAcerto.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblPorAcerto.setBounds(243, 145, 46, 14);
		panel.add(lblPorAcerto);
		
		JLabel lblPorErro = new JLabel("0%");
		lblPorErro.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorErro.setForeground(Color.WHITE);
		lblPorErro.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblPorErro.setBounds(252, 184, 37, 14);
		panel.add(lblPorErro);
	
	lblAcerto.setText(String.valueOf(Pontos.getAcertos()));
	lblErro.setText(String.valueOf(Pontos.getErro()));
	lblPorAcerto.setText(String.valueOf(100*Pontos.getAcertos()/10)+" %");
	lblPorErro.setText(String.valueOf(100*Pontos.getErro()/10)+" %");
	}
}
