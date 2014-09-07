class Compra {
	private String nomeProduto;
	private float preco;
	private int quantidade;

	public Compra(String produto, float preco, int quantidade) {
		this.nomeProduto = produto;
		this.preco = preco;
		this.quantidade = quantidade;

	}

	public void setNomeProduto(String novo) {
		this.nomeProduto = novo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPreco() {
		return preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	// Imprime todas as propriedades da classe
	public void imprimeResumo() {
		float total = preco * quantidade;

		System.out.println();
		System.out.println("-- RESUMO DA COMPRA --");
		System.out.println("Produto: "+ getNomeProduto());
		System.out.println("Valor: R$"+ getPreco());
		System.out.println("Quantidade: "+ getQuantidade());
		System.out.println("Total: R$"+ total);

	}
}