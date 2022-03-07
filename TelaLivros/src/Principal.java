import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import app.Conexao;
import app.Livros;
import app.LivrosDAO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JTextField txtAno;
	private JTextField txtPaginas;
	private JTable table;
	private JTable table_1;
	
	private DefaultTableModel modelo = new DefaultTableModel();
	private LivrosDAO livrosDAO = new LivrosDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Tela Livros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 257);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("TextField.shadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Titulo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(22, 33, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtTitulo = new JTextField();
		txtTitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTitulo.setBounds(67, 30, 127, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAutor.setBounds(22, 61, 46, 14);
		contentPane.add(lblAutor);
		
		txtAutor = new JTextField();
		txtAutor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAutor.setColumns(10);
		txtAutor.setBounds(67, 58, 127, 20);
		contentPane.add(txtAutor);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAno.setBounds(22, 89, 46, 14);
		contentPane.add(lblAno);
		
		txtAno = new JTextField();
		txtAno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAno.setColumns(10);
		txtAno.setBounds(67, 86, 127, 20);
		contentPane.add(txtAno);
		
		JLabel lblPaginas = new JLabel("Paginas");
		lblPaginas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPaginas.setBounds(22, 117, 53, 17);
		contentPane.add(lblPaginas);
		
		txtPaginas = new JTextField();
		txtPaginas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPaginas.setColumns(10);
		txtPaginas.setBounds(85, 114, 109, 20);
		contentPane.add(txtPaginas);
		
		//modelo de dados
		DefaultTableModel modelo = new DefaultTableModel();
		
		//add colunas
		modelo.addColumn("ID");
		modelo.addColumn("Tituto");
		modelo.addColumn("Autor");
		modelo.addColumn("Ano");
		modelo.addColumn("Paginas");
		
		carregarTodosLivros();
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(322, 11, 246, 155);
		contentPane.add(scrollPane);
		
		table = new JTable(modelo);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int indice = table.getSelectedRow();
				
				txtTitulo.setText(modelo.getValueAt(indice, 0).toString());
				txtAutor.setText(modelo.getValueAt(indice, 1).toString());
				txtAno.setText(modelo.getValueAt(indice, 2).toString());
				txtPaginas.setText(modelo.getValueAt(indice, 3).toString());
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Livros livros = new Livros();
				livros.setTitulo(txtTitulo.getText());
				livros.setAutor(txtAutor.getText());
				livros.setAno(Integer.parseInt(txtAno.getText()));
				livros.setPaginas(Integer.parseInt(txtPaginas.getText()));
				
				livrosDAO.inserir(livros);
				
				carregarTodosLivros();
				limparCampos();
				
				
				
				
				modelo.addRow(new Object[] {
						
						txtTitulo.getText(),
						txtAutor.getText(),
						txtAno.getText(),
						txtPaginas.getText(),
						
				});
				//limpar dados
				txtTitulo.setText("");
				txtAutor.setText("");
				txtAno.setText("");
				txtPaginas.setText("");
				
				
			}
			
		});
		btnSalvar.setBackground(UIManager.getColor("Button.light"));
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalvar.setBounds(22, 168, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(table.getSelectedRow() > -1) {
				Livros livros = new Livros();
				livros.setId((int)modelo.getValueAt(table.getSelectedRow(), 0));
				livros.setTitulo(txtTitulo.getText());
				livros.setAutor(txtAutor.getText());
				livros.setAno(Integer.parseInt(txtAno.getText()));
				livros.setPaginas(Integer.parseInt(txtPaginas.getText()));
				
				livrosDAO.alterar(livros);
				carregarTodosLivros();
				limparCampos();
				
				
			}
			}
		
		});
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAlterar.setBackground(UIManager.getColor("Button.light"));
		btnAlterar.setBounds(122, 168, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(table.getSelectedRow() > -1) {
					int id = (int) modelo.getValueAt(table.getSelectedRow(),0);
					livrosDAO.excluir(id);
					carregarTodosLivros();
					limparCampos();
					
				}
				
				
			}
		});
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExcluir.setBackground(UIManager.getColor("Button.light"));
		btnExcluir.setBounds(222, 169, 89, 23);
		contentPane.add(btnExcluir);
		
		Conexao.conectar();		
		}
	
	private void carregarTodosLivros() {
		modelo.setRowCount(0);
		
		for(Livros livros : livrosDAO.selicionarTodos()) {
			
			modelo.addRow(new Object[] {
			livros.getId(),
			livros.getTitulo(),
			livros.getAutor(),
			livros.getAno(),
			livros.getPaginas()
					
					
			});
			
		}
	}
	private void limparCampos() {
		txtTitulo.setText("");
		txtAutor.setText("");
		txtAno.setText("");
		txtPaginas.setText("");
	}
}
