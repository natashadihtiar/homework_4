package natashadihtiar;
import java.io.Console;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    private static void Example_1() {
        System.out.println("\nПример 1\n");

        int [] array = new int[35];

        int sum = 0;

        for (int i =0; i<array.length; i++) {

            array[i] = ((int)(Math.random() * 10000));
            sum = sum + array[i];

            System.out.println(array[i]);

        }

        if (sum > 99999 && sum<1000000)
        System.out.println("\n Число " + sum + "  шестизначное");

        else
            System.out.println("\n Число " + sum + " не шестизначное");
    }

    private static void Example_2() {
        System.out.println("\nПример 2\n");
        Scanner scanner = new Scanner(System.in);
        int [] array = new int [10];
        int sum = 0;
        int score;

        for (int i = 0; i < array.length; i++) {

            System.out.println("Введите баллы " + (i + 1) + ": ");
            sum = sum + (array[i] = scanner.nextInt());

        }

        System.out.println("Введите количество баллов, необхлдимых для выхода в следующий этап:  " );
        score = scanner.nextInt();

        if (sum>score)
            System.out.println("Позравляем, Вы вышли в следующий этап соревнований");

            else
            System.out.println("Вы  не вышли в следующий этап соревнований");
        }

    private static void Example_3() {
        System.out.println("\nПример 3\n");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[18];
        int sum1 = 0, sum2=0, sum3=0;
        for (int i = 0; i < 7; i++) {
            System.out.println("\nВведите баллы по обязательной программы" + (i + 1) + ": ");
            sum1 = sum1 + (array[i] = scanner.nextInt());
        }
        System.out.println("\nСумма балов по обязательной программе: " + sum1);


        for (int i = 7; i < 13; i++) {
            System.out.println("\nВведите баллы по короткой программе " + (i + 1) + ": ");
            sum2 = sum2 + (array[i] = scanner.nextInt());
        }
        System.out.println("\nСумма баллов по короткой программе: " + sum2);

        for (int i = 13; i < 18; i++) {
            System.out.println("\nВведите баллы по произвольной программе " + (i + 1) + ": ");
            sum3 = sum3 + (array[i] = scanner.nextInt());
        }
        System.out.println("\nСумма баллов по произвольной програме: " + sum3);

        if(sum1>sum2 && sum1>sum3)
            System.out.println("\nЛучший результат по обязательной программе с суммой: " + sum1);

        else if (sum2>sum1 && sum2>sum3)
            System.out.println("\nЛучший результат по короткой программе с суммой: " + sum2);

        else
            System.out.println("\nЛучший результат ппроизвольной программе с суммой:" + sum3);
    }


    private static void Example_4() {
        System.out.println("\nПример 4\n");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[8];

        for (int i =0; i<array.length; i++) {

            array[i] = ((int)(Math.random() * 10));
            System.out.println(array[i]);

        }

    boolean b = true;
    for (int P = 2; P <= array.length; P++) {
        for (int i = 2; i < P; i++) {
            if (P % i == 0) {
                b = false;
                break;
            }
        }
        if (b) System.out.println("\n Простое число: " + P);
        else b = true;
    }
}


    private static void Example_6() {
        System.out.println("\nПример 5(a)\n");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Введите неповторяющиеся элементы массива: ");
        for (int i = 0; i < array.length; i++) {

            array[i] = scanner.nextInt();
        } Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {

            array[0] = 0;}
        System.out.println(Arrays.toString(array));
        }

        private static void Example_6_b() {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
            System.out.println("Введите неповторяющиеся элементы массива: ");
        for (int i = 0; i < array.length; i++) {

            array[i] = scanner.nextInt();
        }
        System.out.println("\nПример 5(b)\n");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {

            array[4] = 0;}
            System.out.println(Arrays.toString(array));

    }


    private static void Example_8() {
    System.out.println("\nПример 6\n");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int k=0;
        System.out.println("Введите  элементы массива: ");
        for (int i = 0; i < array.length; i++) {

            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0){
                array[i] = 0;

            }}System.out.println("Все отрицательные числа заменены нулями" + Arrays.toString(array));}


        private static void Example_8_b() {
            System.out.println("\nПример 6(b)\n");
            Scanner scanner = new Scanner(System.in);
            int[] array = new int[5];
            int k=0;
            System.out.println("Введите  элементы массива: ");
            for (int i = 0; i < array.length; i++) {

                array[i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(array));System.out.println("Vvedite chislo: ");
        k = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {

            if (array[i] > k ){
                array[i] = 0;

            }}System.out.println("Все числа большие заданного заменены нулями" + Arrays.toString(array));
    }


    private static void Example_8_c() {
        System.out.println("\nПример 6(c)\n");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int k1=0, k2=0;
        System.out.println("Введите  элементы массива: ");
        for (int i = 0; i < array.length; i++) {

            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Vvedite chislo k1 (k1<k2):  ");
        k1 = scanner.nextInt();
        System.out.println("Vvedite chislo k2 :  ");
        k2 = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {

            if (i>=k1 && i<=k2 ){
                array[i] = 0;

            }}System.out.println("Все числа, находящиеся между заданными заменены нулями" + Arrays.toString(array));
    }

    private static void Example_9() {
        System.out.println("\nПример 6(c)\n");

        int[] array = new int[10];

        for (int index = 1; index <= array.length; index++) {
            array[index - 1] = index;
        }

        System.out.println("Before: " + Arrays.toString(array));

        int newIndex = 0;
        int[] resultArray = new int[10];
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 3 != 0) {
                resultArray[newIndex++] = array[index];
            }

        }
        resultArray = Arrays.copyOf(resultArray, newIndex);

        System.out.println("After delete: " + Arrays.toString(resultArray));
    }




    public static void main(String[] args) {

        Example_1();
        Example_2();
        Example_3();
        Example_4();
       Example_6();
       Example_6_b();
       Example_8();
       Example_8_b();
       Example_8_c();
       Example_9();

      }}