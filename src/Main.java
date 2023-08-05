public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("task1:");

        int[] arr = generateRandomArray();

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("task2:");

        int[] arr = generateRandomArray();

        int max = 100_000;
        int min = 200_000;
        for (int i : arr) {
            if (i > max)
                max = i;

            if (i < min)
                min = i;

        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        System.out.println("task3:");

        int[] arr = generateRandomArray();

        float sum = 0;
        for (int i : arr) {
            sum += i;
        }
        float result = sum / arr.length;

        System.out.println("Средняя сумма трат за месяц составила " + result + " рублей");
    }

    public static void task4() {
        System.out.println("task4:");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}