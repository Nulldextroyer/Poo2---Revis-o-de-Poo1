
public class Professor extends Pessoa{
	private double salario;
	private String formacao;
	
	//Constructor - 0
			public Professor (){
				
			}
			
			public Professor (String nome, String sexo, int codCadastro) {
				super(nome, sexo, codCadastro);
			}
			
			public Professor(String nome, String sexo, int codCadastro, double salario, String formacao) {
				super(nome, sexo, codCadastro);
				setSalario(salario);
				setFormacao(formacao);
			}
			
			//get and set
			public double getSalario() {
				return salario;
			}

			public void setSalario(double salario) {
				if (salario > 0)
				this.salario = salario;
			}

			public String getFormacao() {
				return formacao;
			}

			public void setFormacao(String formacao) {
				if (formacao.length() > 0)
					this.formacao = formacao;
			}

			@Override
			public String toString() {
				StringBuilder builder = new StringBuilder();
				builder.append("Professor [salario=");
				builder.append(salario);
				builder.append(", formacao=");
				builder.append(formacao);
				builder.append(", toString()=");
				builder.append(super.toString());
				builder.append("]");
				return builder.toString();
			}
			
}
