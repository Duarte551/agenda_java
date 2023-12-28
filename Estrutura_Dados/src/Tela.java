import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.RowFilter;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Tela {

	private JFrame frmAgenda;
	private JTable table;
	private JTextField textField_2;
	private JTable table_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frmAgenda.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAgenda = new JFrame();
		frmAgenda.setTitle("Agenda");
		frmAgenda.setBounds(100, 100, 611, 482);
		frmAgenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Adicionar Contato", null, panel, null);
		
		textField_3 = new JTextField();
		textField_3.setBounds(60, 80, 204, 20);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(290, 80, 119, 20);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(60, 143, 204, 20);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(290, 143, 169, 20);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(60, 206, 204, 20);
		textField_7.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Limpar");
		btnNewButton_2.setBounds(314, 357, 95, 23);
		btnNewButton_2.setBackground(new Color(204, 153, 51));
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		        limpar();
			}
				private void limpar() {
					 textField_3.setText("");
					 textField_4.setText("");
					 textField_5.setText("");
					 textField_6.setText("");
					 textField_7.setText("");
					
				}
		});
		
		JLabel lblNewLabel_3 = new JLabel("E-mail");
		lblNewLabel_3.setBounds(60, 181, 46, 14);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone");
		lblNewLabel_4.setBounds(60, 118, 100, 14);
		
		JLabel lblNewLabel_5 = new JLabel("Celular");
		lblNewLabel_5.setBounds(290, 118, 46, 14);
		
		JLabel lblNewLabel_6 = new JLabel("Nome");
		lblNewLabel_6.setBounds(60, 55, 46, 14);
		
		JLabel lblNewLabel_7 = new JLabel("Data de nascimento");
		lblNewLabel_7.setBounds(290, 55, 119, 14);
		panel.setLayout(null);
		panel.add(lblNewLabel_3);
		panel.add(textField_7);
		panel.add(lblNewLabel_4);
		panel.add(lblNewLabel_6);
		panel.add(textField_5);
		panel.add(textField_3);
		panel.add(textField_6);
		panel.add(lblNewLabel_7);
		panel.add(lblNewLabel_5);
		panel.add(textField_4);
		panel.add(btnNewButton_2);
		//panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tabbedPane.addTab("Listagem", null, panel_1, null);
		tabbedPane.setEnabledAt(1, true);
		
		JLabel lblNewLabel = new JLabel("Pesquisar:");
		lblNewLabel.setBounds(12, 13, 76, 15);
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 11));
		
		textField_2 = new JTextField();
		textField_2.setBounds(12, 34, 477, 21);
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setFont(new Font("Calibri", Font.PLAIN, 11));
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
	
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setBounds(95, 61, 76, 23);
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnNewButton_1.setBackground(new Color(204, 153, 51));
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		        limpar_busca();
			}
				private void limpar_busca() {
					 textField_2.setText("");
					
				}
		});
		
		table = new JTable();
		panel_1.setLayout(null);
		panel_1.add(lblNewLabel);
		panel_1.add(btnNewButton);
		panel_1.add(btnNewButton_1);
		panel_1.add(textField_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 120, 532, 261);
		panel_1.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setFont(new Font("Calibri", Font.PLAIN, 11));
		Object[] columns = {"ID", "Nome", "Celular", "Email", "Data de Nascimento"};
		DefaultTableModel model = new DefaultTableModel();
		
		model.setColumnIdentifiers(columns);
		table_1.setModel(model);
		
		table_1.setAutoCreateRowSorter(true);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setEnabled(false);
		scrollPane.setRowHeaderView(scrollBar);
		

		table_1.getColumnModel().getColumn(0).setPreferredWidth(33);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(97);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(115);
		
		AgendaDeContatos agenda = new AgendaDeContatos();
		
		Object[] row = new Object[6];
		
		JButton btnNewButton_3 = new JButton("Salvar Contato");
		btnNewButton_3.setBounds(427, 357, 124, 23);
		btnNewButton_3.setBackground(new Color(0, 139, 139));
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				Random r = new Random();
				
				int minId = 1;
				int maxId = 100;
				
				int id = r.nextInt(maxId - minId) + minId;
				row[0] = id;
				row[1] = textField_3.getText();
				row[2] = textField_5.getText();
				row[3] = textField_7.getText();
				row[4] = textField_4.getText();
				JButton delete = new JButton("Delete");
				delete.setBounds(427, 357, 124, 23);
				delete.setBackground(new Color(0, 139, 139));
				delete.setFont(new Font("Calibri", Font.PLAIN, 12));
				
				
				Contato contato1 = new Contato((int)row[0], (String)row[1], (String)row[2], (String)row[3], (String)row[4], textField_6.getText());
				agenda.adicionarContato(contato1);
				agenda.exibirListaDeContatos();
				
				model.addRow(row);
			}
		});
		
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("João Victor Duarte - 2222816");
		lblNewLabel_1.setBounds(98, 265, 166, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_8 = new JLabel("Lunna Barboza - 2222791");
		lblNewLabel_8.setBounds(329, 265, 145, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Diego Santiago - 2222779");
		lblNewLabel_9.setBounds(98, 290, 166, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Antônio Lucas - 2222842");
		lblNewLabel_10.setBounds(329, 290, 145, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_2 = new JLabel("Criadores");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(233, 240, 86, 14);
		panel.add(lblNewLabel_2);
		
		
		JButton btnNewButton_4 = new JButton("Excluir");
		btnNewButton_4.setBackground(Color.RED);
		btnNewButton_4.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnNewButton_4.setBounds(450, 86, 89, 23);
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int i = table_1.getSelectedRow();
				if(i>=0) {
					model.removeRow(i);
					agenda.excluirContato((String)row[1]);
				} else {
					JOptionPane.showMessageDialog(scrollPane, "Selecione um contato para excluir");
				}
				
			}
			
		});
		
		panel_1.add(btnNewButton_4);
	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel ob = (DefaultTableModel)table_1.getModel();
				TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
				table_1.setRowSorter(obj);
				obj.setRowFilter(RowFilter.regexFilter(textField_2.getText()));
				agenda.pesquisarContato((String)row[1]);
				
			}
		});
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		btnNewButton.setBounds(12, 61, 76, 23);
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnNewButton.setBackground(new Color(0, 139, 139));
		
		GroupLayout groupLayout = new GroupLayout(frmAgenda.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 571, GroupLayout.PREFERRED_SIZE)
					.addGap(125))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(9)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 432, Short.MAX_VALUE)
					.addGap(2))
		);
		frmAgenda.getContentPane().setLayout(groupLayout);
	}
}
