
public class Turma {
	private String sigla;
	private int ano;
	
	//Constructor - 0
	public Turma() {
		
	}
	
	//Constructor - 2
	public Turma(String sigla, int ano) {
		setSigla(sigla);
		setAno(ano);
	}
	
	//get and set
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Turma [sigla=");
		builder.append(sigla);
		builder.append(", ano=");
		builder.append(ano);
		builder.append("]");
		return builder.toString();
	}
}
