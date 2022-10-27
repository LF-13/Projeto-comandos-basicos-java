package ComandosJava.Teste03Arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
vetor unidimensional
 */
public class Ex1OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5, 6};

        System.out.print("Vetor: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i]+ " ");
        }

    }
}
