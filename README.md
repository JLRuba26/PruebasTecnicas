# PruebaTecnica
Pruebas solicitadas para demostración de conocimiento técnico para proceso de contratación en puesto de desarrollador movil

Las pruebas consisten 3 ejercicios, los cuales estas hechos cada uno en un archivo formato tipo .java. y dichos archivos se encuentrarn en la ruta:
PruebasTecnicas/src/

Para el desarrollo de estas pruebas hice uso del IDE IntelliJ IDEA Community Edition 2022.3.1®

Para ejecutar dichos archivos:

1.- Hacer Clone de este repositorio y abrirlo como nuevo proyecto en su IDE compatible de preferencia
2.- Ejecutar los archivos desde el consola, para ello es necesario que su equipo cuente con version de java superio a JDK 8,
debido a que se hacen usos de cierto elementos de Java que solo se encuentran de esta version hasta la mas actual.

Para ejecutar el script, tiene que ir a la ruta donde realizo la clonacion de este proyecto haciendo uso del simbolo de sistema
(Ejemplo: C:\Users\<su usuario>\Documents\WorkSpace\PruebasTecnicas\src>).
Una vez se encuentre en la carpeta raiz, ejecute sl siguiente comando "java <nombre del archivo que desea ejecutar>.java

Las pruebas son las siguientes:

################################# 1.- Estacionamiento.java ########################################

En esta prueba se solicito la solucion de el siguiente problema:
En un estacionamiento se cuenta con los siguientes precios
Por Hora = $10
Por Fracción = $6
Promoción = $8 la hora (La promoción aplica a partir de la tercera hora)

Ejemplo 2 Horas y media:  Total = $26
Ejemplo 3 Horas y 15 min:  Total = $30 (3 horas x $8 y la fracción $6)
Realizar una función o método que reciba como parámetro los minutos que estuvo en el estacionamiento y regrese el costo aplicando las reglas anteriores.

**En este mismo repositorio se encuentra un .jpg el cual es el diagrama de flujo hecho a mano para esta actividad
  
Para la ejecucion de este codigo es necesario que introduzca el tiempo total en minutos (Ejemplo: 250) sin hacer uso de ningun otro caracter mas alla de 
solo numeros enteros.


################################# 2.- Impresora.java ########################################
  
El problema: 
Realizar una función que reciba un texto que va ser impreso en una impresora de tickets, pero la impresora solo
imprime 20 caracteres por línea, debes de imprimir las líneas que resultan con un salto de línea al final y no debe cortar
ninguna palabra es decir si el siguiente corte queda en medio de una palabra debes buscar el espacio anterior inmediato.

Ejemplo:

Recibe: "Gracias por tu compra candidato te esperamos pronto, tu orden generó $20 pesos de monedero"

El resultado debe ser:
"Gracias por tu"
"compra candidato te"
"esperamos pronto, tu"
"orden generó $20"
"pesos de monedero"
  
En la ejecucion de este codigo, no es necesario la entrada de algun dato, ya que el texto que se solicita para realizar el ejercicio se establecio como constante. 
  
################################# 3.- Versionador.java ########################################
  
El problema:
Las versiones de software contienen la siguiente nomenclatura "1.10.1" donde cada valor de izquierda a derecha significa que es superior comparado por orden.
Hacer una función que reciba dos versiones con esa nomenclatura 1ro es la versión actual de la aplicación y el segundo la versión contra la que se va evaluar y regresa true si es superior o igual, o false si es inferior la versión actual.

Ejemplo: parametro1 actual de la app, parámetro 2 contra la que se va evaluar => Resultado
"1.10.1", "1.9.0" =>  true
"1.10.1", "1.10.1" => true
"1.10.1", "1.12.0" => false
"1.10.1", "1.10.2" => false
"1.10.1", "2.0.0" => false
  
En la ejecucion de este codigo, no es necesario la entrada de algun dato, ya que el texto que se solicita para realizar el ejercicio se establecio como constante.
  
Si presentan alguna duda en cuestion de como hice los ejercicios, puedes escribirme al correo: joserubenlopezrubalcaba@gmail.com :D
