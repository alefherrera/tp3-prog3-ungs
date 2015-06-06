package tp3_prog3.tp3_prog3.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import tp3_prog3.tp3_prog3.model.Jugador;
import tp3_prog3.tp3_prog3.model.Pais;
import tp3_prog3.tp3_prog3.model.Posicion;
import tp3_prog3.tp3_prog3.persistencia.Persistencia;

public class JugadorPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JComboBox<Pais> cmbPais;
	private JComboBox<Posicion> cmbPosicion;
	private JSpinner txtAmarillas;
	private JSpinner txtRojas;
	private JSpinner txtPuntaje;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JugadorPage frame = new JugadorPage();
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
	public JugadorPage() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 469, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel2;
		try {
			panel2 = new JImagePanel("resources/pitch.jpg");
			panel2.setBackground(new Color(176, 196, 222));
			panel2.setBounds(0, 0, 463, 53);
			contentPane.add(panel2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null,
				null));
		panel.setBounds(0, 300, 463, 31);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		lblStatus = new JLabel("");
		panel.add(lblStatus);

		JLabel label = new JLabel("Nombre");
		label.setBounds(10, 64, 124, 20);
		contentPane.add(label);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(144, 64, 309, 20);
		contentPane.add(txtNombre);

		JLabel lblPais = new JLabel("Pais");
		lblPais.setBounds(10, 95, 124, 20);
		contentPane.add(lblPais);

		cmbPais = new JComboBox<Pais>();
		cmbPais.setModel(new DefaultComboBoxModel<Pais>(Pais.values()));
		cmbPais.setSelectedIndex(0);
		cmbPais.setBounds(144, 95, 162, 20);
		contentPane.add(cmbPais);

		cmbPosicion = new JComboBox<Posicion>();
		cmbPosicion.setModel(new DefaultComboBoxModel<Posicion>(Posicion
				.values()));
		cmbPosicion.setSelectedIndex(0);
		cmbPosicion.setBounds(144, 126, 162, 20);
		contentPane.add(cmbPosicion);

		JLabel lblPosicion = new JLabel("Posicion");
		lblPosicion.setBounds(10, 126, 124, 20);
		contentPane.add(lblPosicion);

		JLabel lblTAmarillas = new JLabel("T. Amarillas");
		lblTAmarillas.setBounds(10, 157, 124, 20);
		contentPane.add(lblTAmarillas);

		JLabel lblTRojas = new JLabel("T. Rojas");
		lblTRojas.setBounds(10, 188, 124, 20);
		contentPane.add(lblTRojas);

		JLabel lblPuntaje = new JLabel("Puntaje");
		lblPuntaje.setBounds(10, 219, 124, 20);
		contentPane.add(lblPuntaje);

		txtAmarillas = new JSpinner();
		txtAmarillas.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		txtAmarillas.setBounds(144, 157, 41, 20);
		contentPane.add(txtAmarillas);

		txtRojas = new JSpinner();
		txtRojas.setBounds(144, 188, 41, 20);
		contentPane.add(txtRojas);

		txtPuntaje = new JSpinner();
		txtPuntaje.setModel(new SpinnerNumberModel(new Float(1), new Float(0),
				new Float(10), new Float(1)));
		txtPuntaje.setBounds(144, 219, 41, 20);
		contentPane.add(txtPuntaje);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (!isFormValid())
					return;

				Jugador nuevo = new Jugador();
				nuevo.setNombre(txtNombre.getText());
				nuevo.setSeleccion((Pais) cmbPais.getSelectedItem());
				nuevo.setPosicion((Posicion) cmbPosicion.getSelectedItem());
				nuevo.setTarjetasAmarillas((Integer) txtAmarillas.getValue());
				nuevo.setTarjetasRojas((Integer) txtRojas.getValue());

				try {
					Persistencia.getInstance().insert(nuevo);
				} catch (SQLException e) {
					setStatusLabel("Ocurrio un problema guardando el jugador");
					e.printStackTrace();
				}

			}
		});
		btnGuardar.setBounds(364, 266, 89, 23);
		contentPane.add(btnGuardar);
	}

	private boolean isFormValid() {
		boolean resul = true;

		if (txtNombre.getText().isEmpty()) {
			lblStatus.setText("Nombre no puede estar vacio.");
			resul = false;
		}

		return resul;
	}

	private void setStatusLabel(String msg) {
		lblStatus.setText(msg);
	}

}
