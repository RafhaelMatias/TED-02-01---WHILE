//Escreva um programa Java que gera um número aleatório (randômico) entre 0 e 10
// (incluindo estes dois valores) e peça ao usuário para adivinhá-lo.
// Use um laço while para registrar as tentativas feitas e, a cada tentativa,
// dê dicas informando se o número gerado é maior ou menor que a tentativa feita.
// Finalmente mostre a quantidade de tentativas feitas até que o número fosse acertado.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int entrada = 0;
        int assertiva = 3;
        int contador = 1;

        while (entrada != assertiva) { //enquanto for diferente da assertiva (3), tente outro numero
            System.out.println("Digite um número de 0 a 10: ");
            entrada = a.nextInt();

            if (entrada > assertiva) { //entrada maior que assertiva (3), tente um numero menor

                System.out.println("Errou. Tente um número menor que " + entrada + ".");
                contador++;


            } else if (entrada < assertiva) { //entrada menor que assertiva (3), tente um numero maior
                System.out.println("Errou! Tente um número maior que " + entrada + ".");
                contador++;


            } if ((entrada == assertiva) && (contador == 1)){ //assertiva (3) e uma tentativa, numero correto
                System.out.println("Parabens! Acertou de primeiro!");

            } else if (entrada == assertiva) { //entrada igual a assertiva (3), numero correto
                System.out.println("Parabens! Acertou o número correto.\nForam necessárias " + contador + " tentativa(s)");
}


        }
    }
}










