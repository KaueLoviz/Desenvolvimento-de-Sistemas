	import java.awt.BorderLayout;
	import java.awt.EventQueue;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
	import javax.swing.ButtonGroup;
	import javax.swing.ImageIcon;
	import javax.swing.JTextField;
	import javax.swing.JSpinner;
	import java.awt.Font;
	import javax.swing.SpinnerNumberModel;
	import javax.swing.JRadioButton;
	import java.awt.Color;
	import javax.swing.SwingConstants;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	public class TelaRestaurante extends JFrame {
		private JPanel contentPane;
		private JTextField txtConsumoTotal;
		private JTextField txtCover;
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						TelaRestaurante frame = new TelaRestaurante();
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
		public TelaRestaurante() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(500,160, 330, 550);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel label = new JLabel("");
			label.setBounds(154, 68, 46, 14);
			contentPane.add(label);
			
			JLabel label_1 = new JLabel("");
			label_1.setIcon(new ImageIcon(TelaRestaurante.class.getResource("/img/balaio.jpg")));
			label_1.setBounds(0, 0, 332, 147);
			contentPane.add(label_1);
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.LIGHT_GRAY);
			panel.setBounds(0, 158, 314, 178);
			contentPane.add(panel);
			panel.setLayout(null);
			
			txtConsumoTotal = new JTextField();
			txtConsumoTotal.setHorizontalAlignment(SwingConstants.CENTER);
			txtConsumoTotal.setBounds(187, 18, 117, 20);
			panel.add(txtConsumoTotal);
			txtConsumoTotal.setColumns(10);
			
			txtCover = new JTextField();
			txtCover.setHorizontalAlignment(SwingConstants.CENTER);
			txtCover.setFont(new Font("Tahoma", Font.BOLD, 12));
			txtCover.setEnabled(false);
			txtCover.setEditable(false);
			txtCover.setText("5,00");
			txtCover.setColumns(10);
			txtCover.setBounds(187, 51, 117, 20);
			panel.add(txtCover);
			
			JSpinner spDividir = new JSpinner();
			spDividir.setModel(new SpinnerNumberModel(1, 1, 10, 1));
			spDividir.setBounds(187, 85, 117, 20);
			panel.add(spDividir);
			
			JLabel lblConsumoTotal = new JLabel("Consumo Total:");
			lblConsumoTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblConsumoTotal.setBounds(10, 21, 105, 14);
			panel.add(lblConsumoTotal);
			
			JLabel lblCouverArtstico = new JLabel("Couver Art\u00EDstico: ");
			lblCouverArtstico.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblCouverArtstico.setBounds(10, 54, 131, 14);
			panel.add(lblCouverArtstico);
			
			JLabel lblDividirPor = new JLabel("Dividir por:");
			lblDividirPor.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblDividirPor.setBounds(10, 87, 117, 14);
			panel.add(lblDividirPor);
			
			JLabel lblPagarA = new JLabel("Pagar 10% da mesa?");
			lblPagarA.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblPagarA.setBounds(10, 128, 131, 14);
			panel.add(lblPagarA);
			
			JRadioButton rdSim = new JRadioButton("Sim");
			rdSim.setBackground(Color.LIGHT_GRAY);
			rdSim.setFont(new Font("Tahoma", Font.BOLD, 12));
			rdSim.setBounds(169, 125, 51, 23);
			panel.add(rdSim);
			
			JRadioButton rdNao = new JRadioButton("N\u00E3o");
			rdNao.setBackground(Color.LIGHT_GRAY);
			rdNao.setFont(new Font("Tahoma", Font.BOLD, 12));
			rdNao.setBounds(241, 125, 73, 23);
			panel.add(rdNao);
			
			ButtonGroup grupo = new ButtonGroup();
			grupo.add(rdNao);
			grupo.add(rdSim);
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(Color.GRAY);
			panel_1.setForeground(Color.DARK_GRAY);
			panel_1.setBounds(0, 347, 314, 124);
			contentPane.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Taxa de Servi\u00E7o (10%)");
			lblNewLabel.setBounds(10, 25, 146, 14);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			panel_1.add(lblNewLabel);
			
			JLabel lblValorTotal = new JLabel("Valor total");
			lblValorTotal.setBounds(10, 62, 146, 14);
			lblValorTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
			panel_1.add(lblValorTotal);
			
			JLabel lblValorPorPessoa = new JLabel("Valor por Pessoa ");
			lblValorPorPessoa.setBounds(10, 99, 146, 14);
			lblValorPorPessoa.setFont(new Font("Tahoma", Font.BOLD, 12));
			panel_1.add(lblValorPorPessoa);
			
			JLabel lblTaxa = new JLabel("R$ 0,00");
			lblTaxa.setBounds(232, 26, 72, 14);
			lblTaxa.setHorizontalAlignment(SwingConstants.RIGHT);
			lblTaxa.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblTaxa.setForeground(Color.RED);
			panel_1.add(lblTaxa);
			
			JLabel lblTotal = new JLabel("R$ 0,00");
			lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
			lblTotal.setBounds(215, 62, 92, 14);
			lblTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblTotal.setForeground(Color.RED);
			panel_1.add(lblTotal);
			
			JLabel lblValorPessoa = new JLabel("R$ 0,00");
			lblValorPessoa.setHorizontalAlignment(SwingConstants.RIGHT);
			lblValorPessoa.setBounds(212, 100, 95, 14);
			lblValorPessoa.setForeground(Color.RED);
			lblValorPessoa.setFont(new Font("Tahoma", Font.BOLD, 12));
			panel_1.add(lblValorPessoa);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBounds(0, 473, 314, 39);
			contentPane.add(panel_2);
			panel_2.setLayout(null);
			
			JButton btnLimpar = new JButton("Limpar");
			btnLimpar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtConsumoTotal.setText("0");
					txtCover.setText("0");
			        lblTaxa.setText("0");
					lblValorPessoa.setText("0");
					lblTotal.setText("0");
					
				}
			});
			btnLimpar.setBounds(119, 11, 81, 23);
			panel_2.add(btnLimpar);
			
			JButton btnCalcular = new JButton("Calcular");
			btnCalcular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double consumo = Double.parseDouble(txtConsumoTotal.getText());
					double taxa = consumo * 0.10;
					lblTaxa.setText(String.format("R$ %.2f", taxa));
					
					double total = 0;
					if(rdSim.isSelected()) {
						total = consumo + taxa + 5;
					}else {
						total = consumo + 5;
					}
					
					lblTotal.setText(String.format("R$ %.2f", total));
					
					int dividir = Integer.parseInt(spDividir.getValue().toString());
					double divisao = total / dividir;
					lblValorPessoa.setText(String.format("R$ %.2f", divisao));
				}
			});
			btnCalcular.setBounds(223, 11, 81, 23);
			panel_2.add(btnCalcular);
			
			JButton btnFechar = new JButton("Fechar");
			btnFechar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TelaRestaurante.this.dispose();
				}
			});
			btnFechar.setBounds(10, 11, 81, 23);
			panel_2.add(btnFechar);
		}
	}