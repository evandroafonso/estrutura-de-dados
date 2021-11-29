package metodosOrdenacao;

public class BubbleSort {

	public static void main(String args[]){
		int[] vetor = {3,6,8,1,4,9,0};
		int auxiliar = 0;
		int i = 0;
		int a = 0;

		System.out.println("Vetor antes da ordenação Bubble Sort: ");
		for(i = 0; i < vetor.length; i++){
			System.out.print(" " + vetor[i]);
		}
		System.out.println(" ");

		for(i = 0; i < vetor.length; i++){

			for(a = 0; a < 6; a++){
				if(vetor[a] > vetor[a + 1]){
					auxiliar = vetor[a];
					vetor[a] = vetor[a + 1];
					vetor[a + 1] = auxiliar;
				}
			}
		}
		System.out.println("Vetor ordenado pelo Bubble Sort:");
		for(i = 0; i < vetor.length; i++){
			System.out.print(" "+vetor[i]);
		}
	}
	
	
}
