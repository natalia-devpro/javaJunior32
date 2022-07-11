package lesson2;

public class Main {
    public static void main(String[] args) {
        /**
         *  У нас есть 3 стороны треугольника
         *  Напечатать на консоль какой это вид треугольника: разносторонний,
         *  равнобедренный или равносторонний
         */

        int a = 12;
        int b = 12;
        int c = 15;

        // управляющая конструкиця

        if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник!!!");
        } else if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник!!!");
        } else {
            System.out.println("Это равнобедренный треугольник!!!");
        }
    }
}
