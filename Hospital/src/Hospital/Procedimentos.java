package Hospital;

public class Procedimentos {
	
	private String titulo, descricao, codigo;
	private Medico medicoResponsavel;
	private Enfermeiro enfermeiroResponsavel;
	private Paciente paciente;
	private Medicamentos medicamentos;
	private Insumos insumos;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Medico getMedicoResponsavel() {
		return medicoResponsavel;
	}

	public void setMedicoResponsavel(Medico medicoResponsavel) {
		this.medicoResponsavel = medicoResponsavel;
	}

	public Enfermeiro getEnfermeiroResponsavel() {
		return enfermeiroResponsavel;
	}

	public void setEnfermeiroResponsavel(Enfermeiro enfermeiroResponsavel) {
		this.enfermeiroResponsavel = enfermeiroResponsavel;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medicamentos getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(Medicamentos medicamentos) {
		this.medicamentos = medicamentos;
	}

	public Insumos getInsumos() {
		return insumos;
	}

	public void setInsumos(Insumos insumos) {
		this.insumos = insumos;
	}

	public static void cadastraProcedimento() {
		/*gera um código unico pro procedimento
		verifica se é um médico ou enfermeiro responsável (com opção de ser os dois) utilizando opções e if - else
		pede o crm (para médicos) ou corem (pros enfermeiros)e verifica se existe em suas respectivas listas, se não existir, lança exceção
		pergunta se vai usar medicamento, se sim, pede o nome e verifica se tem no estoque  (arraylist de medicamentos), se não tiver, lança excessão
		pergunta se vai usar insumo, se sim, pede o nome e verifica se tem no estoque  (arraylist de insumos), se não tiver, lança excessão
		pede o cpf do paciente, verifica se tem no sistema, se não tiver, lança excessão, pergunta se deseja adicionar novo paciente, 
		se sim chama o método de pegar os dados do paciente, contido na classe Paciente
		adiciona esses dados uma lista de procedimentos em aberto*/
		
		//percorrer os arraylists de medicamentos e isnumos e deduzir a quantidade utilizada no procedimento do estoque
	}
	
	public static void finalizaProcedimento() {
		// pede o codigo unico do procedimento, verifica se existe e remove da lista de procedimentos.
	}
}
