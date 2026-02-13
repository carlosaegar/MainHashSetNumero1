import java.util.HashSet;
import java.util.Scanner;

public class MainHashSetNumero {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numeros (0 para salir) ");
        int numero;
        do {
            numero = sc.nextInt();
            boolean añadido = numeros.add(numero);

        } while (numero != 0);

        System.out.println("Lista final: " + numeros);
        sc.close();
    }
}


