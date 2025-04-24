package dia01;

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Operadores Aritméticos:");
        System.out.println(a + b); // Soma: 13
        System.out.println(a - b); // Subtração: 7
        System.out.println(a * b); // Multiplicação: 30
        System.out.println(a / b); // Divisão inteira: 3 (pois 'a' e 'b' são int)
        System.out.println(a % b); // Resto da divisão: 1

        System.out.println();

        System.out.println("Operadores de Comparação:");
        System.out.println(a > b); // True
        System.out.println(a == b); // False
        System.out.println(a != b); // True

        System.out.println();

        System.out.println("Operadores Lógicos:");
        boolean x = true;
        boolean y = false;

        System.out.println(x && y); // AND: false
        System.out.println(x || y); // OR: true
        System.out.println(!x);     // NOT: false
    }
}