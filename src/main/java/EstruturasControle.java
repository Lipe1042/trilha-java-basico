import java.util.Scanner;

public class EstruturasControle {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao contador de impar ou pares de um intervalo de Números");
        System.out.println("Primeiro digite os Número entre 0 e 20");
        Scanner scanner = new Scanner(System.in);

        var numero1 = scanner.nextInt();
        var numero2 = scanner.nextInt();

        System.out.println("Você escolhe par ou impar?");
        var escolha = scanner.next();

        for (int i = numero2; i >= numero1; i--) {
            if (escolha.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.println(i);
            }

                else if (escolha.equalsIgnoreCase("impar") && i % 2 != 0) {
                    System.out.println(i);



                }
        }


    }


}
