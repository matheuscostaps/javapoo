package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener{

    // Propiedades da Classe
    private JTextField txtNome = null;
    private JTextField txtPreco = null;
    private JComboBox<String> cboTipo = null;
    private JCheckBox chkPerecivel = null;
    private JTextArea txtDetalhamnto = null;

    public ControladorLimpar(JTextField txtNome, JTextField txtPreco, JComboBox<String> cboTipo, JCheckBox chkPerecivel,
            JTextArea txtDetalhamnto) {
        this.txtNome = txtNome;
        this.txtPreco = txtPreco;
        this.cboTipo = cboTipo;
        this.chkPerecivel = chkPerecivel;
        this.txtDetalhamnto = txtDetalhamnto;
    }

    // Metodo implementado de interface 
    public void actionPerformed(ActionEvent e){
        txtNome.setText("");
        txtPreco.setText("");
        cboTipo.setSelectedIndex(0);
        chkPerecivel.setSelected(false);
        txtDetalhamnto.setText("");
        
    }
}
