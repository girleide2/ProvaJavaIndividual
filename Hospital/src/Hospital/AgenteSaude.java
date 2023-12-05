package Hospital;

import java.time.LocalDate;

public class AgenteSaude extends Pessoa {
	
	public AgenteSaude(String nome, String sexo, String cpf, LocalDate dataNascimento) {
		super(nome, sexo, cpf, dataNascimento);
	}
	private String especialidade, idiomas;
	private int tempoDeExperiencia;
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}
	public int getTempoDeExperiencia() {
		return tempoDeExperiencia;
	}
	public void setTempoDeExperiencia(int tempoDeExperiencia) {
		this.tempoDeExperiencia = tempoDeExperiencia;
	}

}
