import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TelaCalcular extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor1;
	private JTextField txtValor2;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalcular frame = new TelaCalcular();
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
	public TelaCalcular() {
		setResizable(false);
		setTitle("Tela Calcular");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 300, 377, 139);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o Primeiro Valor");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 11, 113, 14);
		contentPane.add(lblNewLabel);
		
		txtValor1 = new JTextField();
		txtValor1.setHorizontalAlignment(SwingConstants.CENTER);
		txtValor1.setBounds(10, 32, 101, 20);
		contentPane.add(txtValor1);
		txtValor1.setColumns(10);
		
		JLabel lblDigiteOSegundo = new JLabel("Digite o Segundo Valor");
		lblDigiteOSegundo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDigiteOSegundo.setBounds(133, 11, 113, 14);
		contentPane.add(lblDigiteOSegundo);
		
		txtValor2 = new JTextField();
		txtValor2.setHorizontalAlignment(SwingConstants.CENTER);
		txtValor2.setBounds(133, 32, 113, 20);
		contentPane.add(txtValor2);
		txtValor2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(276, 11, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		txtResultado = new JTextField();
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setEditable(false);
		txtResultado.setBounds(271, 32, 71, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnSomar = new JButton("+");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int valor1 = Integer.parseInt(txtValor1.getText());
				int valor2 = Integer.parseInt(txtValor2.getText());
				
				int total = valor1 + valor2;
				
				txtResultado.setText(Integer.toString(total));
			}
		});
		
	    btnSomar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSomar.setBounds(10, 63, 47, 37);
		contentPane.add(btnSomar);
		
		JButton btnSubtrair = new JButton("-");
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int valor1 = Integer.parseInt(txtValor1.getText());
				int valor2 = Integer.parseInt(txtValor2.getText());
				
				int total = valor1 - valor2;
				
				txtResultado.setText(Integer.toString(total));
			}
		});
		btnSubtrair.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubtrair.setBounds(67, 63, 47, 37);
		contentPane.add(btnSubtrair);
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int valor1 = Integer.parseInt(txtValor1.getText());
				int valor2 = Integer.parseInt(txtValor2.getText());
				
				int total = valor1 * valor2;
				
				txtResultado.setText(Integer.toString(total));
			}
		});
		btnMultiplicar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiplicar.setBounds(124, 63, 47, 37);
		contentPane.add(btnMultiplicar);
		
		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor1 = Double.parseDouble(txtValor1.getText());
				double valor2 = Double.parseDouble(txtValor2.getText());
				
				double total = valor1 / valor2;
				
				txtResultado.setText(String.format("%.2f", total));
			}
		});
		btnDividir.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDividir.setBounds(181, 63, 47, 37);
		contentPane.add(btnDividir);
		
		JButton btnLimpar = new JButton("L");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtValor1.setText("");
				txtValor2.setText("");
				txtResultado.setText("");
				
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLimpar.setBounds(238, 63, 47, 37);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("X");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaCalcular.this.dispose();
			}
		});
		btnFechar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnFechar.setBounds(295, 63, 47, 37);
		contentPane.add(btnFechar);
	}
}
