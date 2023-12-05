package Hospital;

import java.time.LocalDate;

public class Paciente extends Pessoa { // a classe paciente herda dados da classe pessoa.
	
	public String sintomas; //exclusivo para pacientes

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	
	public Paciente(String nome, String sexo, String cpf, LocalDate dataNascimento) {
		super(nome, sexo, cpf, dataNascimento);
		// TODO Auto-generated constructor stub
	}

	public static void pegaDadosPaciente() {
		// interage com o usuário e pede os dados nome, cpf, data de nascimento, sexo (classe pessoa)
		// pega os dados dos sintomas (dessa mesma classe)
		// armazena tudo em uma lista de pacientes
	}

	
}
