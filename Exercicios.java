import java.util.Scanner;

class Exercicios{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elefantes?");
		
		Elefante e = new Elefante(sc.nextInt());

		e.imprimeElefante();

		System.out.println();
		System.out.println("Digite uma frase:");

		sc.nextLine();
		Frase f = new Frase(sc.nextLine());

		System.out.println(f.tamanho() + " caracteres");
		System.out.println(f.quantasPalavras() + " palavras");
		System.out.println(f.quantasVogais() + " vogais");

	}
}

