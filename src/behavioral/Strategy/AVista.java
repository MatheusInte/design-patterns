package behavioral.Strategy;

public class AVista implements Estrategia{
	private double valor;
	private double desconto = 0.1;
	
	public AVista(double v1) {
		this.valor = v1;
	}

	@Override
	public double pagamento() {
		return valor - valor*desconto;
	}
	
	
}
