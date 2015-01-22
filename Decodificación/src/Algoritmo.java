

public class Algoritmo {
	
public static void main(String[] args){
	char base [] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	char textoCod[] = {'E','S','B','D','V','M','B'};
	int k=1;
	
	for (int i=0; i<textoCod.length; i++){
		
		 
		for (int j=0; j<base.length; j++){
			
			if (textoCod[i]==base[j]){
				if(j-k<0){
					System.out.print(base[base.length-k]);
				}else{
					System.out.print(base[i-k]);
				}
			}
			
		}
	}
	
}
	
	
}
