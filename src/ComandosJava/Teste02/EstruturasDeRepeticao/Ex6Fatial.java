package ComandosJava.Teste02.EstruturasDeRepeticao;

import java.util.Scanner;

/* Faça um programa que calcule o fatial de número
inteiro fornecido pelo usúario

Ex: 5! = 120 (5 x 4 x 3 x 2 x 1)
 */
public class Ex6Fatial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scanner.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
}
