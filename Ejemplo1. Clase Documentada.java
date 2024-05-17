/*
 * This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
	
	Clase ControlData que contiene métodos estáticos para utilizar en el 
	control de tipos de datos y control de rango

 */
 
package gal.teis.libreriadam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author A.F / E.F.
 * @version 1.0
 * 
 * Contiene distintos métodos estáticos que validan
 * el tipo de datos que se lee mediante Scanner
 */
public class ControlData {

    /**
     * Controla la introducción correcta de una vble variable 
	 * tipo byte utilizando una variable Scanner que se pasa por parámetro
     *
     * @param sc Tipo Scanner
     * @return Tipo byte - valor de tipo byte introducido por teclado
     */
    public static byte lerByte(Scanner sc) {
        byte valor = 0;
        boolean repetir = true;

        do {
            if (sc.hasNextByte()) {
                valor = sc.nextByte();
                repetir = false;
            } else {
                System.out.println("\tERRO: debe introducir un valor numérico. "
                        + "\n\t\tVolva a introducir un número: \n");
            }
            sc.nextLine();
        } while (repetir);

        return valor;
    }

    /**
     * Controla a introdución correcta dunha variable tipo byte utilizando unha
     * variable Scanner que se pasa por parámetro
     *
     * @param sc Tipo Scanner
     * @return valor Tipo short - valor de tipo short introducido por teclado
     */
    public static short lerShort(Scanner sc) {
        short valor = 0;
        boolean repetir = true;

        do {
            if (sc.hasNextShort()) {
                valor = sc.nextShort();
                repetir = false;
            } else {
                System.out.println("\tERRO: debe introducir un valor numérico. "
                        + "\n\t\tVolva a introducir un número: ");
            }
            sc.nextLine();
        } while (repetir);

        return valor;
    }

    /**
     * Controla a introdución correcta dunha variable tipo byte utilizando unha
     * variable Scanner que se pasa por parámetro
     *
     * @param sc Tipo Scanner
     * @return Tipo int - valor de tipo int introducido por teclado
     */
    public static int lerInt(Scanner sc) {
        int valor = 0;
        boolean repetir = true;

        do {
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                repetir = false;
            } else {
                System.out.println("\tERRO: debe introducir un valor numérico. "
                        + "\n\t\tVolva a introducir un número: ");
            }
            sc.nextLine();
        } while (repetir);

