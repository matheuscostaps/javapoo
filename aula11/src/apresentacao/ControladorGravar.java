package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Fabricante;
import negocio.Veiculo;

public class ControladorGravar implements ActionListener{
    // Propiedades da Classe
    private JComboBox<String> cboFabricante = null;
    private JTextField txtModelo = null;
    private JComboBox<String> cboCor = null;
    private JCheckBox chkTetoSolar = null;

    // Metodo Construtor de Classe 

    public ControladorGravar(JComboBox<String> cboFabricante, JTextField txtModelo, JComboBox<String> cboCor,
        JCheckBox chkTetoSolar) {
    this.cboFabricante = cboFabricante;
    this.txtModelo = txtModelo;
    this.cboCor = cboCor;
    this.chkTetoSolar = chkTetoSolar;
}

    // Método implementado da interface
    public void actionPerformed(ActionEvent e) {
        // Critica de Dados
        if (cboFabricante.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Campo Fabricante Obrigatório!");
            return;
        }
        if (txtModelo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Modelo Obrigatório!");
            return;
        }
        if (cboCor.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Campo cor Obrigatório!");
            return;
        }

        // Composição do Objeto 
        Veiculo objVeiculo = new Veiculo();
        objVeiculo.setObjFabricante(new Fabricante(cboFabricante.getSelectedItem().toString()));
        objVeiculo.setModelo(txtModelo.getText());
        objVeiculo.setCor (cboCor.getSelectedItem().toString());
        objVeiculo.setTetoSolar(chkTetoSolar.isSelected());

        JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso! \n\n" +
                "Fabricante: " + objVeiculo.getObjFabricante().getNome() + "\n" +
                "Modelo: " + objVeiculo.getModelo() + "\n" +
                "Cor: " + objVeiculo.getCor() + "\n" +
                "Teto Solar: " + (objVeiculo.isTetoSolar() ? "SIM" : "NÃO"));
    }

}