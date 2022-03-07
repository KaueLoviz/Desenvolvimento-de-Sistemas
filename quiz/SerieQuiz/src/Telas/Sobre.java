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
import javax.swing.JButton;

public class Sobre extends JFrame {
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Sobre() {
		setResizable(false);
		setTitle("Sobre");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 399, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Sobre.class.getResource("/img/et.png")));
		label.setBounds(0, 0, 393, 130);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 102));
		panel.setBounds(0, 130, 393, 319);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Desenvolvido por: Etec de Guaianazes");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel.setBounds(48, 36, 310, 58);
		panel.add(lblNewLabel);
		
		JLabel lblVersoBeta = new JLabel("Vers\u00E3o: 0.1 Beta");
		lblVersoBeta.setHorizontalAlignment(SwingConstants.CENTER);
		lblVersoBeta.setForeground(Color.WHITE);
		lblVersoBeta.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblVersoBeta.setBounds(36, 105, 325, 47);
		panel.add(lblVersoBeta);
		
		JLabel lblCriaoLarissa = new JLabel("Kau\u00EA e Paulo ");
		lblCriaoLarissa.setHorizontalAlignment(SwingConstants.CENTER);
		lblCriaoLarissa.setForeground(Color.WHITE);
		lblCriaoLarissa.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblCriaoLarissa.setBounds(62, 161, 268, 58);
		panel.add(lblCriaoLarissa);
	}

}
