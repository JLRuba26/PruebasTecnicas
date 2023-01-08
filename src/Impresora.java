public class Impresora {

    public static void main(String[] args) {
        Impresora impresora = new Impresora();
        //Asigno el texto qe se enviara a evaluar
        String strTexto = "Gracias por tu compra candidato te esperamos pronto, tu orden generó $20 pesos de monedero";
        //Llamo a mi funcion, enviandole strTexto como parametro, el resultado lo almaceno en strRes
        String strRes = impresora.CalculadorCaracteres(strTexto);
        //Muestro el resultado por consola
        System.out.println(strRes);
    }

    private static String CalculadorCaracteres (String strTexto) {
        //Separo la cadena de texto por palabras y las guardo por separado en un arreglo
        String arrStrCadena[] = strTexto.split(" ");
        //strLineaAcoumalada lo utilizo para ir guardando palabra por palabra en el, con el fin de saber cuantos
        //carecteres se han sumado en el proceso
        String strLineaAcomulada = "";
        //strNuevoTexto lo utilizo para guardar las lineas de texto las cuales no superan los 20 caracteres
        String strNuevoTexto = "";
        /*El siguiente siclo cumple con las siguientes funciones:
        1.- Extrae cada palabra del arreglo arrStrCadena, la cual son guardadas en strPalabra para evaluarlas individualmente.
        2.- Sumo la cantitdad de caracteres de strPalabra y de strLineaAcomulada (Esta ultima variable se utiliza para
        ir guardando cada palabra del arreglo)
        3.- En base a la cantidad de caracteres que se van acomulando, se evalua si el total es inferior a 20 caracteres,
        para asi realizar un salto de linea en caso de que este si supere los 20 caracteres.
        */
        for (int i = 0; i < arrStrCadena.length; i++) {
            String strPalabra = arrStrCadena[i];
            int intLongitudPalabra = strLineaAcomulada.length() + strPalabra.length();
            //¿La cantidad de caracteres acomulados superan los 20 caracteres?
            if (intLongitudPalabra <= 20) {
                //Si no lo supera, guardo el contenido ya existente de strLineaAcomulada + la palabra del actal ciclo + un espacio
                strLineaAcomulada = strLineaAcomulada + strPalabra + " ";
            } else {
                /* Si sì supera los 20 caracteres, añado el texto existente en strNuevoTexto + el texto en strLineaAcomulado
                retirando el espacio en blanco final + un salto de linea */
                strNuevoTexto = strNuevoTexto + strLineaAcomulada.trim() + "\n";
                /*aqui guardo la palabra del actual ciclo, sustituyendo al texto que tenia anteriormente, para asi
                evaluar una nueva linea de texto*/
                strLineaAcomulada = strPalabra + " ";
            }
        }
        //aqui verifico que strLineaAcomulada se encentre con texto, para asi añadir el la ultima linea de texto al resultado final
        if(strLineaAcomulada.length() > 0){
            strNuevoTexto = strNuevoTexto + strLineaAcomulada.trim() + "\n";
        }
        System.out.println("========================Verificacion");
        //En el sigiente siclo muestro cuantos caracteres shay por ada linea almacenada en strNuevoTexto a modo de verificacion.
        String pr[] = strNuevoTexto.split("\n");
        for (int i = 0; i < pr.length; i++){
            String strPalabra = pr[i];
            System.out.println(strPalabra + " [" + strPalabra.length() + "]");
        }
        System.out.println("========================Resultado");
        return strNuevoTexto;
    }
}

