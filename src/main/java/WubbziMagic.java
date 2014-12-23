
public class WubbziMagic {

    public static void main(String[] args) {

        // Create an apple Fruit
        Fruit apple = new Fruit();

        apple.setColor("green");
        apple.setType("apple");
        apple.setSeedless(false);

        // Create a cherry Fruit
        Fruit cherry = new Fruit();

        cherry.setColor("red");
        cherry.setType("cherry");
        cherry.setSeedless(true);

        // Print out the apple and cherry (no list etc, ezmode)
        printTheFruit(apple);
        printTheFruit(cherry);

    }

    // Print out the Fruit object which is passed in by its name
    public static void printTheFruit(Fruit fruit) {
        System.out.println("Have a " + fruit.getColor() + " " + fruit.getType() + " " + seedlessString(fruit.getSeedless()) + ".");
    }

    // Return a string depending on whether the fruit is seedless or not
    public static String seedlessString(boolean seedless) {

        if (seedless) {
            return "with NO seeds";
        }
        else {
            return "with seeds";
        }
    }
}
