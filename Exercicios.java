import java.util.Scanner;

class Exercicios{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elefantes?");
		
		Elefante e = new Elefante(sc.nextInt());

		e.imprimeElefante();

	}
}

