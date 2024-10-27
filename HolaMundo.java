import java.util.Scanner;

/**
 * HolaMundo
 */
public class HolaMundo {

    public static void main(String[] args){
        // Imprimir datos en pantalla/consola/terminal
        System.out.println("Hola Steven!");
        //Sive para imprimir en la misma linea pero no hace salto de linea
        System.out.print("como van las cosas");
        System.out.print(10);
        System.out.print(10.5);
        System.out.print('A');
        System.out.println();

        System.out.printf("Aquiva una cadena: %s%n","Steven");
        System.out.printf("Aqui va un entero: %d%n", 10);
        System.out.printf("Mi nombre es %s y tendo %d años%n", "Steven Paez",27);

        var entrada = new Scanner(System.in);

        System.out.print("Por favor ingese su nombre: ");
        var entero = entrada.nextLine();

        System.out.println(entero);

        entrada.close();
    }

}