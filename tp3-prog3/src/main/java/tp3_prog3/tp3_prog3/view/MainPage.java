package tp3_prog3.tp3_prog3.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import tp3_prog3.tp3_prog3.service.ApplicationService;

public class MainPage {

	private JFrame frmPaginaPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationService.getInstance().InitDb();
					MainPage window = new MainPage();
					window.frmPaginaPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPaginaPrincipal = new JFrame();
		frmPaginaPrincipal.setResizable(false);
		frmPaginaPrincipal.setTitle("Pagina Principal");
		frmPaginaPrincipal.setBounds(100, 100, 450, 300);
		frmPaginaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPaginaPrincipal.getContentPane().setLayout(null);
		
		JButton btnCargaJugador = new JButton("Carga Jugador");
		btnCargaJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new JugadorPage().setVisible(true);
			}
		});
		btnCargaJugador.setBounds(81, 106, 123, 79);
		frmPaginaPrincipal.getContentPane().add(btnCargaJugador);
		
		JButton btnCrearEquipos = new JButton("Calcular Equipos");
		btnCrearEquipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EquiposPage().setVisible(true);
			}
		});
		btnCrearEquipos.setBounds(229, 106, 123, 79);
		frmPaginaPrincipal.getContentPane().add(btnCrearEquipos);
	}
}
