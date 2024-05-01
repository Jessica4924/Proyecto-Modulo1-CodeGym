import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class RegistroArchivo {
    // Método para guardar un archivo en el disco
    public static void guardarArchivo(String contenido, String rutaArchivo) {
        try {
            // Crear objeto File
            File archivo = new File(rutaArchivo);

            // Crear objeto FileOutputStream
            FileOutputStream contenidoAGuardar = new FileOutputStream(archivo);

            // Convertir el contenido en bytes y escribirlo en el archivo
            byte[] contenidoBytes = contenido.getBytes();
            contenidoAGuardar.write(contenidoBytes);

            // Cerrar el flujo de salida
            contenidoAGuardar.close();

            System.out.println("Archivo guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
