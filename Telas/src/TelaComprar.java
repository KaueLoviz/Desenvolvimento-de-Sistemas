import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaComprar extends JFrame {

	private JPanel contentPane;
	private JTextField txtValorTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaComprar frame = new TelaComprar();
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
	public TelaComprar() {
		setEnabled(false);
		setResizable(false);
		setTitle("TelaComprar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtValorTotal = new JTextField();
		txtValorTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtValorTotal.setText("Valor Total");
		txtValorTotal.setBounds(150, 11, 86, 20);
		contentPane.add(txtValorTotal);
		txtValorTotal.setColumns(10);
		
		JLabel lblTotal = new JLabel("R$ 0.00");
		lblTotal.setForeground(Color.RED);
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Californian FB", Font.BOLD, 30));
		lblTotal.setBounds(-19, 30, 404, 37);
		contentPane.add(lblTotal);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(20, 62, 344, 244);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox ckArroz = new JCheckBox("Arroz(18.50)");
		ckArroz.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckArroz.setBounds(6, 8, 109, 23);
		panel.add(ckArroz);
		
		JCheckBox ckFeijao = new JCheckBox("Feij\u00E3o(8.90)");
		ckFeijao.setToolTipText("");
		ckFeijao.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckFeijao.setBounds(6, 40, 109, 23);
		panel.add(ckFeijao);
		
		JCheckBox ckAcucar = new JCheckBox("A\u00E7ucar(2.40)");
		ckAcucar.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckAcucar.setBounds(6, 74, 109, 23);
		panel.add(ckAcucar);
		
		JCheckBox ckCafe = new JCheckBox("Caf\u00E9(9.80)");
		ckCafe.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckCafe.setBounds(6, 110, 109, 23);
		panel.add(ckCafe);
		
		JCheckBox ckCereal = new JCheckBox("Cereal(13.90)");
		ckCereal.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckCereal.setBounds(6, 143, 109, 23);
		panel.add(ckCereal);
		
		JCheckBox ckAzeite = new JCheckBox("Azeite(12.80)");
		ckAzeite.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckAzeite.setBounds(6, 178, 109, 23);
		panel.add(ckAzeite);
		
		JCheckBox ckFarinha = new JCheckBox("Farinha de Trigo(3.60)");
		ckFarinha.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckFarinha.setBounds(6, 214, 151, 23);
		panel.add(ckFarinha);
		
		JCheckBox ckQueijo = new JCheckBox("Queijo(9.50)");
		ckQueijo.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckQueijo.setBounds(215, 8, 109, 23);
		panel.add(ckQueijo);
		
		JCheckBox ckSal = new JCheckBox("Sal(1.90)");
		ckSal.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckSal.setBounds(215, 40, 109, 23);
		panel.add(ckSal);
		
		JCheckBox ckGelatina = new JCheckBox("Gelatina(0.90)");
		ckGelatina.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckGelatina.setBounds(215, 74, 109, 23);
		panel.add(ckGelatina);
		
		JCheckBox ckBatata = new JCheckBox("Batata(5.60)");
		ckBatata.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckBatata.setBounds(215, 110, 109, 23);
		panel.add(ckBatata);
		
		JCheckBox ckMaionese = new JCheckBox("Maionese(6.30)");
		ckMaionese.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckMaionese.setBounds(215, 143, 123, 23);
		panel.add(ckMaionese);
		
		JCheckBox ckBiscoito = new JCheckBox("Biscoito(3.60)");
		ckBiscoito.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckBiscoito.setBounds(215, 178, 109, 23);
		panel.add(ckBiscoito);
		
		JCheckBox ckTempero = new JCheckBox("Tempero(1.50)");
		ckTempero.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckTempero.setBounds(215, 214, 123, 23);
		panel.add(ckTempero);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaComprar.this.dispose();
			}
		});
		btnFechar.setBounds(20, 312, 89, 23);
		contentPane.add(btnFechar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblTotal.setText("R$ 0.00");
				ckArroz.setSelected(false);
				ckFeijao.setSelected(false);
				ckAcucar.setSelected(false);
				ckCafe.setSelected(false);
				ckCereal.setSelected(false);
				ckAzeite.setSelected(false);
				ckFarinha.setSelected(false);
				ckQueijo.setSelected(false);
				ckSal.setSelected(false);
				ckGelatina.setSelected(false);
				ckBatata.setSelected(false);
				ckMaionese.setSelected(false);
				ckBiscoito.setSelected(false);
				ckTempero.setSelected(false);
				
			}
		});
		btnLimpar.setBounds(147, 312, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double total = 0;
				
				if(ckArroz.isSelected());{
					total += 18.50;
					}
				if(ckFeijao.isSelected());{
					total += 8.90;
				}
				if(ckAcucar.isSelected());{
					total += 2.40;
				}
				if(ckCafe.isSelected());{
					total += 9.80;
				}
				if(ckCereal.isSelected());{
					total += 13.90;
				}
				if(ckAzeite.isSelected());{
					total += 12.80;
				}
				if(ckFarinha.isSelected());{
					total += 3.60;
				}
				if(ckQueijo.isSelected());{
					total += 9.50;
				}
				if(ckSal.isSelected());{
					total += 1.90;
				}
				if(ckGelatina.isSelected());{
					total += 0.90;
				}
				if(ckBatata.isSelected());{
					total += 5.60;
				}
				if(ckMaionese.isSelected());{
					total += 6.30;
				}
				if(ckBiscoito.isSelected());{
					total += 3.60;
				}
				if(ckTempero.isSelected());{
					total += 1.50;
				}
				lblTotal.setText(String.format("R$ %.2f", total));
			}
			
			
			
		});
		btnCalcular.setBounds(275, 312, 89, 23);
		contentPane.add(btnCalcular);
	}
}
