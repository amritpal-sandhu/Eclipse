package loops.homework;
import java.util.*;

public class q1evennofor {
    public static void main(String[] args){
        //print all even number till n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. to verfy whether it is even no or not");
        int num=sc.nextInt();
    
         if(num == 0 || num ==1){
            System.err.println("not valid"); }
        else if(num%2 == 0 ){
            System.err.println(" valid");
        }else {
            System.out.println("its odd");
        }
        sc.close();
      }
   
    }
    