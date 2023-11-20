package behavioral.Observer;

public class ObservadorTeste {
	public static void main(String[] args) throws Exception{
		ProdutosRegistrador produtoRegistrador = new ProdutosRegistrador();
		Estoque estoque = new Estoque();
		estoque.adicionaObservador(produtoRegistrador);
		
		estoque.adicionaProdutos("Escova", 10);
		estoque.adicionaProdutos("Pasta", 10);
		estoque.adicionaProdutos("Fio Dental", 10);
		estoque.adicionaProdutos("Escova", 10);
		
	}
}
