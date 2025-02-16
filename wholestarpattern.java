package loops;
import java.util.*;

public class wholestarpattern {
    public static void main(String[] args){
        // printing start pattern of rectangle with whole space

        //Scanner class to get value from user
        Scanner st=new Scanner(System.in);
        System.out.println("Enter the value of n for row, m fro colomn");
        int n=st.nextInt();
        int m=st.nextInt();

        // for loop to print pattern 
        for(int i=1; i<=n; i++){  // i for outer loop, for rows 
            for(int j=1; j<=m;j++){ // for inner loop, for colomn 
                if(i == 1 || j == 1 || i == n || j == m ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } st.close();
    }
}
