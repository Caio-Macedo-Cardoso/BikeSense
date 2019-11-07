import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import controllers.UsuarioController;
import models.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;

public class Cadastro {

	private JFrame frmCadastro;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JPasswordField txtpasswordField;
	private JPasswordField txtpasswordField_1;
	UsuarioController controller = new UsuarioController();

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro(UsuarioController controller);
					window.frmCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	/**
	 * Create the application.
	 */
	public Cadastro(UsuarioController controller) {
		this.controller = controller;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastro = new JFrame();
		frmCadastro.setTitle("Cadastro");
		frmCadastro.setBounds(100, 100, 450, 300);
		frmCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 0));
		frmCadastro.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setForeground(Color.LIGHT_GRAY);
		lblCadastro.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblCadastro);
		
		JPanel panel_1 = new JPanel();
		frmCadastro.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(109, 26, 32, 15);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(109, 52, 46, 14);
		panel_1.add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSenha.setBounds(109, 77, 46, 14);
		panel_1.add(lblSenha);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
		lblConfirmarSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblConfirmarSenha.setBounds(109, 102, 93, 14);
		panel_1.add(lblConfirmarSenha);
		
		txtNome = new JTextField();
		txtNome.setBounds(202, 24, 175, 20);
		panel_1.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(202, 49, 175, 20);
		panel_1.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.setForeground(Color.LIGHT_GRAY);
		btnCriar.setBackground(new Color(51, 51, 0));
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCriar.setBounds(170, 162, 104, 36);
		panel_1.add(btnCriar);
		
		txtpasswordField = new JPasswordField();
		txtpasswordField.setBounds(202, 75, 175, 20);
		panel_1.add(txtpasswordField);
		
		txtpasswordField_1 = new JPasswordField();
		txtpasswordField_1.setBounds(202, 100, 175, 20);
		panel_1.add(txtpasswordField_1);
		
		
		
		
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					System.out.println(txtpasswordField.getText() + " = " + txtpasswordField_1.getText());
					
					if( !txtpasswordField.getText().equals(txtpasswordField_1.getText()) ) {
						throw new Exception("Senhas diferentes.");
					}
					
					Usuario usuario = new Usuario(txtpasswordField_1.getText(), txtEmail.getText(), txtNome.getText());
					
					
					
					controller.cadastraUsuario(usuario);
					
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.");
					
					Login t = new Login();
					t.recebeCadastro(controller);
					t.mostraTela();
					frmCadastro.dispose();
			
				}catch(Exception exception){
					
					JOptionPane.showMessageDialog(null, exception.getMessage());
					
				}
				
			}
		});
		
		
		
	}

	public void mostraTela2() {
		frmCadastro.setVisible(true);
		frmCadastro.setLocation(600, 100);
	}
}
