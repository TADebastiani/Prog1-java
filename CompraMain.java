import java.util.Scanner;

class CompraMain{
	public static void main(String[] args) {
		String produto;
		float preco;
		int quantidade;

		Scanner sc = new Scanner(System.in);


		System.out.print("Qual o produto: ");
		produto = sc.nextLine();

		System.out.print("Qual o valor: ");
		preco = sc.nextFloat();

		System.out.print("Quantos: ");
		quantidade = sc.nextInt();

		Compra item = new Compra(produto, preco, quantidade);

		item.imprimeResumo();

	}

}