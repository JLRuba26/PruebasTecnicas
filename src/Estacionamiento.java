import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Estacionamiento {
    public static void main(String[] args) throws IOException {
        Estacionamiento estacionamiento = new Estacionamiento();
        //Instancio el lector para ingresar los minutos por consola
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            //solicito por consola los minutos totales
            System.out.println("Introduzca los minutos totales: ");
            //convierto el valor introducido por consola a entero
            int intMin = Integer.parseInt(br.readLine());
            //Llamo a mi metodo y le envio el valor previamente obtenido
            estacionamiento.miEstacionamiento(intMin);
        }
        catch(Exception e){
            System.out.println("Por favor, introduzca numeros enteros");
        }
    }


    private void miEstacionamiento (int intMin){
        //Convierto la totalidad de minutos a horas y lo almaceno en intHrs
        int intHrs = intMin / 60;
        //Para calcular los minutos sobrantes, utilizo el siguiente operador taquigrafico para calcular el residuo y convertirlo a minutos
        intMin %= 60;
        //Instancio intPrecio para almacenar mas adelante el precio final
        int intPrecio;
        //Si las horas son mas de 3, aplica promocion
        if(intHrs >= 3){
            intPrecio = intHrs * 8;
        }
        //De lo contrario, aplica precio normal
        else{
            intPrecio = intHrs * 10;
        }
        //Evaluo si hay minutos restantes, si es asi, suma 6 al precio final
        if(intMin > 0){
            intPrecio = intPrecio + 6;
        }
        //Muestro por consola el tiempo total en horas y minutos junto con el precio a pagar
        System.out.println("Tiempo transcurrido: " + intHrs + ":" + intMin + " Precio a pagar: " + intPrecio);
    }

}
