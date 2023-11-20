package behavioral.Observer;

public class ProdutosRegistrador implements Observador{

	@Override
	public void mudancaQuantidade(String produto, Integer quantidade) {
		System.out.println("A quantidade de itens do produto: "
				+ produto + " - foi alterada para " + quantidade);
	}

}
