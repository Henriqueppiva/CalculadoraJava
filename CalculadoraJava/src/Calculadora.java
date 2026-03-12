   public class Calculadora {

    public double somar(double n1, double n2) {
        return n1 + n2;
    }

    public double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

   public double dividir(double a, double b) {
    if (b == 0) {
        System.out.println("Não é possível dividir por zero.");
        return 0;
    } else {
        return a / b;

    }
 }
}

