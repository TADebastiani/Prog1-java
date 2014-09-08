class Frase{
	private String frase;

	public Frase(String a){
		this.frase = new String(a);
	}

	public int quantasVogais(){
		if (this.frase.isEmpty()) return 0;

		int n=0, i;
		char c;
		boolean b;
		for(i=1; i <= this.frase.length(); i++){
			c = this.frase.charAt(i-1);
			b = (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
			if (b){
				n ++;
			}
		}

		return n;
	}

	public int tamanho(){

		return this.frase.length();
	}

	public int quantasPalavras(){
		String z = this.frase.trim();
		if (this.frase.isEmpty()) return 0;

		int n=0, index, lastIndex =0;
		char c;
		boolean b;
		for(index=1; index <= this.frase.length(); index++){
			c = this.frase.charAt(index-1);
			
			b = c == ' ';
			
			if (b){
				lastIndex = index;
				n ++;
			}
		}

		if(lastIndex < this.frase.length()) n++;

		return n;
	}


}