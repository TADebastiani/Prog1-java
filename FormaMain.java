import java.util.Scanner;

class FormaMain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Quadrado caixa = new Quadrado();
		

		System.out.println("Defina X:");
		caixa.setX(sc.nextInt());
		System.out.println("Defina Y:");
		caixa.setY(sc.nextInt());
		System.out.println("Defina Lado:");
		caixa.setLado(sc.nextInt());

		System.out.println("(" + caixa.getX() + ", " + caixa.getY() + ") Lado: " + caixa.getLado());

		for (int i = 0; i <= caixa.getY(); i++){
			System.out.println();
		}
		for (int i = 0; i<= caixa.getLado(); i++){
			for (int j = 0; j<= caixa.getLado(); j++) {
				if (j == 0){
					for (int abacate = 0; abacate<= caixa.getX(); abacate++){
						System.out.print("  ");
					}
					System.out.print("#");
				}else{
					System.out.print(" #");
				}
			}
			System.out.println();
		}
	}
}