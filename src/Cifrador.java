
public class Cifrador {
    //Método para encriptar letras
    //Creando el objeto desplazadorDeLetras
    static DesplazadorDeLetras desplazadorDeLetras = new DesplazadorDeLetras();

    // Llamando al método desplazarLetrasDePalabras
    static String cifrar(String textoSinCifrar, int clave) {
        String textocifrado = desplazadorDeLetras.desplazarLetrasDePalabras(textoSinCifrar, clave);
        return textocifrado;
    }


}

