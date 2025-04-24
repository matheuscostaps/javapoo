package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Tipo {

    private String descricao = "";

    public Tipo() {
    }

    public Tipo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   // Metodos da Classe

    public static Collection<Tipo> getTodos() throws Exception {
        ArrayList<Tipo> colecao = new ArrayList<Tipo>();

        colecao.add(new Tipo("Livro"));
        colecao.add(new Tipo("Eletronico"));
        colecao.add(new Tipo("Alimentação"));
        colecao.add(new Tipo("Brinquedo"));
        colecao.add(new Tipo("Eletrodomesticos"));
        
        colecao.add(new Tipo("Periféricos"));
        
        return colecao;

    }

}
