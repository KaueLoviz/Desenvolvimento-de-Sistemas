package Telas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Perguntas01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Perguntas01() {
                Pontos.acerto = 0;
                Pontos.erro = 0;
		setTitle("Pergunta N\u00B001");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 399, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 102));
		panel.setBounds(0, 117, 393, 332);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton opcao04 = new JRadioButton("Nancy");
		opcao04.setForeground(Color.WHITE);
		opcao04.setBackground(new Color(0, 0, 102));
		opcao04.setFont(new Font("Century Gothic", Font.BOLD, 16));
		opcao04.setBounds(46, 207, 109, 23);
		panel.add(opcao04);
		
		JRadioButton opcao03 = new JRadioButton("Mike ");
		opcao03.setBackground(new Color(0, 0, 102));
		opcao03.setForeground(Color.WHITE);
		opcao03.setFont(new Font("Century Gothic", Font.BOLD, 16));
		opcao03.setBounds(46, 157, 109, 23);
		panel.add(opcao03);
		
		JRadioButton opcao02 = new JRadioButton("Will");
		opcao02.setForeground(Color.WHITE);
		opcao02.setBackground(new Color(0, 0, 102));
		opcao02.setFont(new Font("Century Gothic", Font.BOLD, 16));
		opcao02.setBounds(46, 110, 109, 23);
		panel.add(opcao02);
		
		JRadioButton opcao01 = new JRadioButton("Eleven ");
		opcao01.setBackground(new Color(0, 0, 102));
		opcao01.setForeground(Color.WHITE);
		opcao01.setFont(new Font("Century Gothic", Font.BOLD, 16));
		opcao01.setBounds(46, 60, 109, 23);
		panel.add(opcao01);
		
		ButtonGroup bgGrupo = new ButtonGroup();
		bgGrupo.add(opcao01);
		bgGrupo.add(opcao02);
		bgGrupo.add(opcao03);
		bgGrupo.add(opcao04);
		
		JLabel lblQualO = new JLabel("Quem desaparece na s\u00E9rie?");
		lblQualO.setForeground(Color.WHITE);
		lblQualO.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblQualO.setBounds(20, 11, 373, 45);
		panel.add(lblQualO);
		
		JButton btnPrximo = new JButton("Pr\u00F3ximo");
		btnPrximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 if(bgGrupo.isSelected(null)) {
					JOptionPane.showMessageDialog(null,"Por Favor! Selecione uma opção");
				}else {
					
			  if(opcao02.isSelected()) {
			   Pontos.acerto();
				}else {
						Pontos.erro();
					}
					Pergunta02 janela = new Pergunta02();
					janela.setVisible(true);
					Perguntas01.this.dispose();
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
				Perguntas01.this.dispose();
				Pontos.acerto = 0;
				Pontos.erro = 0;
			}
		});
		btnIncio.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnIncio.setBackground(Color.WHITE);
		btnIncio.setBounds(66, 250, 109, 33);
		panel.add(btnIncio);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Perguntas01.class.getResource("/img/st.png")));
		label.setBounds(0, 0, 393, 118);
		contentPane.add(label);
	}
}
