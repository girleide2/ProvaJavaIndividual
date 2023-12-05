package Hospital;

import java.time.LocalDate;

public class Insumos extends Materiais {
	
	
	public Insumos(String nome, LocalDate dataValidade, int quantidadeEmEstoque) {
		super(nome, dataValidade, quantidadeEmEstoque);
	}

	public static void pegaDadosInsumos() {
		// pega todos os dados dos medicamentos nome, indicacao, data de validade e quantidade em estoque (classe materiais)
		// armazena tudo em um arraylist de Insumos.
	}

}
