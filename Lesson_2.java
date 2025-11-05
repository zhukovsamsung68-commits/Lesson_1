import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

        System.out.println(isSumBetween10And20(5, 10));
        System.out.println(isSumBetween10And20(2, 3));

        printSignOfNumber(5);
        printSignOfNumber(-7);
        printSignOfNumber(0);

        System.out.println(isNegative(-1));
        System.out.println(isNegative(0));

        printWordNTimes("Aston", 3);

        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2024));

        int[] flippedArray = flipArray(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
        System.out.println(Arrays.toString(flippedArray));

        int[] oneToHundred = fillArray();
        System.out.println(Arrays.toString(oneToHundred));

        int[] modified = multiplyIfLessThanSix(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        System.out.println(Arrays.toString(modified));

        fillDiagonalMatrix(5);

        int[] createdArray = createArray(5, 42);
        System.out.println(Arrays.toString(createdArray));
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = -5, b = 3;
        int sum = a + b;
        System.out.println(sum >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 10, b = 5;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    static void printSignOfNumber(int x) {
        System.out.println(x >= 0 ? "Число положительное" : "Число отрицательное");
    }

    static boolean isNegative(int x) {
        return x < 0;
    }

    static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int[] flipArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        return arr;
    }

    static int[] fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    static int[] multiplyIfLessThanSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    static void fillDiagonalMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
