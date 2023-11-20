package behavioral.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estoque {
	private Map<String,Integer> produtos = new HashMap<>();
	private List<Observador> observador = new ArrayList<>();
	
	public void adicionaProdutos(String produto, Integer quantidade) {
		if(produtos.containsKey(produto)) {
			quantidade += produtos.get(produto);
		} else {
			produtos.put(produto, quantidade);
			};
		notificar(produto,quantidade);
	}

	public void adicionaObservador(Observador o) {
		observador.add(o);
	}
	
	private void notificar(String produto, Integer quantidade) {
		for(Observador o: observador) {
			o.mudancaQuantidade(produto, quantidade);
		}
	}
	
	
}
