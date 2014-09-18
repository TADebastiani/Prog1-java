class Quadrado extends FormaGeo{

	private int lado;

	public void setLado(int l){
		this.lado = l;
	}

	public int getLado(){
		return this.lado;
	}

	public int quantosMaiores(Quadrado v[]){
		int count=0;

		for (int i=0; i<=v.length; i++) {
			if (v[i].getLado() > 20){
				count++;
			}
		}

		return count;
	}

	public void imprimeQuadrado(){
		System.out.println("(" + this.getX() + ", " + this.getY() + ") Lado: " + this.getLado());

		for (int i = 0; i <= this.getY(); i++){
			System.out.println();
		}
		for (int i = 0; i<= this.getLado(); i++){
			for (int j = 0; j<= this.getLado(); j++) {
				if (j == 0){
					for (int abacate = 0; abacate<= this.getX(); abacate++){
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

	public static void imprimeVetor(Quadrado v[]){
		for (int i=0; i<v.length; i++) {
			System.out.println("Vetor "+i+"("+v[i].getX()+","+v[i].getY()+"): ");
			System.out.println("Lado: " + v[i].getLado());
		}
	}
}