// public class Main {
//     int x = 5;

//     // public static void main(String[] arg){
//     //     Main myObj = new Main();
//     //     Main myObj1 = new Main();
//     //     System.out.println(myObj.x);
//     //     System.out.println(myObj1.x);
//     // }
// }


// public class Main {
//     public void myMethod() {
//       System.out.println("Hello World");
//     }
  
//     public static void main(String[] args) {
//       Main myObj = new Main();
//       myObj.myMethod();
//     }
//   }


// public class Main{
//     String fname = "Tunde";
//     String lname = "Oyewo";
//     int age = 44;

//     public static void main(String[] ars){
//         Main myObj = new Main();
//         System.out.println("Name: " + myObj.fname + " " + myObj.lname);
//         System.out.println("Age: " + myObj.age);
//     }
// }

//You will often see Java programs that have either static or public attributes and methods.

//In the example above, we created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects:

// public class Main{
//     static void myMethod(){
//         System.out.println("Hello Friends!");
//     }

//     public static void main(String[] arg){
//         myMethod();
//     }
// }


public class Main {
    // Static method
    static void myStaticMethod() {
      System.out.println("Static methods can be called without creating objects");
    }
  
    // Public method
    public void myPublicMethod() {
      System.out.println("Public methods must be called by creating objects");
    }
  
    // Main method
    public static void main(String[] args) {
      myStaticMethod(); // Call the static method
      // myPublicMethod(); This would compile an error
  
      Main myObj = new Main(); // Create an object of Main
      myObj.myPublicMethod(); // Call the public method on the object
    }
  }
