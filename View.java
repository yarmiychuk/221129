public class View {

    public static void showData(int[] data) {
        String message = "Исполнителю на вход поданы четыре числа:\n"
            + "a = " + data[0] + "\nb = " + data[1]
            + "\nc = *" + data[2] + " (k1)\nd = +" + data[3] + " (k2)";
        System.out.println(message);
    }

    public static void equals() {
        System.out.println("Число a равно числу b. Нет необходимости искать способы преобразования");
    }

    public static void errorData() {
        System.out.println("Нет возможных способов преобразования a в b");
    }

    public static void showSteps(long count, String steps) {
        System.out.println("Количество возможных преобразований a в b: " + count);
        System.out.println("Кратчайший вариант преобразования:\n" + steps);
    }
}
