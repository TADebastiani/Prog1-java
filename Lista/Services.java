class Services{

	public static int contaPossiveisCandidatos(Inimigo i[]){
		int count=0;

		for (int a=0; a<i.length; a++){
			
			if ((i[a].getPosicao().getX() > 100 ||
				i[a].getPosicao().getY() > 100) &&
				i[a].getEnergia() <= 50 &&
				(i[a].getVelocidade().tamanho() > 200)){
				
				count++;
			}
		}

		return count;

	}
}