        return valor;
    }

    /**
     * Controla a introdución correcta dunha variable tipo byte utilizando unha
     * variable Scanner que se pasa por parámetro
     *
     * @param sc Tipo Scanner
     * @return Tipo long - valor de tipo long introducido por teclado
     */
    public static long lerLong(Scanner sc) {
        long valor = 0;
        boolean repetir = true;

        do {
            if (sc.hasNextLong()) {
                valor = sc.nextLong();
                repetir = false;
            } else {
                System.out.println("\tERRO: debe introducir un valor numérico. "
                        + "\n\t\tVolva a introducir un número: ");
            }
            sc.nextLine();
        } while (repetir);

        return valor;
    }

    /**
     * Controla a introdución correcta dunha variable tipo byte utilizando unha
     * variable Scanner que se pasa por parámetro
     *
     * @param sc Tipo Scanner
     * @return Tipo float - valor de tipo float introducido por teclado
     */
    public static float lerFloat(Scanner sc) {
        float valor = 0;
        boolean repetir = true;

        do {
            if (sc.hasNextFloat()) {
                valor = sc.nextFloat();
                repetir = false;
            } else {
                System.out.println("\tERRO: debe introducir un valor decimal. "
                        + "\n\t\tVolva a introducir un número: ");
            }
            sc.nextLine();
        } while (repetir);

        return valor;
    }

    /**
     * Controla a introdución correcta dunha variable tipo byte utilizando unha
     * variable Scanner que se pasa por parámetro
     *
     * @param sc Tipo Scanner
     * @return Tipo double - valor de tipo double introducido por teclado
     */
    public static double lerDouble(Scanner sc) {
        double valor = 0;
        boolean repetir = true;

        do {
            if (sc.hasNextDouble()) {
                valor = sc.nextDouble();
                repetir = false;
            } else {
                System.out.println("\tERRO: debe introducir un valor decimal. "
                        + "\n\t\tVolva a introducir un número: ");
            }
            sc.nextLine();
        } while (repetir);

        return valor;
    }

    /**
     * Controla a introdución correcta dunha variable tipo byte utilizando unha
     * variable Scanner que se pasa por parámetro
     *
     * @param sc Tipo Scanner
     * @return Tipo boolean - valor de tipo boolean introducido por teclado
     */
    public static boolean lerBoolean(Scanner sc) {
        boolean valor = false;
        boolean repetir = true;

        do {
            if (sc.hasNextBoolean()) {
                valor = sc.nextBoolean();
                repetir = false;
            } else {
                System.out.println("\tERRO: debe introducir un valor booleano. "
                        + "\n\t\tVolva a introducir un booleano: ");
            }
            sc.nextLine();
        } while (repetir);

        return valor;
    }

    /**
     * Controla a introdución correcta dunha variable tipo byte utilizando unha
     * variable Scanner que se pasa por parámetro
     *
     * @param sc Tipo Scanner
     * @return Tipo String - valor de tipo String introducido por teclado
     */
    public static String lerString(Scanner sc) {
        String resultado = null;

        do {
            resultado = sc.nextLine();
        } while (resultado.isEmpty());

        return resultado;
    }

    /**
     * Controla a introdución correcta dunha variable tipo byte utilizando unha
     * variable Scanner que se pasa por parámetro
     *
     * @param sc Tipo Scanner
     * @return Tipo char - valor de tipo char introducido por teclado
     */
    public static char lerChar(Scanner sc) {
        String resultado = null;

        do {
            resultado = sc.nextLine();
        } while (resultado.isEmpty());

        return resultado.charAt(0);
    }

    /**
     * Controla a introdución correcta dunha variable tipo byte utilizando unha
     * variable Scanner que se pasa por parámetro
     *
     * @param sc Tipo Scanner
     * @return Tipo char - valor de la pimera letra que se introduce por teclado
     */
    public static char lerLetra(Scanner sc) {
        char caracter = '\0';

        do {
            caracter = (sc.nextLine()).charAt(0);
        } while (!Character.isLetter(caracter));

        return caracter;
    }

    /**
     * Controla a introdución correcta dunha variable tipo byte utilizando unha
     * variable Scanner que se pasa por parámetro
     *
     * @param sc Tipo Scanner
     * @return Tipo String - valor de tipo String introducido por teclado
     */
    public static String lerNome(Scanner sc) {
        String nome = null;
        boolean repetir = true;

        do {
            nome = sc.nextLine();
            if (nome.isEmpty() || !nome.toUpperCase().matches("[A-ZÁÉÍÓÚÜÑ\\-\\s]*")) {
                System.out.println("\tERRO: debe introducir algún nome válido "
                        + "\n\t\tVolva a introducir: ");
            } else {
                repetir = false;
            }
        } while (repetir);

        return nome;
    }

    /**
     * Controla a introdución correcta dunha variable tipo byte utilizando unha
     * variable Scanner que se pasa por parámetro
     *
     * @param sc Tipo Scanner
     * @return Tipo boolean - valor de tipo boolean introducido por teclado
     */
    public static String lerCodigo(Scanner sc) {
        String codigo = null;
        boolean repetir = true;

        do {
            codigo = sc.nextLine();
            Pattern pat = Pattern.compile("[V][AEIOU][a-z]{3,4}([4-7]{2}|[8])");
            Matcher mat = pat.matcher(codigo);

            if (codigo.isEmpty() || !mat.matches()) {
                System.out.println("El formato del código:\n"
                        + "- Comenzará por la letra V seguida de una vocal en mayúsculas.\n"
                        + "- A continuación, tres o cuatro letras minúsculas.\n"
                        + "- Finaliza, o condos números del 4 al 7, o bien con el número 8.\n");
            } else {
                repetir = false;
            }
        } while (repetir);

        return codigo;
    }
}
