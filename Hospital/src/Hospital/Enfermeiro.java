package Hospital;

import java.time.LocalDate;

public class Enfermeiro extends AgenteSaude {
public String coren; // exclusivo para enfermeiros

	public String getCoren() {
		return coren;
	}
	
	public void setCoren(String coren) {
		this.coren = coren;
	}

	public Enfermeiro(String nome, String sexo, String cpf, LocalDate dataNascimento) {
		super(nome, sexo, cpf, dataNascimento);
		// TODO Auto-generated constructor stub
	}

	public static void pegaDadosEnfermeiros() {
		/*interage com o usuário e pede os dados nome, cpf, data de nascimento, sexo (classe pessoa através da classe agenteSaúde))
		idiomas falados, especialidade e tempo de experiência (classe AgenteSaúde)
		coren (dessa mesma classe)
		Armazena tudo em uma lista de enfermeiros*/
		
		/*faz validações qaunto a quantidade de dígitos do cpf e se o cpf e o coren já existe)*/
	}
}
