import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Olá usuários, Bem vindo ao sistema");
        System.out.println("Primeiro digite o nome do player 1 e player 2");
        Scanner scanner = new Scanner(System.in);
        var nome1 = scanner.next();
        var nome2 = scanner.next();
        System.out.println("agora digite o ano de nascimento do player 1 e player 2");
        var nascimento1 =  scanner.nextInt();
        var nascimento2 =  scanner.nextInt();
        var resultado = nascimento1 - nascimento2;

        System.out.printf("ok %s e %s, a diferença nas suas idades é de: %s", nome1, nome2, resultado);




    }
}