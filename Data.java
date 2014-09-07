class Data{
	private int dia, mes, ano, hora, minuto, segundo;

	public void setDia(int d){
		if(d>=1 && d<=31){
			this.dia = d;
		}
		else{
			System.out.println("Data errada!");
		}
	}

	public void setMes(int m){
		if(m>=1 && m<=12){
			this.mes = m;
		}
		else{
			System.out.println("Data errada!");
		}
	}

	public void setAno(int a){
		this.ano = a;
	}

	public void setHora(int h){
		if(h>=0 && h<=23){
			this.hora = h;
		}
		else{
			System.out.println("Tempo errado!");
		}
	}

	public void setMinuto(int m){
		if(m>=0 && m<=59){
			this.minuto = m;
		}
		else{
			System.out.println("Tempo errado!");
		}	
	}

	public void setSegundo(int s){
		if(s>=0 && s<=59){
			this.segundo = s;
		}
		else{
			System.out.println("Tempo errado!");
		}	
	}

	public int getDia(){
		return this.dia;
	}

	public int getMes(){
		return this.mes;
	}

	public int getAno(){
		return this.ano;
	}

	public int getHora(){
		return this.hora;
	}

	public int getMinuto(){
		return this.minuto;
	}

	public int getSegundo(){
		return this.segundo;
	}



	public int diferencaEmDias(Data z){
		int dif=0;
		
		if (this.ano > z.ano){
			dif += (this.ano - z.ano) * 365;
		}else{
			dif += (z.ano - this.ano) * 365;
		}

		if (this.mes > z.mes){
			dif += (this.mes - z.mes) * 30;
		}else{
			dif += (z.mes - this.mes) * 30;
		}
		
		if (this.dia > z.dia){
			dif += (this.dia - z.dia);
		}else{
			dif += (z.dia - this.dia);
		}

		return dif;

	}



	public int diferencaEmHoras(Data z){
		int diferenca;

		diferenca = diferencaEmDias(z) * 24;

		if (this.hora > z.hora){
			diferenca += (this.hora - z.hora);
		}else{
			diferenca += z.hora - this.hora;
		}

		return diferenca;
	}



	public int diferencaEmSegundos(Data z){
		int diferenca;

		diferenca = diferencaEmHoras(z) * 1200;

		if (this.minuto > z.minuto){
			diferenca += (this.minuto - z.minuto) * 60;
		}else{
			diferenca += (z.minuto - this.minuto) * 60;
		}

		if (this.segundo > z.segundo){
			diferenca += (this.segundo - z.segundo);
		}else{
			diferenca += (z.segundo - this.segundo);
		}

		return diferenca;
	}


	public void imprimeData(){
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano + " " + this.hora + ":" + this.minuto + ":" + this.segundo);
	}
}