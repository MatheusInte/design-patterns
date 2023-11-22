package behavioral.Composite;

public class TrechoComposto implements TrechoAereo{
	private TrechoAereo primeiro;
	private TrechoAereo segundo;
	private double taxaConexao;
	
	public TrechoComposto(TrechoAereo primeiro, TrechoAereo segundo, double taxaConexao) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.taxaConexao = taxaConexao;
		if (primeiro.getDestino() != segundo.getOrigem())
			throw new RuntimeException("O destino do primeiro não é igual a origem do segundo");
	}

	public String getOrigem() {
		return primeiro.getOrigem();
	}

	public String getDestino() {
		return segundo.getDestino();
	}

	public double getPreco() {
		return primeiro.getPreco() + segundo.getPreco() + taxaConexao;
	}
	
	@Override
	public String toString() {
		return "Trecho Simples com origem em " + primeiro.getOrigem() 
				+ " e destino em " + segundo.getDestino()
				+ ", mas com escala em " + primeiro.getDestino()
				+ " com preco de " + getPreco();
	}
	
	
}
