
public class Disciplina {
	private int codigo;
	private String nome;
	private int cargaHoraria;
	
	//Constructor - 0
	public Disciplina() {
		
	}
	
	//Constructor - 2
	public Disciplina(int codigo, String nome, int cargaHoraria) {
		setCodigo(codigo);
		setNome(nome);
		setCargaHoraria(cargaHoraria);
	}
	
	//get and set
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cargaHoraria=");
		builder.append(cargaHoraria);
		builder.append("]");
		return builder.toString();
	}	
}
