public class Circulo {
	double raio;

	public Circulo(){
		raio = 0.0;
	}

	public double calcularArea() {
		double area;
		area = 3.1416 * raio * raio;
		return area;
	}
}
