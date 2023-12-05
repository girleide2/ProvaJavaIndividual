package Hospital;

import java.time.LocalDate;

public class Medicamentos extends Materiais {
	private String indicacao, interacoesMedicamentosas, precaucoes;

	public String getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}

	public String getInteracoesMedicamentosas() {
		return interacoesMedicamentosas;
	}

	public void setInteracoesMedicamentosas(String interacoesMedicamentosas) {
		this.interacoesMedicamentosas = interacoesMedicamentosas;
	}

	public String getPrecaucoes() {
		return precaucoes;
	}

	public void setPrecaucoes(String precaucoes) {
		this.precaucoes = precaucoes;
	}

	public Medicamentos(String nome, LocalDate dataValidade, int quantidadeEmEstoque, String indicacao,
			String interacoesMedicamentosas, String precaucoes) {
		super(nome, dataValidade, quantidadeEmEstoque);
		this.indicacao = indicacao;
		this.interacoesMedicamentosas = interacoesMedicamentosas;
		this.precaucoes = precaucoes;
	}

	public static void pegaDadosMedicamentos(){
		// pega todos os dados dos medicamentos nome, indicacao, data de validade (classe materiais) interacoesMedicamentosas, precaucoes e quantidade em estoque
		// armazena tudo em um arraylist de medicamentos.
	}
}
