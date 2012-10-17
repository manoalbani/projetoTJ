import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;


public class telaPrincipal extends JFrame {

	private JPanel contentPane;
	private PanelInicial panelInicial;
	private PanelListarVeiculos panelListarVeiculos;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public telaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAbastecimento = new JMenu("abastecimento");
		mnAbastecimento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		menuBar.add(mnAbastecimento);
		
		JMenu mnVeiculos = new JMenu("Veiculos");
		menuBar.add(mnVeiculos);
		
		JMenu mnVeiculo = new JMenu("autom\u00F3veis");
		mnVeiculos.add(mnVeiculo);
		
		JMenu mnCadastrar = new JMenu("cadastrar");
		mnVeiculo.add(mnCadastrar);
		
		JMenu mnListar = new JMenu("listar");
		mnListar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			panelListarVeiculos = new PanelListarVeiculos();
			panelInicial.removeAll();
			panelInicial.add(panelListarVeiculos);
			panelInicial.validate();
			}
		});
		mnVeiculo.add(mnListar);
		
		JRadioButtonMenuItem rdbtnmntmOi = new JRadioButtonMenuItem("oi");
		mnListar.add(rdbtnmntmOi);
		
		JMenu mnModelo = new JMenu("modelos");
		mnVeiculos.add(mnModelo);
		
		JMenu menu = new JMenu("cadastrar");
		mnModelo.add(menu);
		
		JMenu menu_1 = new JMenu("listar");
		mnModelo.add(menu_1);
		
		JMenu mnMarcas = new JMenu("marcas");
		mnVeiculos.add(mnMarcas);
		
		JMenu menu_2 = new JMenu("cadastrar");
		mnMarcas.add(menu_2);
		
		JMenu menu_3 = new JMenu("listar");
		mnMarcas.add(menu_3);
		
		JMenu mnUnidade = new JMenu("unidades");
		menuBar.add(mnUnidade);
		
		JMenu mnComarcas = new JMenu("comarcas");
		mnUnidade.add(mnComarcas);
		
		JMenu menu_4 = new JMenu("cadastrar");
		mnComarcas.add(menu_4);
		
		JMenu menu_5 = new JMenu("listar");
		mnComarcas.add(menu_5);
		
		JMenu mnServio = new JMenu("servi\u00E7os");
		menuBar.add(mnServio);
		
		JMenu mnTipos = new JMenu("tipos");
		mnServio.add(mnTipos);
		
		JMenu menu_6 = new JMenu("cadastrar");
		mnTipos.add(menu_6);
		
		JMenu menu_7 = new JMenu("listar");
		mnTipos.add(menu_7);
		
		JMenu mnFornecedores = new JMenu("fornecedores");
		mnServio.add(mnFornecedores);
		
		JMenu menu_8 = new JMenu("cadastrar");
		mnFornecedores.add(menu_8);
		
		JMenu menu_9 = new JMenu("listar");
		mnFornecedores.add(menu_9);
		
		JMenu mnUsurio = new JMenu("usu\u00E1rios");
		menuBar.add(mnUsurio);
		
		JMenu mnUsurios = new JMenu("usu\u00E1rios");
		mnUsurio.add(mnUsurios);
		
		JMenu menu_10 = new JMenu("cadastrar");
		mnUsurios.add(menu_10);
		
		JMenu menu_11 = new JMenu("listar");
		mnUsurios.add(menu_11);
		
		JMenu mnMotoristas = new JMenu("motoristas");
		mnUsurio.add(mnMotoristas);
		
		JMenu menu_12 = new JMenu("cadastrar");
		mnMotoristas.add(menu_12);
		
		JMenu menu_13 = new JMenu("listar");
		mnMotoristas.add(menu_13);
		panelInicial = new PanelInicial();
		setContentPane(panelInicial);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaPrincipal frame = new telaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
