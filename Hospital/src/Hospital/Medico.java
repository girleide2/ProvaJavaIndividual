package Hospital;

import java.time.LocalDate;

public class Medico extends AgenteSaude {
	public String crm; // exclusivo para médicos

	public String getCrm() {
		return crm;
	}
	
	public void setCrm(String crm) {
		this.crm = crm;
	}
	

	public Medico(String nome, String sexo, String cpf, LocalDate dataNascimento) {
		super(nome, sexo, cpf, dataNascimento);
		// TODO Auto-generated constructor stub
	}

	public static void pegaDadosMedico() {
		/*interage com o usuário e pede os dados nome, cpf, data de nascimento, sexo (classe pessoa através da classe agenteSaúde))
		idiomas falados, especialidade e tempo de experiência (classe AgenteSaúde)
		crm (dessa mesma classe)
		Armazena tudo em uma lista de médicos*/
		
		/*faz validações qaunto a quantidade de dígitos do cpf e se o cpf e o CRM já existe no sistema)*/
	}
}
