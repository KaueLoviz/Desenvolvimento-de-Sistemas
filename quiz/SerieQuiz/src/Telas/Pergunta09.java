package Telas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class Pergunta09 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Pergunta09() {
                Pontos.acerto = 0;
                Pontos.erro = 0;
		setTitle("Pergunta N\u00B009");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 399, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 102));
		panel.setBounds(0, 119, 393, 330);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton opcao04 = new JRadioButton("Otavio Queen ");
		opcao04.setForeground(Color.WHITE);
		opcao04.setBackground(new Color(0, 0, 102));
		opcao04.setFont(new Font("Century Gothic", Font.BOLD, 16));
		opcao04.setBounds(46, 207, 228, 23);
		panel.add(opcao04);
		
		JRadioButton opcao03 = new JRadioButton("Ted Queen ");
		opcao03.setBackground(new Color(0, 0, 102));
		opcao03.setForeground(Color.WHITE);
		opcao03.setFont(new Font("Century Gothic", Font.BOLD, 16));
		opcao03.setBounds(46, 157, 228, 23);
		panel.add(opcao03);
		
		JRadioButton opcao02 = new JRadioButton("Oliee Queen ");
		opcao02.setForeground(Color.WHITE);
		opcao02.setBackground(new Color(0, 0, 102));
		opcao02.setFont(new Font("Century Gothic", Font.BOLD, 16));
		opcao02.setBounds(46, 110, 239, 23);
		panel.add(opcao02);
		
		JRadioButton opcao01 = new JRadioButton("Oliver Queen ");
		opcao01.setBackground(new Color(0, 0, 102));
		opcao01.setForeground(Color.WHITE);
		opcao01.setFont(new Font("Century Gothic", Font.BOLD, 16));
		opcao01.setBounds(46, 60, 251, 23);
		panel.add(opcao01);
		
		ButtonGroup bgGrupo = new ButtonGroup();
		bgGrupo.add(opcao01);
		bgGrupo.add(opcao02);
		bgGrupo.add(opcao03);
		bgGrupo.add(opcao04);
		
		JLabel lblQualO = new JLabel("Qual \u00E9 o nome do arqueiro?");
		lblQualO.setForeground(Color.WHITE);
		lblQualO.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblQualO.setBounds(10, 11, 383, 45);
		panel.add(lblQualO);
		
		JButton btnPrximo = new JButton("Pr\u00F3ximo");
		btnPrximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(bgGrupo.isSelected(null)) {
						JOptionPane.showMessageDialog(null,"Por Favor! Selecione uma opção");
					}else {
						
				  if(opcao01.isSelected()) {
				   Pontos.acerto();
					}else {
							Pontos.erro();
						}
						Pergunta10 janela = new Pergunta10();
						janela.setVisible(true);
						Pergunta09.this.dispose();
					}
			}
		});
		btnPrximo.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnPrximo.setBackground(Color.WHITE);
		btnPrximo.setBounds(221, 250, 109, 33);
		panel.add(btnPrximo);
		
		JButton btnIncio = new JButton("In\u00EDcio");
		btnIncio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipalQuiz tela =  new TelaPrincipalQuiz();
				tela.setVisible(true);
				Pergunta09.this.dispose();
				Pontos.acerto = 0;
				Pontos.erro = 0;
			}
		});
		btnIncio.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnIncio.setBackground(Color.WHITE);
		btnIncio.setBounds(31, 250, 109, 33);
		panel.add(btnIncio);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Pergunta09.class.getResource("/img/arrow.png")));
		label.setBounds(0, 0, 393, 118);
		contentPane.add(label);
	}

}
