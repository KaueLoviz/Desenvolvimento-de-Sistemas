import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JList;

public class TelaLista extends JFrame {

	private JPanel contentPane;
	private JTextField txtNovaTarefa;
	
	private DefaultListModel listModelAFazer = new DefaultListModel();
    private DefaultListModel listModelFeito = new DefaultListModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLista frame = new TelaLista();
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
	public TelaLista() {
		setTitle("TelaLista");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 5, 390, 724);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelNovaTarefa = new JPanel();
		panelNovaTarefa.setForeground(UIManager.getColor("List.selectionBackground"));
		panelNovaTarefa.setBorder(new TitledBorder(null, "Nova Tarefa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelNovaTarefa.setBounds(10, 220, 354, 155);
		contentPane.add(panelNovaTarefa);
		panelNovaTarefa.setLayout(null);
		
		JLabel lblNovaTarefa = new JLabel("Digite a Tarefa");
		lblNovaTarefa.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNovaTarefa.setBounds(10, 11, 113, 20);
		panelNovaTarefa.add(lblNovaTarefa);
		
		txtNovaTarefa = new JTextField();
		txtNovaTarefa.setBounds(10, 30, 322, 20);
		panelNovaTarefa.add(txtNovaTarefa);
		txtNovaTarefa.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Selecione a categoria");
		lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCategoria.setBounds(10, 61, 150, 14);
		panelNovaTarefa.add(lblCategoria);
		
		JComboBox cbxCategoria = new JComboBox();
		cbxCategoria.setBounds(10, 81, 322, 20);
		
		cbxCategoria.addItem("Escola");
		cbxCategoria.addItem("Trabalho");
		cbxCategoria.addItem("Outros");
		
		
		
		panelNovaTarefa.add(cbxCategoria);
		
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNovaTarefa.setText("");
				cbxCategoria.setSelectedItem(null);
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLimpar.setForeground(Color.BLACK);
		btnLimpar.setBackground(new Color(0, 204, 204));
		btnLimpar.setBounds(73, 112, 100, 33);
		panelNovaTarefa.add(btnLimpar);
		
		
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(0, 204, 204));
		label.setForeground(new Color(0, 204, 204));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(TelaLista.class.getResource("/imagem/tipos-de-listas.png")));
		label.setBounds(10, 11, 354, 198);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "A Fazer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 386, 150, 262);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JList listAFazer = new JList();
		listAFazer.setBounds(10, 14, 130, 240);
		panel.add(listAFazer);
		listAFazer.setModel(listModelAFazer);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Feito", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(217, 386, 150, 262);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JList listFeito = new JList();
		listFeito.setBounds(10, 14, 130, 237);
		panel_2.add(listFeito);
		listFeito.setModel(listModelFeito);
		
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tarefa = txtNovaTarefa.getText() + " | "  + cbxCategoria.getSelectedItem().toString();
				
				listModelAFazer.addElement(tarefa);
				
				txtNovaTarefa.requestFocus();
			}
		});
		btnAdicionar.setForeground(Color.BLACK);
		btnAdicionar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAdicionar.setBackground(new Color(0, 204, 204));
		btnAdicionar.setBounds(192, 112, 100, 33);
		panelNovaTarefa.add(btnAdicionar);
		
		JButton btnConcluir = new JButton(">>");
		btnConcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModelFeito.addElement(listAFazer.getSelectedValue());
				
			 int posicao = listAFazer.getSelectedIndex();
			 
			 if(posicao != -1 ) {
				 listModelAFazer.remove(posicao);
				 
			 }
			}
		});
		btnConcluir.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnConcluir.setBackground(new Color(0, 204, 204));
		btnConcluir.setBounds(164, 484, 49, 31);
		contentPane.add(btnConcluir);
		
		JButton btnVoltar = new JButton("<<");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModelAFazer.addElement(listFeito.getSelectedValue());
				
				 int posicao = listFeito.getSelectedIndex();
				 
				 if(posicao != -1 ) {
					 listModelFeito.remove(posicao);
					 
				 }
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnVoltar.setBackground(new Color(0, 204, 204));
		btnVoltar.setBounds(164, 526, 49, 31);
		contentPane.add(btnVoltar);
		
		JButton btnLimparAfazer = new JButton("Limpar");
		btnLimparAfazer.setBackground(new Color(0, 204, 204));
		btnLimparAfazer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModelAFazer.clear();
			}
		});
		btnLimparAfazer.setBounds(36, 659, 89, 23);
		contentPane.add(btnLimparAfazer);
		
		JButton btnLimparFeito = new JButton("Limpar");
		btnLimparFeito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModelFeito.clear();
			}
		});
		btnLimparFeito.setBackground(new Color(0, 204, 204));
		btnLimparFeito.setBounds(247, 659, 89, 23);
		contentPane.add(btnLimparFeito);
	}
}
