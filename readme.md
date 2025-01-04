#operadores de asignacion y variables

### Ejercicio 1

Crear un programa en Java que, dado un número entero de horas asignado a una variable ,
muestre el equivalente en semanas, días y horas.

### Ejemplo de salida:

cantidad de horas totales:1500

semanas:8

Dias: 6

Horas: 12

### codigo 

    package variables;

    public class Operadores {

    public static void main(String[] args) {

        // Declaración de la variable con el número total de horas

        int NumeroTotal = 450;

        // Cálculo de semanas

        int Semanas = NumeroTotal / 168;  // 1 semana tiene 168 horas

        int Dias = NumeroTotal % 168;  // Resto de horas que no completan una semana

        int DiasU = Dias / 24;  // Cálculo de días completos
        int Horas = NumeroTotal % 24;  // Resto de horas después de calcular días completos

        // Impresión de los resultados

        System.out.println("semanas: " + Semanas);  // Imprime el número de semanas

        System.out.println("Dias: " + DiasU);  // Imprime el número de días

        System.out.println("Horas: " + Horas);  // Imprime el número de horas restantes

       }

    }

### Ejercicio 2: operadores aritméticos con asignación compacta
1. Analizar el código a continuación y completar
la tabla correspondiente.
2. Luego, realizar la codificación para confirmar
que tus resultados son correctos.

### codigo

    System.out.println(“A”);

    int x = 5;

    int y=10;

    System.out.println(x);

    System.out.println(y);

    System.out.println(“B”);

    x +=y;

    y +=x;

    System.out.println(x);

    System.out.println(y);

    System.out.println(“C”); completar:

    x-=y ;

    y-=x ;

    System.out.println(x);

    System.out.println(y);

    System.out.println(“D”);

    x*=y;

    y*=x;

    System.out.println(x);

    System.out.println(y);

    System.out.println(“E”);

    x/=y ;

    y/=y ;

    System.out.println(x);

    System.out.println(y);



|-----------|  x  |  y  |
|-----------|-----------|-----------|
|  A  |5|10|
|  B  |15|25|
|  C  |-10|35|
|  D  |-350|-12250|
|  E  |0|1|

### Ejercicio 3: operadores aritmeticos con asignacion multiple(suma y resta)

1. Analizar el código a continuación y completar
la tabla correspondiente.
2. Luego, realizar la codificación para confirmar
que tus resultados son correctos.

### codigo

    System.out.println(“A”);

    int x = 5;

    int y=10;

    int suma=0;

    int resta=0;

    System.out.println(x);

    System.out.println(y);

    System.out.println(suma);

    System.out.println(resta);

    System.out.println(“B”);

    suma=x+y;

    resta=x-y;

    System.out.println(suma);

    System.out.println(resta);

    System.out.println(“C”);

    suma=x+x;

    resta=y-y;

    System.out.println(suma);

    System.out.println(resta);

    System.out.println(“D”);

    suma=x+y+x;

    resta=x-x-20;

    System.out.println(suma);

    System.out.println(“E”);

    suma=y+x+x;

    resta=-x-y-y;

    System.out.println(suma);

    System.out.println(resta);
    
    System.out.println(resta);

    System.out.println(“E”);

    suma=y+x+x;

    resta=-x-y-y;

    System.out.println(suma);

    System.out.println(resta);

    System.out.println(resta);


|-----------|  x  |  y  |suma|resta|

|-----------|-----------|-----------|
|  A  |5|10|0|0|
|  B  |5|10|15|-5|
|  C  |5|10|10|0|
|  D  |5|10|20|-20|
|  E  |5|10|20|-20|



### Ejercicio 4: operadores aritmeticos con asignacion multiple(producto y division)

