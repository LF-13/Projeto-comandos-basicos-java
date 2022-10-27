package ComandosJava.Teste02.EstruturasDeRepeticao;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteira entre 1 a 10.
O usuário deve informar de qual número ele desejar ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */
public class Ex5Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tabuada: ");
        int tabuada = scanner.nextInt();
        System.out.println("Tabuada: " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}
