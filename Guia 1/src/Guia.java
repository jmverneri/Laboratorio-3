import javax.sound.midi.SysexMessage;
import javax.swing.*;
import java.security.DrbgParameters;
import java.util.Random;
import java.util.Scanner;

import java.lang.*;

public class Guia {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int exercise;

        do {
            System.out.println("Ingresa el numero del ejercicio");
            exercise = menu.nextInt();

            switch (exercise) {
                case 0:
                    System.out.println("Saliendo");
                    break;

                case 1:
                    System.out.println("Ejercicio numero 1");
                    ej1();
                    break;

                case 2:
                    System.out.println("Ejercicio 2");
                    ej2();
                    break;

                case 3:
                    System.out.println("Ejercicio 3");
                    ej3();
                    break;

                case 4:
                    System.out.println("Ejercicio 4");
                    ej4();
                    break;

                case 5:
                    System.out.println("Ejercicio 5");
                    ej5();
                    break;

                case 6:
                    System.out.println("Ejercicio 6");
                    ej6();
                    break;

                case 7:
                    System.out.println("Ejercicio 7");
                    ej7();
                    break;

                case 8:
                    System.out.println("Ejercicio 8");
                    ej8();
                    break;

                case 9:
                    System.out.println("Ejercicio 9");
                    ej9();
                    break;

                case 10:
                    System.out.println("Ejercicio 10");
                    ej10();
                    break;

                case 11:
                    System.out.println("Ejercicio 11");
                    ej11();
                    break;

                case 12:
                    System.out.println("Ejercicio 12");
                    ej12();
                    break;

                case 13:
                    System.out.println("Ejercicio 13");
                    ej13();
                    break;

                case 14:
                    System.out.println("Ejercicio 14");
                    ej14();
                    break;

                case 15:
                    System.out.println("Ejercicio 15");
                    ej15();
                    break;

                case 16:
                    System.out.println("Ejercicio 16");
                    ej16();
                    break;

                case 17:
                    System.out.println("Ejercicio 17");
                    ej17();
                    break;

                case 18:
                    System.out.println("Ejercicio 18");
                    ej18();
                    break;
            }
        } while (exercise != 0);
    }

    private static void ej1(){
        ///Punto 1
        int N = 10;
        double A = 15.98;
        char C = 'a';

        System.out.println(N);
        System.out.println(A);
        System.out.println(C);

        System.out.println(String.format("N: %s A: %s C: %s", N, A, C));
        System.out.println(String.format("N+A: %s", N+A));
        System.out.println(String.format("A-N: %s", A-N));
        System.out.println(String.format("C: %s", Integer.valueOf(C)));
    }
    private static void ej2(){
        ///Punto 2
        int x = 1, y = 4;
        double n = 4.5, m = 9.88;

        System.out.println(String.format("x+y: %s",x+y));
        System.out.println(String.format("m/n: %s", m/n));
    }
    private static void ej3(){
        ///Punto 3
        int N= 10;

        System.out.println(String.format("N: %s",N));
        System.out.println(String.format("%s + 72: %s", N, N+72));
        System.out.println(String.format("%s - 3: %s", N, N-3));
        System.out.println(String.format("%s * 2: %s",N, N*2));
    }
    private static void ej4(){
        ///Punto 4
        int A=1, B=2, C=3, D=4, aux;

        aux= B;
        System.out.println(String.format("B: %s toma el valor de C: %s",B, B=C));
        System.out.println(String.format("C: %s toma el valor de A: %s",C, C=A));
        System.out.println(String.format("A: %s toma el valor de D: %s",A, A=D));
        System.out.println(String.format("D: %s toma el valor de B: %s",D, D=aux));
    }
    private static void ej5(){
        int A= (int) (Math.random() * 1000);

        if(A%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
        /*
        String paridad = "par";
        if (A % 2 != 0) {
            paridad = "impar";
        }

        salida.println(String.format("A: %s es un número %s", A, paridad));

         */
    }
    private static void ej6(){
        Random random= new Random();
        int B= random.nextInt(200) - 100;
        String ans;

        if(B>=0)
        {
            ans= "positivo";
        }else
        {
            ans= "negativo";
        }
        System.out.println(String.format("El numero %s es %s", B,ans));
    }
    private static void ej7(){
        Random random= new Random();
        int C= random.nextInt(20000) - 10000;

        String positive= (C>=0) ? "positivo": "negativo";
        String pair= (C%2==0) ? "par" : "impar";
        String multiple5= (C%5==0) ? "es multiplo de 5" : "no es multiplo de 5";
        String multiple10= (C%10==0) ? "es multiplo de 10" : "no es multiplo de 10";
        String higher= (C>100) ? "es mayor a 100" : "es menor a 100";

        System.out.println(String.format("El numero %s es %s, %s, %s, %s y %s", C, positive, pair, multiple5, multiple10, higher));
    }
    private static void ej8(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String name;
        name= scanner.nextLine();

        System.out.println(String.format("Hola %s!", name));
    }
    private static void ej9(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int number= scan.nextInt();

        System.out.println(String.format("El doble del numero %s es: %s", number, number*2));
        System.out.println(String.format("El triple del numero %s es: %s", number, number*3));
    }
    private static void ej10(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingresa los grados Faranheit");
        int far= scan.nextInt();
        double grades= (far-32)*0.55;
        System.out.println(String.format("%s grados Faranheit equivalen a %s grados centigrados", far, grades));
    }
    private static void ej11(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingresa el radio");

        double radio= scan.nextDouble();
        double large= 2 * radio * Math.PI;
        double circumference= Math.pow(radio, 2) * Math.PI;

        System.out.println(String.format("El radio es %s, el largo: %s y la circunferencia %s", radio, large, circumference));
    }
    private static void ej12(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingresa los km a convertir");
        double km= scan.nextDouble();
        double miles= km * 0.62137;

        System.out.println(String.format("%s kilometros equivalen a %s millas", km, miles));
    }
    private static void ej13(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingresa el tamaño del primer cateto");
        double hick1= scan.nextDouble();

        System.out.println("Ingresa el tamaño del segundo cateto");
        double hick2= scan.nextDouble();

        double hypotenuse= Math.pow(hick1, 2) + Math.pow(hick2, 2);
        System.out.println(String.format("El largo de la hipotenusa es %s", hypotenuse));
    }
    private static void ej14(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingresa el radio");
        double radio= scan.nextDouble();

        double volume= 4/3 * Math.PI * Math.pow(radio, 3);
        System.out.println(String.format("El volumen de la esfera es de %s", volume));

        ///No da correcto el resultado
    }
    private static void ej15(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingresa un lado");
        double side1= scan.nextDouble();

        System.out.println("Ingresa otro lado");
        double side2= scan.nextDouble();

        System.out.println("Ingresa el ultimo lado");
        double side3= scan.nextDouble();

        double P= (side1 + side2 + side3)/2;
        double area = Math.sqrt((P * (P - side1) * (P - side2) * (P - side3)));

        System.out.println(String.format("El area del triangulo es %s", area));
    }
    private static void ej16(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingresa un numero de 3 cifras");
        int n= scan.nextInt();

        String number = String.valueOf(n);
        char[] digits = number.toCharArray();
        System.out.println(digits[0] + " " + digits[1] + " " + digits[2]);
    }
    private static void ej17(){
        Scanner scan= new Scanner(System.in);

        System.out.println("Ingresa un numero entero de 5 cifras: ");
        int numero = scan.nextInt();

        int[] digitos = new int[5];
        int count = 0;

        while (numero > 0) {
            digitos[count] = numero % 10;
            numero = numero / 10;
            count++;
        }

        for (int i = digitos.length - 1; i >= 0; i--) {
            if (digitos[i] % 2 != 0) {
                System.out.println(digitos[i]);
            }
        }
    }
    private static void ej18(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingresa la hora: ");
        int H= scan.nextInt();

        System.out.println("Ingresa los minutos: ");
        int M= scan.nextInt();

        System.out.println("Ingresa los segundos: ");
        int S= scan.nextInt();

        boolean format= false;

        if(H>=0 && H<=24){
            if(M>=0 && M<=60){
                if(S>=0 && S<=60){
                    format= true;
                }
            }
        }
        if(format){
            System.out.println(String.format("La hora ingresada %s : %s : %s es valida", H, M, S));
        }else {
            System.out.println("La hora es invalida");
        }
    }
}
