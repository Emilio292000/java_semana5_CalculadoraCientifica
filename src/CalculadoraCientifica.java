import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraCientifica {
    private static final int MAX_HISTORIAL = 10;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] historial = new String[MAX_HISTORIAL];
        int contadorHistorial = 0;
        boolean continuar = true;

        System.out.println("=== Calculadora Cientifica ===");

        while(continuar){
            System.out.println("\nSelecciona una operacion: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz Cuadrada");
            System.out.println("7. Ver Historial");
            System.out.println("8. Salir");
            System.out.print("Opción: ");
            int opcion = 0;
            try{
                opcion = entrada.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("ERR:Opcion invalida. Intente de nuevo.");
                entrada.next();
                continue;
            }
            switch (opcion){
                case 1:
                    double[] sumandos = obtenerDosNumeros(entrada);
                    double suma = sumandos[0] + sumandos[1];
                    System.out.println("Resultado: " + suma);
                    agregarAlHistorial(historial, contadorHistorial++, sumandos[0] + "+" + sumandos[1] + "=" + suma)
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    break;
                case 8:
                    System.out.println("8");
                    break;
                default:
                    System.out.println("ERR:Opcion invalida. Intente de nuevo. ");
            }
            if (contadorHistorial >= MAX_HISTORIAL){
                System.out.println("Historial lleno. No se puede almacenar mas operaciones.");
                contadorHistorial = MAX_HISTORIAL;
            }
        }
        System.out.println("¡Hasta luego!");
        entrada.close();
    }
    private static  double[] obtenerDosNumeros(Scanner entrada){
        double num1 = 0, num2 = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Ingresa el primer numero: ");
                num1 = entrada.nextDouble();
                System.out.
            }
        }
    }
}