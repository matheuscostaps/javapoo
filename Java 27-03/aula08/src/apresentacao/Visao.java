package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Visao extends JFrame{
	
	// Propiedades da classe 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar barraDeMenu = new JMenuBar();
	private JMenu mnuArquivo = new JMenu("Arquivo");
	private JMenuItem mniNovo = new JMenuItem("Novo");
	private JMenuItem mniAbrir = new JMenuItem("Abrir");
	private JMenuItem mniSair = new JMenuItem("Sair");
	private JMenu mnuEditar = new JMenu ("Editar");
	private JMenuItem mniCopiar = new JMenuItem("Copiar");
	private JMenuItem mniColar = new JMenuItem("Colar");
	
	private JButton btnGravar = new JButton("Gravar");
	private JLabel lblUsuario = new JLabel("Usuario");
	private JTextField txtUsuario = new JTextField();
	
	private JLabel lblDescricao = new JLabel("Descricao");
	private JTextArea txtDescricao = new JTextArea();
	private JScrollPane jspDescricao = new JScrollPane(txtDescricao);
	
	private JLabel lblOpcao = new JLabel("Opção");
	private JComboBox<String> cboOpcao = new JComboBox<String>();
	
	private JCheckBox chkSalvarSenha = new JCheckBox("Salvar Senha");
	
	private JLabel lblSexo = new JLabel("Sexo");
	private JRadioButton optMasculino = new JRadioButton("Masculino");
	private JRadioButton optFeminino = new JRadioButton("Feminino");
	private JRadioButton optNaoBinario = new JRadioButton("Não Binario");
	private ButtonGroup btgSexo = new ButtonGroup();
	
	private JLabel lblBancoDeDados = new JLabel("Banco de Dados");
	private JList<String> lstBancoDeDados = new JList<String>();
	private JScrollPane jspBancoDeDados = new JScrollPane(lstBancoDeDados);
	private DefaultListModel<String> dlmBancoDeDados = new DefaultListModel<String>();
	
	// Metodo principal de execução da classe
	
	public static void main (String[] args) {
		new Visao().setVisible(true);
	
	}
	
	// Metodo construtor da classe 
	
	public Visao () {
		// Configuração da Janela 
		setTitle("Janela de exemplificação de uso de controloes gráficos");
		setSize(1024 , 768);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// Confugração da barra de menu
		
		setJMenuBar(barraDeMenu);
		barraDeMenu.add(mnuArquivo);
		barraDeMenu.add(mnuEditar);
		mnuArquivo.add(mniNovo);
		mnuArquivo.add(mniAbrir);
		mnuArquivo.addSeparator();
		mnuArquivo.add(mniSair);
		mnuEditar.add(mniCopiar);
		mnuEditar.add(mniColar);
	
	
	// Configuração das ações 
	mniSair.addActionListener(new ControladorSair());
	mniCopiar.addActionListener(new ControladorCopiar());
	
	// Configuração de botão
	btnGravar.setBounds(462, 660, 100, 30);
	add(btnGravar);
	
	// Configuração de caixa de texto
	lblUsuario.setBounds(20, 20, 200, 20);
	add(lblUsuario);
	txtUsuario.setBounds(20, 40, 150, 20);
	add(txtUsuario);
	
	// Configuração da área de texto 
	lblDescricao.setBounds(70, 20, 200, 20);
	add(lblDescricao);
	jspDescricao.setBounds(20, 90, 900, 200);
	add(jspDescricao);
	txtDescricao.setLineWrap(true);
	
	// Configuração da caide de opções
	lblOpcao.setBounds(20, 300, 200, 20);
	add(lblOpcao);
	cboOpcao.setBounds(20, 320, 200, 20);
	add(cboOpcao);
	cboOpcao.addItem("-- Selecione --");
	cboOpcao.addItem("Opção 1");
	cboOpcao.addItem("Opção 2");
	cboOpcao.addItem("Opção 3");
	cboOpcao.addItem("Opção 4");
	cboOpcao.addItem("Opção 5");
	
	// Configuração da caixa de seleção
	chkSalvarSenha.setBounds(20, 350, 200, 20);
	add(chkSalvarSenha);
	
	// Configuração do Conjunto de Opções Alternativas
	lblSexo.setBounds(20, 380, 200, 20);
	add(lblSexo);
	optMasculino.setBounds(20, 400, 150, 20);
	add(optMasculino);
	optFeminino.setBounds(170, 400, 150, 20);
	add(optFeminino);
	optNaoBinario.setBounds(320, 400, 150, 20);
	add(optNaoBinario);
	btgSexo.add(optMasculino);
	btgSexo.add(optFeminino);
	btgSexo.add(optNaoBinario);
	optMasculino.setSelected(true);
	
	// Configuração da lista de opções 
	lblBancoDeDados.setBounds(20, 430, 200, 20);
	add(lblBancoDeDados);
	jspBancoDeDados.setBounds(20, 450, 970, 200);
	add(jspBancoDeDados);
	lstBancoDeDados.setModel(dlmBancoDeDados);
	dlmBancoDeDados.addElement("Registro 1");
	dlmBancoDeDados.addElement("Registro 2");
	dlmBancoDeDados.addElement("Registro 3");
	dlmBancoDeDados.addElement("Registro 4");
	dlmBancoDeDados.addElement("Registro 5");
	
	}
}
