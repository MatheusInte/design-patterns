package behavioral.Strategy;

public class Debito implements Estrategia{
	private double valor;
	private double juros = 0.05;
	
	public Debito(int v1) {
		this.valor = v1;
	}

	@Override
	public double pagamento() {
		return valor * juros + valor;
	}
}
