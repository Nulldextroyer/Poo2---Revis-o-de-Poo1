
public class Pessoa {
	private String nome;
	private String sexo;
	private int codCadastro;
	
	//Constructor - 0
	public Pessoa() {
		
	}
	
	//Constructor - 3
	public Pessoa(String nome, String sexo, int codCadastro) {
		setNome(nome);
		setSexo(sexo);
		setCodCadastro(codCadastro);
	}

	//Get and Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() > 0)
			this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		if(sexo.length() > 0)
			this.sexo = sexo;
	}

	public int getCodCadastro() {
		return codCadastro;
	}

	public void setCodCadastro(int codCadastro) {
		if(codCadastro > 0)
		this.codCadastro = codCadastro;
	}

	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", codCadastro=");
		builder.append(codCadastro);
		builder.append("]");
		return builder.toString();
	}
		
		
}
