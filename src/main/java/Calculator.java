public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean moreThan100(int a) {
        return a > 100;
    }

    public static String checkPersonThreshold(int numberOfPeople) {
        String tooManyPeople;
        if (numberOfPeople > 30) {
            tooManyPeople = "Zu viele Personen, sofort zurück";
        } else {
            tooManyPeople = "Maximale Personenanzahl nicht überschritten";
        }
        return tooManyPeople;
    }
}
