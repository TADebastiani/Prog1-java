import java.util.Scanner;

class PostMain {
	public static void main(String[] args) {
		Autor autor = new Autor();
		Post post = new Post();
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome do Autor?");
		autor.setNome(sc.nextLine());

		System.out.println("ID?");
		autor.setId(sc.nextInt());
		
		post.setAutor(autor);

		System.out.println("Digite o texto:");
		post.setTexto(sc.nextLine());

		System.out.println();
		post.imprimeResumo();
	}
}