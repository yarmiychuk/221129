public class Controller {

    public static void run() {
        Data data = new Data();
        View.showData(data.getData());
        if (data.a == data.b) {
            View.equals();
        } else {
            long count = data.getResultCount();
            if (count > 0) {
                View.showSteps(count, data.getSteps());
            } else {
                View.noWay();
            }
        }
    }
}
