package behavioral.Strategy;

public class Operacao {
	double pagar(Estrategia estrategia) {
		return estrategia.pagamento();
	}
}
