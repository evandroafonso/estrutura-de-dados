package metodosOrdenacao;

public class SelectionSort {
	
	
	public static void main(String[] args){
		
		int[] vetor = {3,6,8,1,4,9,0};

	        for (int i = 0; i <= vetor.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < vetor.length; j++){  
	                if (vetor[j] < vetor[index]){  
	                    index = j;  
	                }  
	            }  
	            int ordenaNumero = vetor[index];   
	            vetor[index] = vetor[i];  
	            vetor[i] = ordenaNumero;  
	            
	            System.out.println(ordenaNumero);
	            
	        }
	        

	        
	    }
}