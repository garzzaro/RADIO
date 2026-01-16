import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Radio miRadio = new Implementacion();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("\n--- RADIO SIMULATOR ---");
            System.out.println("1. Prender");
            System.out.println("2. Cambiar Banda (AM/FM)");
            System.out.println("3. Avanzar Dial");
            System.out.println("4. Guardar en Boton");
            System.out.println("5. Cargar de Boton");
            System.out.println("6. Apagar");
            System.out.println("7. Salir");
            System.out.print("Elija una opcion: ");

            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        miRadio.prenderRadio();
                        break;
                    case 2:
                        System.out.println("1. AM\n2. FM");
                        int b = sc.nextInt();
                        if (b == 1) miRadio.cambiarAM(); 
                        else miRadio.cambiarFM();
                        break;
                    case 3:
                        miRadio.avanzarEstacion();
                        break;
                    case 4:
                        miRadio.guardarEstacion();
                        break;
                    case 5:
                        miRadio.cargarEstacion();
                        break;
                    case 6:
                        miRadio.apagarRadio();
                        break;
                    case 7:
                        System.out.println("Cerrando programa...");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese un numero.");
                sc.next(); 
            }
        }
    }
}