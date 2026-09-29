public static void main(String[] args) {

    /* ex1: Declara una variable de tipo byte con el valor 100 y utiliza una estructura if para comprobar si es mayor de 50. Si lo es, imprime un mensaje por consola. */

    boolean res1 = ex1((byte) 100);
    System.out.println("ex1 : " + res1);

    /* ex2: Declara una variable de tipo float para almacenar el precio de un producto (p. ej. 19.99f) y calcula el IVA del 21% guardándolo en otra variable float. Muestra el total por pantalla. */

    float res2 = ex2((float) 19.99f);
    System.out.println("ex2 :" + res2);


    /* ex3: Utiliza los operadores a nivel de bit & y == para comprobar si un número entero (int) es par o impar e imprime el resultado. */
    boolean res3 = ex3((int) 2);
    System.out.println("ex3 :" + res3);

    /* ex4: Declara una variable de tipo double con valor 9.99 y realiza un casting explícito a int. Imprime el resultado antes y después del casting para observar qué ocurre con los decimales. */
    ex4((double) 9.99);

    /* ex5: Declara una variable String con el texto "125" y conviértela a un tipo int usando Integer.parseInt(). A continuación, súmale 5 e imprime el resultado final. */
    int res5 = ex5("125");
    System.out.println("ex5 : " + res5);

    /* ex6: Usa Scanner para pedir por teclado el nombre (String) y la edad (int) del usuario. Utiliza la mejor práctica vista en teoría (leer la línea entera con nextLine() y convertir con Integer.parseInt) para evitar el problema del salto de línea. */
    ex6();

    /* ex7: Crea dos variables enteras int a = 12 (0b1100) e int b = 10 (0b1010). Aplica los operadores a nivel de bit AND (&), OR (|) y XOR (^) entre ambas e imprime los tres resultados. */
    ex7(12, 10);

    /* ex8: Pide un valor decimal por teclado y muéstralo por consola utilizando System.out.printf con el especificador %.2f para redondearlo a exactamente dos decimales. */
    ex8();


    /* ex9: Declara dos variables int x = 5 e int y = 5. Realiza un System.out.println(x++) y un System.out.println(++y) para comprobar en la práctica la diferencia entre post-incremento y pre-incremento. */
    ex9(5, 5);

    /* ex10: Utiliza la función String.format() para generar una cadena de texto con formato (que incluya un nombre %s y un entero alineado/rellenado con ceros %05d) y guárdala en una variable String antes de imprimirla. */
    ex10();

}

private static void ex10() {
    String p = "ignacio";
    int precio = 11;

    String linea = String.format("producto: %s | codigo: %05d", p, precio);
    System.out.println(linea);
}

private static void ex9(int x, int y) {
    System.out.println("x" + x++);
    System.out.println("y" + ++y);
}

private static void ex8() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("double: ");
    double num = Double.parseDouble(scanner.nextLine());
    System.out.printf("%.2f%n", num);
}

private static void ex7(int x, int x1) {
    int and = x & x1;
    int or = x | x1;
    int xor = x ^ x1;

    System.out.println("ex7: " + and + " " + or + " " + xor);
}

private static void ex6() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nombre: ");
    String nom = scanner.nextLine();
    int edat = Integer.parseInt(scanner.nextLine());

    System.out.println("ex6 :" + nom + "edat :" + edat);

}

private static int ex5(String number) {
    int convertido = Integer.parseInt(number);
    convertido += 5;

    return convertido;

}

private static void ex4(double v) {
    System.out.println("sin casting :" + v);
    System.out.println("con casting :" + (int) v);
}

private static boolean ex3(int i) {

    if ((i & 1) == 0) {
        return true;
    }

    return false;
}

// 2
static float ex2(float v) {
    float iva = 21.0f;

    float masIVA = v * (1+(iva/100));

    return masIVA;
}

//1
static boolean ex1(byte x) {
    if (x > 50) {
        return true;
    }

    return false;
}



/* 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 el fickoing codigo */