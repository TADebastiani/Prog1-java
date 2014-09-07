class Elefante{

	private int i;

	public Elefante(int i){
		this.i = i;
	}

	public void imprimeElefante(){
		
		String e = "incomodam, ";
		int j, k;

		for (j=1; j<=i; j++){
			
			if (j == 1){
				System.out.println(j + " elefante incomoda muita gente.");	
			}else{
				System.out.print(j + " elefantes ");
				
				for (k=1; k<=j; k++){
				
					if (k == j){
						System.out.print("incomodam ");
					}else{
						System.out.print(e);
					}
				}
				System.out.println("muito mais.");
			}
			
			
		}
	}
}