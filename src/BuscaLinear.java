import java.util.Scanner;

public class BuscaLinear {

    //Vetor de String e Busca Linear
    public static void main(String[] args) {

        String[] estados = new String[10];
        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sigla de estado quer buscar? ");
        String siglaBusca = leitor.nextLine();


        boolean siglaEncontrada = false;
        int contador = 0;

        //busca linear
        for(int i = 0; i < estados.length; i++){
            contador++;
            if(estados[i].equals(siglaBusca)) {
                siglaEncontrada = true;
                System.out.println("Estado " + siglaBusca + " encontrado");
                System.out.println("o algoritmo buscou " + contador + " vezes até encontrar o elemento.");
                break;
            }
        }

        if(!siglaEncontrada) {
            System.out.println("o algoritmo buscou " + contador + " vezes e não encontrou o elemento.");
            System.out.println("Sigla " + siglaBusca + " não encontrada, tente novamente!");
        }
    }
}