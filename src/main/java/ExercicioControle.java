import java.util.Scanner;


public class ExercicioControle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número inicial:");
        var numero_inicial = scanner.nextInt();

        System.out.println("Informe outro número:");
        while (true) {
            var numero = scanner.nextInt();

            if (numero < numero_inicial) {
                System.out.println("Número menor que o inicial. Ignorado!");
                continue;
            }

            if (numero % numero_inicial != 0) {
                System.out.println("Programa finalizado! O último número informado não tem divisão exata.");
                break;

            }


        }


    }


}
