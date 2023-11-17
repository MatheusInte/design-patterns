package behavioral.Strategy;

public class Operacao {
	double pagamento(Estrategia estrategia) {
		return estrategia.pagamento();
	}
}
