public class DescifradorPruebaYError {
    Descifrador descifrador = new Descifrador();
    String descifrarPorPruebaYError(String textoCifrado) {
        String posiblePalabraDescifrada = " por defecto";
        // Ciclo for para recorrer las posibles opciones de clave del 1 al 9
        for (int i = 1; i < 10; i++) {
            posiblePalabraDescifrada = descifrador.descifrar(textoCifrado, i);
            boolean existePalabraEnEspanol = existeAlgunaPalabraConocida(posiblePalabraDescifrada);
            if (existePalabraEnEspanol) {
                System.out.println("La clave es: " + i);
                System.out.println("El archivo descifrado es: " + posiblePalabraDescifrada);
            }
        }
        return posiblePalabraDescifrada;
    }
    static boolean existeAlgunaPalabraConocida(String archivoTexto) {
        String[] palabraEnEspanol = new String [5];
        palabraEnEspanol [0] = " el ";
        palabraEnEspanol [1] = " la ";
        palabraEnEspanol [2] = " con ";
        palabraEnEspanol [3] = " de ";
        palabraEnEspanol [4] = " en ";
        // Ciclo for para comparar estas palabras en las posibles palabras descifradas
        for(int i = 0; i < palabraEnEspanol.length; i++) {
            if(archivoTexto.contains(palabraEnEspanol[i])){
                return true;
            }
        }
        return false;
    }
}