1. Analizar el siguiente código y completar la
tabla correspondiente.
2. Luego, realizar la codificación para confirmar
que tus resultados son correctos.

    System.out.println(“A”);

    int x = 5;

    int y=10;

    int multi=1;

    int division=1;

    System.out.println(x);

    System.out.println(y);

    System.out.println(multi);

    System.out.println(division);

    System.out.println(“B”);

    multi=x*y;

    division=x/y;

    System.out.println(multi);

    System.out.println(division);

    System.out.println(“C”);

    multi=x*x;

    division=y/y;

    System.out.println(multi);

    System.out.println(division);

    System.out.println(“D”);

    multi=x*y*x;

    division=y/x;

    System.out.println(multi);

    System.out.println(division);

    System.out.println(“E”);

    multi=x*(-y);

    division=y/(-x);

    System.out.println(multi);

    System.out.println(division);


|-----------|  x  |  y  |MULTIPLICACION|DIVISION|

|-----------|-----------|-----------|
|  A  |5|10|1|1|
|  B  |5|10|50|0|
|  C  |5|10|25|1|
|  D  |5|10|250|2|
|  E  |5|10|-50|-2|




### Ejercicio 5: operador resto
1. Analizar el código que sigue y completar la
tabla correspondiente.
2. Luego, realizar la codificación para confirmar
que tus resultados son correctos.
	
    System.out.println(“A”);

    int n1=20;

    int n2=2;

    int n3=n1%n2;

    System.out.println(n1);

    System.out.println(n2);

    System.out.println(n3);

    System.out.println(“B”);

    n1=15;

    n2=2;

    n3=n1%n2;

    System.out.println(n1);

    System.out.println(n2);

    System.out.println(n3);

    System.out.println(“C”); completar:

    n1=3;

    n2=20;

    n3=n2%n1;

    System.out.println(n1);

    System.out.println(n2);

    System.out.println(n3);

    System.out.println(“D”);

    n1=3;

    n2=15;

    n3=n2%n1;

    System.out.println(n1);

    System.out.println(n2);

    System.out.println(n3);

|-----------|  N1  |  N2  |N3|

|-----------|-----------|-----------|
|  A  |20|2|0|
|  B  |15|2|1|
|  C  |3|20|2|
|  D  |3|15|0|



### Ejercicio 6 : resolver los enunciados desarrolando el codigo

1. Dados n1=5, n2=10, n3=20, informar:
 a) n1+n2

 b) n3-n1

 c) n1*n3

 d) n3/n4

### codigo

    public class Operaciones { 

       public static void main(String[] args) {

        // Declaración de las variables

        int N1 = 5;

        int N2 = 10;

        int N3 = 20;

        // Realización de las operaciones

        int suma = N1 + N2;  // Suma de N1 y N2

        int Resta = N3 - N1;  // Resta de N3 menos N1

        int Multi = N1 * N3;  // Multiplicación de N1 por N3

        int Divi = N3 / N2;  // División de N3 entre N2

        // Impresión de los resultados

        System.out.println("suma: " + suma);  // Imprime el resultado de la suma
        System.out.println("resta: " + Resta);  // Imprime el resultado de la resta

        System.out.println("multiplicacion: " + Multi);  // Imprime el resultado de la multiplicación

        System.out.println("division: " + Divi);  // Imprime el resultado de la división

        }

     }

### Ejercicio 7: resolver los enunciados desarrollando el codigo

1. Dados n1=10, n2=20 y n3=30, informar:

a) El total

b) El promedio

c) El resto entre n2 y n1

### codigo 

    package variables;

    public class OperacionesDos {

    public static void main(String[] args) {

        // Declaración de las variables
        int N4 = 10;

        int N5 = 20;

        int N6 = 30;

        // Cálculo del total, promedio y resto

        double Total = N4 + N5 + N6;  // Suma de los tres números

        double Promedio = Total / 3;  // Promedio de los números

        int Resto = N5 % N4;  // Resto de la división de N5 entre N4

        // Impresión de los resultados

        System.out.println("Total: " + Total);  // Imprime el total

        System.out.println("Promedio: " + Promedio);  // Imprime el promedio

        System.out.pr             

       }
 
    }
 

