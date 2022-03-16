interface Food {
    public void printFlavor();
}
class Pepper extends Food {
    public void printFlavor() { System.out.println("spicy"); }
}
public class Lunch {
    public static void main(String[] args) {
        Food pepper = new Pepper();
        pepper.printFlavor();
    }
}