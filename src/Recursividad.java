public class Recursividad{

    public int sumaNumeros(String texto) {

        if (texto.length() == 0) {
            return 0;
        }

        char letra = texto.charAt(0);

        if (Character.isDigit(letra)) {
            int numero = Character.getNumericValue(letra);
            return numero + sumaNumeros(texto.substring(1));
        } else {
            return sumaNumeros(texto.substring(1));
        }

    }

}
