package Java;

public class Homework01 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        float result = myMath(1,2,8,4);
        System.out.println(result);
        System.out.println("Задание 2");
        boolean result2 = myMath2(5,10);
        System.out.println(result2);
        System.out.println("Задание 3");
        myMath3(0);
        System.out.println("Задание 4");
        myMath4("Максим");
    }
    //Написать метод вычисляющий выражение a * (b + (c / d)) возвращающий результат с плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода;
    public static float myMath(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    //Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean myMath2(int e, int f) {
        int sum = e + f;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
    //Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
    public static void myMath3(int g) {

        if (g >= 0) System.out.println("Число " + g + " положительное");
        else System.out.println("Число " + g + " отрицательное");
    }
    //Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вернуть приветственное сообщение «Привет, переданное_имя!»
    public static void myMath4(String name) {
        System.out.println("Привет, " + name + "!");
    }
}
