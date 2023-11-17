package behavioral.Strategy;

public class Credito implements Estrategia{
	private double valor;
	private double juros = 0.10;
	
	public Credito(int v1) {
		this.valor = v1;
	}

	@Override
	public double pagamento() {
		return valor * juros + valor;
	}
	
	
}
