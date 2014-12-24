
public class WubbziMagic {

    public static void main(String[] args) {

        // Create an apple Fruit
        Fruit apple = new Fruit();

        apple.setColor("green");
        apple.setType("apple");
        apple.setSeedless(false);
        apple.setSweet(false);


        // Create a cherry Fruit
        Fruit cherry = new Fruit();

        cherry.setColor("red");
        cherry.setType("cherry");
        cherry.setSeedless(true);
        cherry.setSweet(true);


        //Create a Lime Fruit
        Fruit lime = new Fruit();

        lime.setColor("green");
        lime.setType("lime");
        lime.setSeedless(true);
        lime.setSweet(false);

        //Create a Plum Fruit
        Fruit plum = new Fruit();

        plum.setColor("purple");
        plum.setType("plum");
        plum.setSeedless(false);
        plum.setSweet(true);





        // Print out the apple and cherry (no list etc, ezmode)
        printTheFruit(apple);
        printTheFruit(cherry);
        printTheFruit(lime);
        printTheFruit(plum);


    }

    // Print out the Fruit object which is passed in by its name
    public static void printTheFruit(Fruit fruit) {
        System.out.println("Have a " + fruit.getColor() + " " + fruit.getType() + " " + seedlessString(fruit.getSeedless()) + " " + sweetString(fruit.getSweet()));
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


    // Return a string that depends on whether the fruit is sweet or not
    public static String sweetString(boolean sweet) {

        if (sweet) {
            return "and a sweet flavor";
        }
        else {
            return "and a tart flavor";
        }
    }
}