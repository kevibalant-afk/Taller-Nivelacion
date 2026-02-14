import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA BÁSICA");
        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Seleccione operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = sc.nextInt();
        double resultado = 0;

        switch(opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if(num2 != 0)
                    resultado = num1 / num2;
                else {
                    System.out.println("No se puede dividir entre cero");
                    return;
                }
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
