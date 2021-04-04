package Java;

public class Homework02 {
    public static void main(String[] args) {
//1 Задать целочисленный массив, состоящий из элементов 0 и 1.
        //    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в
        //    принятом массиве 0 на 1, 1 на 0;
            int[] massive = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
            System.out.print("Первоначальный массив: ");
            for(int i = 0; i < massive.length; i++){
                System.out.print (massive[i]);
            }
            System.out.println("");
            System.out.print("Инвертированный массив: ");
            for(int i = 0; i < massive.length; i++)
                if(massive[i] == 1) {
                    massive[i] = 0;
                }else massive[i] = 1;
            for(int i = 0; i < massive.length; i++){
                System.out.print (massive[i]);
            }
        //2 Задать пустой целочисленный массив размером 8.
        // Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
        System.out.println("");
        int[] array = new int[8];
        int j = 1;
        int maxMass = array.length;
        for(int i = 0; i < maxMass; i++)
        System.out.print ("");
        for(int i = 0; i < maxMass; i++, j = j+3)
        {array[i] = j;
        }
        for(int i = 0; i < maxMass; i++)
        {
            System.out.print (array[i] + " ");
        }
        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,принимающий на вход
        // массив и умножающий числа меньше 6 на 2;
        System.out.println("");
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int maxMas = mas.length;
        for(int i = 0; i < maxMas; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        }
        for(int i = 0; i < maxMas; i++)
        {
            System.out.print (mas[i]+" ");
        }
        //4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
        System.out.println("");
        int [] mas2 = {35, 57, 34, 9};
        int max = mas2[0];
        int min = mas2[0];
        for(int i = 0; i != mas2.length; i ++){
            if(mas2[i] > max){
                max = mas2[i];
            }
            if(mas2[i] < min){
                min = mas2[i];
            }
        }
        System.out.println("Минимум:" + min + " Максимум:" + max);
        }
    }