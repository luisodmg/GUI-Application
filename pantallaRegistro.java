package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;

public class pantallaRegistro {

	private JFrame frame;
	private Pantallas principal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pantallaRegistro window = new pantallaRegistro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pantallaRegistro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 588, 678);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Registrar Cliente");
		lblTitulo.setForeground(Color.ORANGE);
		lblTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 69));
		lblTitulo.setBounds(50, 11, 471, 80);
		frame.getContentPane().add(lblTitulo);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnRegresar.setBounds(10, 561, 257, 32);
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				principal = new Pantallas();
				principal.setMainVisibility(true);
			}
		});
		frame.getContentPane().add(btnRegresar);
		
		JTextPane textPaneNombre = new JTextPane();
		textPaneNombre.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textPaneNombre.setBounds(179, 161, 201, 20);
		frame.getContentPane().add(textPaneNombre);
		
		JTextPane textPaneAP = new JTextPane();
		textPaneAP.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textPaneAP.setBounds(179, 225, 201, 20);
		frame.getContentPane().add(textPaneAP);
		
		JTextPane textPaneAM = new JTextPane();
		textPaneAM.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textPaneAM.setBounds(179, 289, 201, 20);
		frame.getContentPane().add(textPaneAM);
		
		JTextPane textPaneMail = new JTextPane();
		textPaneMail.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textPaneMail.setBounds(179, 353, 201, 20);
		frame.getContentPane().add(textPaneMail);
		
		JTextPane textPaneCode = new JTextPane();
		textPaneCode.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textPaneCode.setBounds(179, 417, 201, 20);
		frame.getContentPane().add(textPaneCode);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNombre.setBounds(43, 161, 93, 20);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblAP = new JLabel("Apellido Paterno:");
		lblAP.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblAP.setBounds(43, 225, 109, 18);
		frame.getContentPane().add(lblAP);
		
		JLabel lblAM = new JLabel("Apellido Materno:");
		lblAM.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblAM.setBounds(43, 289, 113, 18);
		frame.getContentPane().add(lblAM);
		
		JLabel lblMail = new JLabel("E-Mail:");
		lblMail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMail.setBounds(43, 353, 45, 18);
		frame.getContentPane().add(lblMail);
		
		JLabel lblNewLabel = new JLabel("Codigo:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(43, 417, 49, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Tiene acceso a la pagina web?");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(357, 108, 211, 27);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBounds(311, 561, 257, 32);
		frame.getContentPane().add(btnNewButton);
	}
	
	public void setRVisibility(boolean visible) {
		frame.setVisible(visible);
	}
}
