package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantallas {

	private JFrame frame;
	private pantallaRegistro registerWindow;
	private pantallaBuscar searchWindow;
	private pantallaCodigo codeWindow;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantallas window = new Pantallas();
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
	public Pantallas() {
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
		
		JLabel lblTitulo = new JLabel("Trilogia Fibrera");
		lblTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 69));
		lblTitulo.setBounds(64, 11, 460, 84);
		frame.getContentPane().add(lblTitulo);
		
		JButton btnARegistro = new JButton("Registrar Cliente");
		btnARegistro.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		btnARegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				registerWindow = new pantallaRegistro();
				registerWindow.setRVisibility(true);
			}
		});
		btnARegistro.setBounds(145, 175, 276, 90);
		frame.getContentPane().add(btnARegistro);
		
		JButton btnABuscar = new JButton("Buscar Cliente");
		btnABuscar.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		btnABuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				searchWindow = new pantallaBuscar();
				searchWindow.setBVisibility(true);
			}
		});
		btnABuscar.setBounds(145, 316, 276, 90);
		frame.getContentPane().add(btnABuscar);
		
		JButton btnACodigos = new JButton("Generar Codigo");
		btnACodigos.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		btnACodigos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				codeWindow = new pantallaCodigo();
				codeWindow.setCVisibility(true);
			}
		});
		btnACodigos.setBounds(145, 445, 276, 90);
		frame.getContentPane().add(btnACodigos);
	}
	
	public void setMainVisibility(boolean visibility) {
		frame.setVisible(visibility);
	}
}
