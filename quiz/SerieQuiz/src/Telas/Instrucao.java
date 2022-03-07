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

public class Instrucao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Instrucao() {
		setResizable(false);
		setTitle("Instru\u00E7\u00F5es");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 399, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Instrucao.class.getResource("/img/Instru\u00E7\u00F5es (1).png")));
		label.setBounds(0, 0, 383, 132);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 102));
		panel.setBounds(0, 110, 383, 329);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblQuizSobreConhecimentos = new JLabel("Quiz sobre s\u00E9ries:");
		lblQuizSobreConhecimentos.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuizSobreConhecimentos.setFont(new Font("Century Gothic", Font.BOLD, 19));
		lblQuizSobreConhecimentos.setForeground(Color.WHITE);
		lblQuizSobreConhecimentos.setBounds(21, 27, 325, 79);
		panel.add(lblQuizSobreConhecimentos);
		
		JLabel lblVocPrecisaEscolher = new JLabel("- Voc\u00EA precisa escolher a resposta correta;");
		lblVocPrecisaEscolher.setForeground(Color.WHITE);
		lblVocPrecisaEscolher.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblVocPrecisaEscolher.setBounds(21, 103, 363, 55);
		panel.add(lblVocPrecisaEscolher);
		
		JLabel lblNoT = new JLabel("- No t\u00E9rmino ser\u00E1 mostrado a quantidade de");
		lblNoT.setForeground(Color.WHITE);
		lblNoT.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNoT.setBounds(10, 154, 351, 51);
		panel.add(lblNoT);
		
		JLabel lblErrosE = new JLabel("acertos e erros;  ");
		lblErrosE.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblErrosE.setForeground(Color.WHITE);
		lblErrosE.setBounds(20, 194, 267, 32);
		panel.add(lblErrosE);
		
		JLabel lblTambmSer = new JLabel("- Tamb\u00E9m ser\u00E1 exibido a porcentagem");
		lblTambmSer.setForeground(Color.WHITE);
		lblTambmSer.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblTambmSer.setBounds(10, 226, 351, 51);
		panel.add(lblTambmSer);
		
		JLabel lblFinal = new JLabel("final.");
		lblFinal.setForeground(Color.WHITE);
		lblFinal.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblFinal.setBounds(33, 265, 73, 21);
		panel.add(lblFinal);
	}
}
