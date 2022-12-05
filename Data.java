import java.util.Random;

public class Data {
    
    private final int MAX_NUMBER = 999;
    private final int MAX_C = 3;
    private final int MAX_D = 3;

    int a, b, c, d;
    private long[] steps;

    public Data() {
        this.a = getRandom(MAX_NUMBER);
        this.b = getRandom(MAX_NUMBER);
        if (a > b) changeAB();
        this.c = getRandom(MAX_C);
        this.d = getRandom(MAX_D);
        steps = new long[b + 1];
    }

    private int getRandom(int max) {
        return new Random().nextInt(max) + 1;
    }

    private void changeAB() {
        int temp = a;
        a = b;
        b = temp;
    }

    public int[] getData() {
        return new int[] {a, b, c, d};
    }

    public long getResultCount() {
        steps = new long[b + 1];
        steps[a] = 1;
        for (int i = a + 1; i < b + 1; i++) {
            long count = 0;
            if (i % c == 0 && i / c >= a && steps[i / c] > 0) {
                count += steps[i / c];
            }
            if (i - d >= a && steps[i - d] > 0) {
                count += steps[i - d];
            }
            if (count > 0) {
                steps[i] = count;
            }
        }
        return steps[b];
    }

    public String getSteps() {
        int index = b;
        String result = " = " + b;
        while (index > a) {
            if (c > 1 && index % c == 0 && steps[index / c] > 0) {
                result = ", *" + c + result;
                index = index / c;
            } else if (steps[index - d] > 0) {
                result = ", +" + d + result;
                index = index - d;
            }
        }
        return a + result;
    }
}
