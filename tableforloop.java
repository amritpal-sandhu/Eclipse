package loops;
import java.util.*;

public class tableforloop {
    public static void main(String[] args) {
        // print table of two
        Scanner sc = new Scanner(System.in);
        System.out.println("Which number's table you need");
        int table =sc.nextInt();
        
        int i;
        for( i=1;i <= 10;i++){
            System.out.println("2"+"*"+i+"="+table*i);
        }
    }
    
}
