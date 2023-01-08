import java.util.Arrays;

public class Versionador {

    public static void main(String[] args) {
        Versionador versionador = new Versionador();
        //Instancio tanto strVer1 que esta es la version base y strVer2 que es la lista de versiones a comparar con la base
        String strVer1 = "1.10.1";
        String[] strVer2 = {"1.9.0","1.10.1","1.12.0","1.10.2","2.0.0","1.8.10","11.2.10"};
        //Aqui utilizo un ciclo para comparar cada una de las versiones guradadas en strVer2
        for (int i = 0; i < Arrays.stream(strVer2).count(); i++){
            //Llamo a mi metodo en funcion de la cantidad de versiones que contiene strVer2, enviando las versiones a comparar como parametros
            boolean strResultado = comparadorDeVersiones(strVer1,strVer2[i]);
            //Muestro por consola el resultado de la comparacion
            System.out.println(strVer1 + ">=" + strVer2[i] + " = " + strResultado);
        }
    }

    public static boolean comparadorDeVersiones (String a , String b){
        //Separo las versiones en subversiones basandome en el punto decimal y guardandolas individualmente en un arreglo
        String strV1[] = a.split("\\.");
        String strV2[] = b.split("\\.");
        /*En este ciclo comparo cada subversion para validar cual es mayor, el fin del ciclo esta establecido
        en la cantidad de subversiones guardadas en strV1*/
        for (int i = 0 ; i < strV1.length; i++){
            //¿La subversion de strV1 es distinta de strV2?
            if(Integer.valueOf(strV1[i]) != Integer.valueOf(strV2[i])){
                //Si sì es distinta, ¿La subversion de strV1 es mayor a strV2?
                if(Integer.valueOf(strV1[i]) > Integer.valueOf(strV2[i])){
                    //Si es mayor, devuelve Verdadero demostrando que la version base es MAYOR a la comparada
                    return true;
                }else {
                    //No es mayor, devuelve Falso demostrando que la version base es MENOR a la comparada
                    return false;
                }
                //Si no es distinta, continua el ciclo para evaluar la siguiente subversion
            }
        }
        //Si todas las subversiones son iguales, devuelve Verdadero, demostrando que la version base es IGUAL a la comparada
        return true;
    }
}
