public class Main {
    public static void main(String[] args) {
        String name = "David";
        String output = "Hello " + name + "!";
        System.out.println(output);

        ifStatementCode();

        System.out.println("End of Program");
    }

    public static void ifStatementCode() {
        int x = 107;
        if (x < 10) {
            System.out.println("x less than 10");
        } else if (x < 20) {
            System.out.println("x greater than 10 less than 20");
        } else if (x <= 100) {
            System.out.println("x greater than 20 less than 101");
        } else {
            System.out.println("x greater than 100");
        }
        String[] animals = {"cat", "cat", "dog", "tortoise"};

        for (int i = 0; i < animals.length; i++) {

            int catNumber = 0;
            int dogNumber = 0;
            int otherNumber = 0;

            if (animals[i] == "cat") {
                catNumber++;
            } else if (animals[i] == "dog") {
                dogNumber++;
            } else {
                otherNumber++;
            }

            System.out.println("num cats " + catNumber);
            System.out.println("num dogs " + dogNumber);
            System.out.println("num otherAnimals " + otherNumber);
        }
    }
}