package Hospital;

import java.time.LocalDate;

public class Materiais {
	public String nome;
	private LocalDate DataValidade;
	private int quantidadeEmEstoque;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataValidade() {
		return DataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		DataValidade = dataValidade;
	}

	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public Materiais(String nome, LocalDate dataValidade, int quantidadeEmEstoque) {
		this.nome = nome;
		DataValidade = dataValidade;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
}
