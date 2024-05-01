import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

    public class Menu {
        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("Menú de opciones:");
                System.out.println("1. Cifrar archivo de texto");
                System.out.println("2. Descifrar archivo ");
                System.out.println("3. Salir");
                System.out.print("Ingrese su opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ha seleccionado la opción 1.");
                        // Leyendo el archivo a cifrar llamando al método lector

                        Scanner console = new Scanner(System.in);
                        System.out.println("Por favor ingrese la ruta del Archivo de texto ");
                        String rutaArchivo = console.nextLine();
                        String contenidoDeArchivo = LectorArchivo.leerArchivo(rutaArchivo);
                        System.out.println("Archivo leido:");
                        //Pidiendo la clave para encriptar
                        int clave;
                        System.out.println("Ingrese un digito del 1 al 9");
                        clave = console.nextInt();
                        System.out.println("La clave del crifrador es: " + clave);
                        // Llamada al método para cifrar archivo de texto.
                        String textoCifrado = Cifrador.cifrar(contenidoDeArchivo, clave);
                        // Mostrando archivo cifrado por pantalla.
                        System.out.println(textoCifrado);
                        // Llamada al método para guardar texto cifrado.
                        String rutaArchivoDestino = "cifrado.txt";
                        RegistroArchivo.guardarArchivo(textoCifrado, rutaArchivoDestino);
                        break;

                    case 2:
                        do {

                            System.out.println("Menú para Descifrar archivo:");
                            System.out.println("1. Descifrado con clave");
                            System.out.println("2. Descifrado por fuerza bruta ");
                            System.out.println("3. Salir del menú");
                            System.out.print("Ingrese su opción: ");
                            opcion = scanner.nextInt();
                            switch (opcion) {
                                case 1:
                                    System.out.println("Ha elegido descifrado con clave.");
                                    // LLamada al método para descifrar con clave
                                    console = new Scanner(System.in);
                                    int claveDescifrar;
                                    System.out.println("Ingrese un digito del 1 al 9");
                                    claveDescifrar = console.nextInt();
                                    String textoCodificado = Files.readString(Path.of("cifrado.txt"));
                                    String textoOriginal = Descifrador.descifrar(textoCodificado, claveDescifrar);
                                    System.out.println(textoOriginal);
                                    break;
                                case 2:
                                    System.out.println("Ha selecciona decifrar por prueba y error");
                                    // LLamada al método descifrarPorPruebaYError
                                    DescifradorPruebaYError descifradorPruebaYError = new DescifradorPruebaYError();
                                    textoCifrado = Files.readString(Path.of("cifrado.txt"));
                                    descifradorPruebaYError.descifrarPorPruebaYError(textoCifrado);
                                    break;
                                case 3:
                                    System.out.println("Salió exitosamente");
                                    break;
                                default:
                                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                                    break;
                            }
                        }while (opcion !=3);

                    case 3:

                        System.out.println("Ha salido del programa exitosamente.");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        break;
                }
            } while (opcion != 3) ;

            scanner.close();
        }
    }
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


