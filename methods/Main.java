import java.util.EnumSet;

import jdk.internal.icu.impl.Punycode;

//package methods;
// public class Main{
//     static void myMethod(){
//         System.out.println("Just got executed in a code!");
//     }
//     public static void main(String[] args) {
//         myMethod();
//     }
// }


// public class Main{
//     static void myName(String fName){
//     System.out.println(fName + " Oyewo");
//     }

//     public static void main(String[] args) {
//         myName("Tunde");
//     }
// }

// public class Main{
//     static void nameAge(String fName, int age){
//     System.out.print(fName + " is " + age + " years old");
//     }

//     public static void main(String[] args) {
//         nameAge("Tunde", 44);
//     }
// }


// public class Main{
//     static int sumNum(int x, int y){
//         return  x + y;
//     }

//     public static void main(String[] args) {
//         System.out.println(sumNum(10, 15));
        
//     }
// }

// public class Main{
//     static void checkFood(String food){

//         if(food == "Rice"){
//             System.out.println("Will eat rice for dinner");
//         }else{
//             System.out.println("Will drink coffe");
//         }
//     }

//     public static void main(String[] args) {
//         checkFood("Rice");
//     }


// }



public class Main {
    public static void main(String[] args) {
      int result = sum(10);
      System.out.println(result);
    }
    public static int sum(int k) {
      if (k > 0) {
        return k + sum(k - 1);
      } else {
        return 0;
      }
    }
  }