import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Calculadora Java");

        System.out.print("Digite o numero 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o numero 2: ");
        double n2 = sc.nextDouble();

        System.out.println("Escolha n1 operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtraçao");
        System.out.println("3 - Multiplicaçao");
        System.out.println("4 - Divisao");

        int opcao = sc.nextInt();

        double resultado = 0;

        sc.close();

        switch (opcao) {
            case 1:
                resultado = calc.somar(n1, n2);
                break;
            case 2:
                resultado = calc.subtrair(n1, n2);
                break;
            case 3:
                resultado = calc.multiplicar(n1, n2);
                break;
            case 4:
                resultado = calc.dividir(n1, n2);
                break;
            default:
                System.out.println("Opçao invalida.");
                return;
        }

        System.out.println("Resultado: " + resultado);

    
    }
}
