package ComandosJava.Teste02.EstruturasDeRepeticao;

import java.util.Scanner;

/*
Faça um programa que peça N número inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de número impares.
 */
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantidaresPares = 0, quantidaresImpares = 0;

        System.out.println("Quantidade de número: ");
        quantidadeNumeros = scanner.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scanner.nextInt();


            if (numero % 2 == 0) quantidaresPares++;
            else  quantidaresImpares++;


                count++;
        } while (count < quantidadeNumeros);

        System.out.println("Quantidade Par:"+ quantidaresPares);
        System.out.println("Quantidade Impar:"+ quantidaresImpares);
    }
}
