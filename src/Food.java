// public class Food {
//     static int count;
//     private String flavor = "sweet";

//     Food(String s) { flavor = s; }
//     void setFlavor(String s) { flavor = s; }
//     String getFlavor() { return flavor; }

//     static public void main(String[] args) {
//         // Food pepper = new Food("spicy");
//         // Food chile = pepper;
//         // pepper.setFlavor("smoky");
//         // System.out.println(pepper == chile);
//         for (int i = 1; i > 10; i++)

//         {
//             System.out.println("La");
//         }
//     }
// }

public class Food {
    static int count;
    private String flavor = "sweet";
    Food(String s) { flavor = s; }
    void setFlavor(String s) { flavor = s; }
    String getFlavor() { return flavor; }
    static public void main(String[] args) {
        Food pepper = new Food("spicy");
        Food chile = new Food("spicy");
        System.out.println(pepper == chile);
    }
}