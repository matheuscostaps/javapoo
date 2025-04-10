package negocio;

public class Pessoa {
	
	// Propiedades da Classe 
	private String nome = "";
	private boolean sexo = false;
	private String endereco = "";
	private Uf objUf = null;
	
	// Metodos construtores da classe 
	
	public Pessoa(String nome, boolean sexo, String endereco, Uf objUf) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.endereco = endereco;
		this.objUf = objUf;
	}
	
	public Pessoa() {
		super();
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Uf getObjUf() {
		return objUf;
	}

	public void setObjUf(Uf objUf) {
		this.objUf = objUf;
	}
	
}
