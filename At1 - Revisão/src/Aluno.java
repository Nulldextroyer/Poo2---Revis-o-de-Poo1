
public class Aluno extends Pessoa {
		private String dataNascimento;
		//Constructor - 0
		public Aluno (){
			
		}
		
		public Aluno (String nome, String sexo, int codCadastro) {
			super(nome, sexo, codCadastro);
		}
		
		public Aluno(String nome, String sexo, int codCadastro, String dataNascimento) {
			super(nome, sexo, codCadastro);
			setDataNascimento(dataNascimento);
		}

		//get and set
		public String getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(String dataNascimento) {
			if (dataNascimento.length() > 0)
				this.dataNascimento = dataNascimento;
		}

		//toString
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Aluno [dataNascimento=");
			builder.append(dataNascimento);
			builder.append(", toString()=");
			builder.append(super.toString());
			builder.append("]");
			return builder.toString();
		}
		
}
