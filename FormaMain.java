import java.util.Scanner;

class FormaMain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Quadrado caixa = new Quadrado();
		Quadrado vetor[] = new Quadrado[10];

		System.out.println("Defina X:");
		caixa.setX(sc.nextInt());
		System.out.println("Defina Y:");
		caixa.setY(sc.nextInt());
		System.out.println("Defina Lado:");
		caixa.setLado(sc.nextInt());

		for (int i=0; i<vetor.length; i++){
			
			vetor[i].setX(caixa.getX());
			vetor[i].setY(caixa.getY());
			vetor[i].setLado(caixa.getLado());
		}

		caixa.imprimeQuadrado();

		Quadrado.imprimeVetor(vetor);

	}
}