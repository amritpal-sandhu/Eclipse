package loops;

public class patterrightangel {
    public static void main(String[] args) {

        // printing right angled star 
         for(int i=1;i<=4;i++){
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }System.out.println(" ");
        } 

        // inverted half Pyramid
           for(int k=1;k<=5;k++){ 
               for (int l=5;l>=k;l--) {         // changed inner loop 
                   System.out.print("*");
               }System.out.println(" ");
           } 

            //  for(int k=4;k>=1;k--){             // here outer.
            //     for (int l=1;l<=k;l++) {
            //         System.out.print("*");
            //     }System.out.println(" ");
            // } 
             
            // with space
            int n = 4;
            
             for ( int i=1; i<=n;i++ ) {
                // for space
                for (int j=1;j<=n-i;j++) {
                    System.out.print(" "); 
                }
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                }
                System.out.println();
            
            }  System.out.println();

            for ( int i=1; i<=n;i++ ) {
                // for space
                for (int j=1;j<=n-i;j++) {
                    System.out.print("*"); 
                }
                    for(int j=1;j<=i;j++){
                        System.out.print(" ");
                }
                System.out.println();
            
            }  
         }
    
     }