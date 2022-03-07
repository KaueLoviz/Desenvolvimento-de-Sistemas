import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaSalario extends JFrame {

	private JPanel contentPane;
	private JTextField txtSalario;
	private JTextField txtResultadoSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSalario frame = new TelaSalario();
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
	public TelaSalario() {
		setTitle("Tela Sal\u00E1rio");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 300, 468, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o Sal\u00E1rio");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 104, 22);
		contentPane.add(lblNewLabel);
		
		txtSalario = new JTextField();
		txtSalario.setHorizontalAlignment(SwingConstants.CENTER);
		txtSalario.setBounds(10, 36, 93, 22);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("B\u00F4nus");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(141, 11, 66, 22);
		contentPane.add(lblNewLabel_1);
		
		JSpinner spnBonus = new JSpinner();
		spnBonus.setBounds(141, 37, 66, 20);
		contentPane.add(spnBonus);
		
		JLabel lblNewLabel_2 = new JLabel("Sal\u00E1rio a Receber");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(300, 15, 120, 14);
		contentPane.add(lblNewLabel_2);
		
		txtResultadoSalario = new JTextField();
		txtResultadoSalario.setEditable(false);
		txtResultadoSalario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtResultadoSalario.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultadoSalario.setBounds(300, 36, 113, 20);
		contentPane.add(txtResultadoSalario);
		txtResultadoSalario.setColumns(10);
		
		JPanel pnlDesconto = new JPanel();
		pnlDesconto.setBackground(new Color(152, 251, 152));
		pnlDesconto.setForeground(Color.WHITE);
		pnlDesconto.setBounds(10, 89, 197, 129);
		contentPane.add(pnlDesconto);
		pnlDesconto.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Desconto");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(63, 0, 73, 14);
		pnlDesconto.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("INSS(7,5%)");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 30, 73, 14);
		pnlDesconto.add(lblNewLabel_4);
		
		JLabel lbl5 = new JLabel("VT(6%)");
		lbl5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl5.setBounds(10, 55, 73, 14);
		pnlDesconto.add(lbl5);
		
		JLabel lbl6 = new JLabel("VA(4,5%)");
		lbl6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl6.setBounds(10, 80, 73, 14);
		pnlDesconto.add(lbl6);
		
		JLabel lblNewLabel_5 = new JLabel("Total Desconto");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 115, 88, 14);
		pnlDesconto.add(lblNewLabel_5);
		
		JLabel lblInss = new JLabel("0");
		lblInss.setHorizontalAlignment(SwingConstants.CENTER);
		lblInss.setBounds(124, 31, 63, 14);
		pnlDesconto.add(lblInss);
		
		JLabel lblVT = new JLabel("0");
		lblVT.setHorizontalAlignment(SwingConstants.CENTER);
		lblVT.setBounds(124, 56, 63, 14);
		pnlDesconto.add(lblVT);
		
		JLabel lblVA = new JLabel("0");
		lblVA.setHorizontalAlignment(SwingConstants.CENTER);
		lblVA.setBounds(124, 81, 63, 14);
		pnlDesconto.add(lblVA);
		
		JLabel lblTotalDesconto = new JLabel("0");
		lblTotalDesconto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalDesconto.setBounds(124, 115, 63, 14);
		pnlDesconto.add(lblTotalDesconto);
		
		JLabel lblNewLabel_10 = new JLabel("    _______________");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setBounds(80, 91, 117, 14);
		pnlDesconto.add(lblNewLabel_10);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaSalario.this.dispose();
			}
		});
		btnFechar.setBounds(14, 237, 89, 23);
		contentPane.add(btnFechar);
		
		
		JPanel pnlBonificacao = new JPanel();
		pnlBonificacao.setBackground(new Color(255, 160, 122));
		pnlBonificacao.setBounds(255, 89, 197, 129);
		contentPane.add(pnlBonificacao);
		pnlBonificacao.setLayout(null);
		
		JLabel lbl = new JLabel("B\u00F4nus");
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl.setBounds(10, 24, 46, 14);
		pnlBonificacao.add(lbl);
		
		JLabel lblNewLabel_7 = new JLabel("Bonifica\u00E7\u00E3o");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(61, 0, 86, 14);
		pnlBonificacao.add(lblNewLabel_7);
		
		JLabel lbl8 = new JLabel("VC(5%)");
		lbl8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl8.setBounds(10, 49, 46, 14);
		pnlBonificacao.add(lbl8);
		
		JLabel label = new JLabel("    _______________");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(80, 82, 117, 14);
		pnlBonificacao.add(label);
		
		JLabel lblBonus = new JLabel("0");
		lblBonus.setHorizontalAlignment(SwingConstants.CENTER);
		lblBonus.setBounds(124, 25, 63, 14);
		pnlBonificacao.add(lblBonus);
		
		JLabel lblVC = new JLabel("0");
		lblVC.setHorizontalAlignment(SwingConstants.CENTER);
		lblVC.setBounds(124, 50, 63, 14);
		pnlBonificacao.add(lblVC);
		
		JLabel lblNewLabel_8 = new JLabel("Total B\u00F4nus");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(10, 115, 75, 14);
		pnlBonificacao.add(lblNewLabel_8);
		
		JLabel lblTotalBonus = new JLabel("0");
		lblTotalBonus.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalBonus.setBounds(124, 115, 63, 14);
		pnlBonificacao.add(lblTotalBonus);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblInss.setText("0");
				lblVA.setText("0");
				lblVT.setText("0");
				lblTotalDesconto.setText("0");
				lblBonus.setText("0");
				lblVC.setText("0");
				txtResultadoSalario.setText("0");
				txtSalario.setText("0");
				
				
			}
		});
		btnLimpar.setBounds(197, 237, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				
				double salario = Double.parseDouble(txtSalario.getText());
				
				double inss = salario * 7.5 / 100;
				lblInss.setText(String.format("R$  %.2f", inss));
				
				double vt = salario * 6 / 100;
				lblVT.setText(String.format("R$  %.2f", vt));
				
				double va = salario * 4.5 / 100;
				lblVA.setText(String.format("R$  %.2f", va));
				
				double totalDesconto = inss+vt+va;
				lblTotalDesconto.setText(String.format("R$ %.2f", totalDesconto));
				
				//Bonificação
				
				int porcentagem = Integer.parseInt(spnBonus.getValue().toString());
				
				double bonus = salario * porcentagem / 100;
				lblBonus.setText(String.format("R$ %.2f", bonus));
				
				double vc = salario * 5 /100;
				lblVC.setText(String.format("R$ %.2f", vc));
				
				double totalBonus = bonus + vc;
				lblTotalBonus.setText(String.format("R$ %.2f", totalBonus));
				
				double totalReceber = salario + totalBonus - totalDesconto;
				txtResultadoSalario.setText(String.format("R$ %.2f", totalReceber));	
				
				
			}
		});
		btnCalcular.setBounds(363, 237, 89, 23);
		contentPane.add(btnCalcular);
	}
}
