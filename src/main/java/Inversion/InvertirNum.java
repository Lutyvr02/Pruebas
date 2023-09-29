package Inversion;

public class InvertirNum {
    public String invertirNumero(int numero) {
        if(numero>0){
        String numeroComoCadena = String.valueOf(numero);
        StringBuilder cadenaInvertida = new StringBuilder(numeroComoCadena);
        cadenaInvertida.reverse();
        return cadenaInvertida.toString();
        } else {
            return "Dato Incorrecto";
        }

    }
}