
public class Descifrador {
    //Método para descifrar archivo de texto
    static DesplazadorDeLetras desplazadorDeLetras = new DesplazadorDeLetras();

    //Lamando el método desplazarLetrasDePalabras
    static String descifrar(String textoCifrado, int clave){
        String textoDescifrado = desplazadorDeLetras.desplazarLetrasDePalabras(textoCifrado, -clave);
        return textoDescifrado;
    }

}
