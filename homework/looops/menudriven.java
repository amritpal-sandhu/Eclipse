package loops.homework.looops;
import java.util.*;

public class menudriven {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         int choice ;

         do { 
             System.out.println("Chose number 1, 0 to exit");
             choice =sc.nextInt();
                
               if (choice == 1){
                 System.out.println("Enter your percent");
                  int mark = sc.nextInt();
                  
                  if(mark >= 90 && mark <= 100){
                    System.out.println("This is Good");
                } else if (mark >= 60 && mark <= 89) {
                    System.out.println("This is also Good");
                } else if (mark >= 0 && mark <= 59) {
                    System.out.println("This is Good as well");
                  }else {
                    System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                }
            }else if (choice != 0) {
                System.out.println("Invalid choice! Please enter 1 or 0."); 
            }    } while (choice != 0);
   sc.close();
}
}