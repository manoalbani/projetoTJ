import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


public class PanelListarVeiculos extends panelPrincipal {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelListarVeiculos() {
		
		JPanel panel = new JPanel();
		add(panel, "name_519137543173476");
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnCadastrar = new JButton("cadastrar");
		panel_1.add(btnCadastrar);
		
		JButton btnEditar = new JButton("editar");
		panel_1.add(btnEditar);
		
		JButton btnVoltar = new JButton("voltar");
		panel_1.add(btnVoltar);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "situa\u00E7\u00E3o", "placa", "modelo", "unidade"
			}
		));
		scrollPane.setViewportView(table);

	}

}
