class Autor {
	private String nome;
	private int id;

	public void setNome (String nome) {
		this.nome = nome;
	}

	public String getNome (){
		return nome;
	}

	public void setId (int id) {
		this.id = id;
	}

	public int getId () {
		return id;
	}

	public void imprimeAutor () {
		System.out.println("Nome: " + getNome());
		System.out.println("ID: " + getId());
	}

}