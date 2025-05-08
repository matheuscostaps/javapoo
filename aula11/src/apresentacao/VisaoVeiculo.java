package apresentacao;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Fabricante;

public class VisaoVeiculo extends JFrame {

    // Propiedades da Classe

    private static final long serialVersionUID = 1L;

    private JLabel lblFabricante = new JLabel("Fabricante");
    private JComboBox<String> cboFabricante = new JComboBox<String>();

    private JLabel lblModelo = new JLabel("Modelo");
    private JTextField txtModelo = new JTextField();

    private JLabel lblCor = new JLabel("Cor");
    private JComboBox<String> cboCor = new JComboBox<String>();

    private JCheckBox chkTetoSolar = new JCheckBox("Teto Solar");

    private JButton btnGravar = new JButton("Gravar");
    private JButton btnLimpar = new JButton("Limpar");
    private JButton btnSair = new JButton("Sair");

    // Metodo principal de execução da classe
    public static void main(String[] args) {
        new VisaoVeiculo().setVisible(true);
    }

    // Metodo Construtor da Classe
    public VisaoVeiculo() {
        // Configuração da Janela 
        setTitle("Cadastro de Veiculos");
        setSize(300, 260);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Configuração da caixa de seleção do fabricante 
        lblFabricante.setBounds(10, 10, 200, 20);
        add(lblFabricante);
        cboFabricante.setBounds(10, 30, 265, 20);
        add(cboFabricante);
        cboFabricante.addItem("--- Fabricante ---");
        try{
            for (Fabricante objFabricante : Fabricante.getTodos()) 
                cboFabricante.addItem(objFabricante.getNome());
            }
            catch (Exception erro){
                JOptionPane.showMessageDialog(null, erro);
            }

            // Configuração da Caixa de Modelo 
            lblModelo.setBounds(10, 60, 200, 20);
            add(lblModelo);
            txtModelo.setBounds(10, 80, 265, 20);
            add(txtModelo);

            // Configuração da caixa de seleção de cor 
            lblCor.setBounds(10, 110, 200, 20);
            add(lblCor);
            cboCor.setBounds(10, 130, 150, 20);
            add(cboCor);
            cboCor.addItem(" --- Cor --- ");
            cboCor.addItem("Branco");
            cboCor.addItem("Prata");
            cboCor.addItem("Amarelo");
            cboCor.addItem("Vermelho");
            cboCor.addItem("Preto");

            // Configuração da Caixa de Opção do texto solar 

            chkTetoSolar.setBounds(6, 160, 200, 20);
            add(chkTetoSolar);

            // Configuração dos Botões 
            btnGravar.setBounds(10, 190, 80, 20);
            add(btnGravar);
            btnGravar.addActionListener(new ControladorGravar(cboFabricante, txtModelo, cboCor, chkTetoSolar));

            btnLimpar.setBounds(102, 190, 80, 20);
            add(btnLimpar);
            btnLimpar.addActionListener(new ControladorLimpar(
                                        cboFabricante, txtModelo, cboCor, chkTetoSolar));

            btnSair.setBounds(194, 190, 80, 20);
            add(btnSair);
            btnSair.addActionListener((ActionListener) new ControladorSair());

    }

}
