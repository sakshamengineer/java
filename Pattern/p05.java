// inverted half pyramid
/* public class p05 {
    public static void main(String[] args) {
        int a = 5;
        for(int i = 1;i<=a;i++){
            System.out.println(" ".repeat(a-i)+"*".repeat(i));
        } 
    }
} */
public class p05 {
    public static void main(String[] args) {
        int a = 5;
        for(int i= 1; i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }                                           //using nested loop
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}