import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("TelaPrincipal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 566, 146);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalcular = new JButton("");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TelaCalcular janela = new TelaCalcular();
				janela.setVisible(true);
				
			}
		});
		btnCalcular.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/calculadora.png")));
		btnCalcular.setBounds(10, 11, 100, 100);
		contentPane.add(btnCalcular);
		
		JButton btnSalario = new JButton("");
		btnSalario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaSalario janela = new TelaSalario();
				janela.setVisible(true);
				
			}
		});
		btnSalario.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/salario.png")));
		btnSalario.setBounds(120, 11, 100, 100);
		contentPane.add(btnSalario);
		
		JButton btnRodizio = new JButton("");
		btnRodizio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaRodizio janela = new TelaRodizio();
				janela.setVisible(true);
			}
		});
		btnRodizio.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/rodizio.png")));
		btnRodizio.setBounds(230, 11, 100, 100);
		contentPane.add(btnRodizio);
		
		JButton btnComprar = new JButton("");
		btnComprar.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/comprar.png")));
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaComprar janela = new TelaComprar();
				janela.setVisible(true);
			}
		});
		btnComprar.setBounds(340, 11, 100, 100);
		contentPane.add(btnComprar);
		
		JButton btnRestaurante = new JButton("");
		btnRestaurante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaRestaurante janela = new TelaRestaurante();
				janela.setVisible(true);
			}
		});
		btnRestaurante.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/restaurante.png")));
		btnRestaurante.setBounds(450, 11, 100, 100);
		contentPane.add(btnRestaurante);
	}
}
