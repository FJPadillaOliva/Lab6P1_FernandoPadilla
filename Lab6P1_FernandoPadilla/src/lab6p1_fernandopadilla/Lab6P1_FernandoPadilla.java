
package lab6p1_fernandopadilla;

import java.util.*;

public class Lab6P1_FernandoPadilla {

    static Random random = new Random();
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("1.Suma de arreglos");
            System.out.println("2.Vocales y consonantes");
            System.out.println("3.Floor and Ceiling");
            System.out.println("4.Salida");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    int clases1,
                     clases2;
                    System.out.println("Ingrese la cantidad de clases del estudiante 1: ");
                    clases1 = read.nextInt();
                    System.out.println("Ingrese la cantidad de clases del estudiante 2: ");
                    clases2 = read.nextInt();
                    suma1(clases1);
                    suma2(clases2);
                    break;

                case 2:
                    String word;
                    System.out.println("Ingrese una cadena: ");
                    word = read.next();
                    vocales_consonantes(word);
                    break;

                case 3:
                    int size;
                    System.out.println("Ingrese el tamaño del arreglo: ");
                    size = read.nextInt();
                    impresion(MayoroMenor(llenado2(size)));
                    break;

                case 4:
                    opcion = 4;
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 4);

    }//fin main

    public static void impresion(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + array[i] + "]");
        }
    }

    public static int[] llenado2(int size) {
        int[] temp = new int[size];

        for (int i = 0; i < size; i++) {
            temp[i] = random.nextInt(1571) + 1000;
        }
        return temp;
    }

    public static int[] MayoroMenor(int[] array) {
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < result[1]) {
                result[1] = array[i];
            }
            if (array[i] > result[2]) {
                result[2] = array[i];
            }
        }
        return result;
    }

    public static int[] llenado(int size) {
        int[] temp = new int[size];

        for (int i = 0; i < size; i++) {
            temp[i] = random.nextInt(101);
        }
        return temp;
    }

    public static int[] suma1(int clases1) {
        int[] notas1 = new int[clases1];
        notas1 = llenado(clases1);
        for (int i = 0; i < clases1; i++) {
            notas1[i] += notas1[i + 1];
        }
        return notas1;
    }

    public static int[] suma2(int clases2) {
        int[] notas2 = new int[clases2];
        notas2 = llenado(clases2);
        for (int i = 0; i < clases2; i++) {
            notas2[i] += notas2[i + 1];
        }
        return notas2;
    }

    public static char[] vocales_consonantes(String str) {
        char[] p1 = new char[5];
        char[] p2 = new char[5];
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char cont = str.charAt(i);
            if (cont == 'a' || cont == 'A') {
                p1[i] = cont;
            }
            if (cont == 'e' || cont == 'E') {
                p1[i] = cont;
            }
            if (cont == 'i' || cont == 'I') {
                p1[i] = cont;
            }
            if (cont == 'o' || cont == 'O') {
                p1[i] = cont;
            }
            if (cont == 'u' || cont == 'U') {
                p1[i] = cont;
            } else {
                p2[i] = cont;
            }
            result[i] = p1[i];
        }
        return result;
    }

}//fin de clase
