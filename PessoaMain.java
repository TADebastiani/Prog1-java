class PessoaMain {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setIdade(22);
		p1.setAltura(1.63);
		p1.setLivro(new Livro());
		p1.getLivro().setId(123456);
		p1.getLivro().setPeso(0.3);

		Pessoa p2 = new Pessoa();
		p2.setIdade(35);
		p2.setAltura(1.85);
		p2.setLivro(new Livro());
		p2.getLivro().setId(42);
		p2.getLivro().setPeso(4.2);


		System.out.println("Pessoa 1");
		System.out.println("- Idade: " + p1.getIdade());
		System.out.println("- Altura: " + p1.getAltura());
		System.out.println("- Livro ID: " + p1.getLivro().getId());
		System.out.println("- Livro Peso: " + p1.getLivro().getPeso());		System.out.println("Pessoa1");
		System.out.println();
		System.out.println("Pessoa 2");
		System.out.println("- Idade: " + p2.getIdade());
		System.out.println("- Altura: " + p2.getAltura());
		System.out.println("- Livro ID: " + p2.getLivro().getId());
		System.out.println("- Livro Peso: " + p2.getLivro().getPeso());
	}
}