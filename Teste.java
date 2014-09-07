import java.util.Scanner;

class Teste{
	public static void main(String[] args) {
		Data hoje = new Data();
		Data today = new Data();

		Scanner sc = new Scanner(System.in);

		System.out.println("Data 1");
		System.out.print("Dia: ");
		hoje.setDia(sc.nextInt());

		System.out.print("Mes: ");
		hoje.setMes(sc.nextInt());

		System.out.print("Ano: ");
		hoje.setAno(sc.nextInt());

		System.out.print("Hora: ");
		hoje.setHora(sc.nextInt());

		System.out.print("Minuto: ");
		hoje.setMinuto(sc.nextInt());

		System.out.print("Segundo: ");
		hoje.setSegundo(sc.nextInt());

		hoje.imprimeData();
		System.out.println();



		System.out.println("Data 2");
		System.out.print("Dia: ");
		today.setDia(sc.nextInt());

		System.out.print("Mes: ");
		today.setMes(sc.nextInt());

		System.out.print("Ano: ");
		today.setAno(sc.nextInt());

		System.out.print("Hora: ");
		today.setHora(sc.nextInt());

		System.out.print("Minuto: ");
		today.setMinuto(sc.nextInt());

		System.out.print("Segundo: ");
		today.setSegundo(sc.nextInt());

		today.imprimeData();
		System.out.println();



		System.out.println(hoje.diferencaEmDias(today) + " dias de diferenca entre as Datas 1 e 2.");
		System.out.println();
		System.out.println(hoje.diferencaEmHoras(today) + " horas de diferenca entre as Datas 1 e 2.");
		System.out.println();
		System.out.println(hoje.diferencaEmSegundos(today) + " segundos de diferenca entre as Datas 1 e 2.");
		System.out.println();

	}
}