package Telas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipalQuiz extends JFrame {

	private JPanel contentPane;
	private final JButton btnIniciar = new JButton("Iniciar");

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public TelaPrincipalQuiz() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 477);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Perguntas01 janela = new Perguntas01();
				janela.setVisible(true);
				
			}
		});
		btnIniciar.setBackground(Color.WHITE);
		btnIniciar.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnIniciar.setBounds(134, 191, 120, 38);
		contentPane.add(btnIniciar);
		
		JButton btnInstrucoes = new JButton("Instru\u00E7\u00F5es");
		btnInstrucoes.setBackground(Color.WHITE);
		btnInstrucoes.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnInstrucoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instrucao janela = new Instrucao();
				janela.setVisible(true);
			}
		});
		btnInstrucoes.setBounds(134, 260, 120, 38);
		contentPane.add(btnInstrucoes);
		
		JButton btnSobre = new JButton("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre janela = new Sobre();
				janela.setVisible(true);
			}
		});
		btnSobre.setBackground(Color.WHITE);
		btnSobre.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnSobre.setBounds(134, 328, 120, 38);
		contentPane.add(btnSobre);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaPrincipalQuiz.class.getResource("/img/sla.png")));
		label.setBounds(0, 0, 393, 132);
		contentPane.add(label);
	}
}
