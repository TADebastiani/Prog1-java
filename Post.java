class Post {
	private Autor autor;
	private String texto;

	public void setAutor (Autor autor) {
		this.autor = autor;
	}

	public void setTexto (String texto) {
		this.texto = texto;
	}

	public String getTexto () {
		return texto;
	}

	public void imprimeResumo () {
		this.autor.imprimeAutor();
		System.out.println(getTexto());
	}
}