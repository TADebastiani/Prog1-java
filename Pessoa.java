class Pessoa {
	private int idade;
	private double altura;
	private Livro book;

	public void setIdade(int i){
		this.idade = i;
	}

	public int getIdade(){
		return this.idade;
	}

	public void setAltura(double a){
		this.altura = a;
	}

	public double getAltura(){
		return this.altura;
	}

	public void setLivro(Livro l){
		this.book = l;
	}

	public Livro getLivro(){
		return this.book;
	}
}