import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;


public class PanelInicial extends panelPrincipal {

	/**
	 * Create the panel.
	 */
	public PanelInicial() {
		
		JLabel lblControleDeFrota = new JLabel("Controle de Frota");
		lblControleDeFrota.setHorizontalAlignment(SwingConstants.CENTER);
		lblControleDeFrota.setFont(new Font("Tahoma", Font.PLAIN, 37));
		add(lblControleDeFrota, "name_518029423763445");

	}

}
