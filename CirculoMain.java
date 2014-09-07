import java.util.Scanner;

public class CirculoMain {
	public static void main (String[] args){
		double valorRaio, valorArea;
		Circulo umCirculo;
		umCirculo = new Circulo();
		System.out.println("Digite o valor do raio: ");
		Scanner sc = new Scanner(System.in);
		valorRaio = sc.nextDouble();
		umCirculo.raio = valorRaio;
		valorArea = umCirculo.calcularArea();
		System.out.println("A área é: " + valorArea);
	}
}
