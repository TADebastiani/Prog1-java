class Inimigo extends Boid{
	private int vida;

	public int getVida(){
		return vida;
	}

	public void setVida(int v){
		this.vida = v;
	}

	Inimigo achaAlvoMaisProximo(Inimigo i[]){
		Inimigo enemy;

		for (int a=0; a<i.length; a++) {

			if (i[a].getPosicao().getX() == this.getPosicao().getX() &&
				i[a].getPosicao().getY() == this.getPosicao().getY() &&
				i[a].getPosicao().getA() == this.getPosicao().getA() &&
				i[a].getPosicao().getB() == this.getPosicao().getB()
				){

				enemy = i[a];
			}

			return enemy;
		}
	}
}