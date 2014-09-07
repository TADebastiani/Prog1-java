class Frase{
	private String frase;

	public Frase(String a){
		this.frase = new String(a);
	}

	public int quantasVogais(){
		int n, i;
		char c;
		boolean b = (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
		for(i=0; i <= this.frase.lenght(); i++){
			c = this.frase.charAt(i);

			if (b){
				n ++;
			}
		}

		return n;
	}

	public int tamanho(){

		return this.frase.lenght();
	}

	public int contemQuantos(String z){

	}
}