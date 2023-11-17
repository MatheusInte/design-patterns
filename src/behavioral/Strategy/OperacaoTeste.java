package behavioral.Strategy;

public class OperacaoTeste {
	Operacao operacao = new Operacao();
	
	AVista avista = new AVista(100);
	Credito credito = new Credito(100);
	Debito debito = new Debito(100);
	
	System.out.println("A vista: " + operacao.pagamento(avista));
	System.out.println("Credito: " + operacao.pagamento(credito));
	System.out.println("Debito: "+ operacao.pagamento(debito));
}
