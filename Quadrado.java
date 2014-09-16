class Quadrado extends FormaGeo{

	private int lado;

	public void setLado(int l){
		this.lado = l;
	}

	public int getLado(){
		return this.lado;
	}


	public int quantosMaiores(Quadrado[] v){
		int count;

		for (int i=0; i<=v.length; i++) {
			if (v[i].getLado() > 20){
				count++;
			}
		}

		return count;
	}
}