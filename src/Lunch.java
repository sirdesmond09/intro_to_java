// class Food {
//     String flavor = "bland";
// }
// class Pepper extends Food {
//     String flavor = "spicy";
// }
// public class Lunch {
//     public static void main(String[] args) {
//         Pepper lunch = new Pepper();
//         System.out.println(lunch.flavor);
//     }
// }

// class Food {
//     Food() { System.out.println("bland"); }
// }
// class Pepper extends Food {
//     Pepper() { this("spicy"); }
//     Pepper(String flavor) { System.out.println(flavor); }
// }
// public class Lunch {
//     public static void main(String[] args) {
//         Food lunch = new Pepper();
//         int x = 3;
//         x = x++;
//         for (int i = 1; i < 10; i++) ;
// {
//     System.out.println("Hello");
// }
//     }
// }

// class Food {
//     Food() { printFlavor(); }
//     void printFlavor() { System.out.println("bland"); }
// }
// class Pepper extends Food {
//     void printFlavor() { System.out.println("spicy"); }
// }
// public class Lunch {
//     public static void main(String[] args) {
//         Food lunch = new Pepper();
//     }
// }

// class Food {
//     Food() { System.out.println("bland"); }
// }
// class Pepper extends Food {
//     Pepper() { System.out.println("spicy"); }
// }
// public class Lunch {
//     public static void main(String[] args) {
//         Food lunch = new Pepper();
//     }
// }

// class Food {
//     void flavor() { System.out.println("bland"); }
// }
// class Pepper extends Food {
//     void flavor() { System.out.println("spicy"); }
// }
// public class Lunch {
//     public static void main(String[] args) {
//         Food lunch = new Pepper();
//         lunch.flavor();
//     }
// }

// interface Food {
//     public void printFlavor();
// }
// class Pepper implements Food {
//     public void printFlavor() { System.out.println("spicy"); }
// }
// public class Lunch {
//     public static void main(String[] args) {
//         Food pepper = new Pepper();
//         pepper.printFlavor();
//     }
// }