import java.util.Scanner;
public class matchsticks {
    public static int houses(int hoses){
        if(hoses == 0){
            return 0;
        }
        return ((hoses*5)+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many houses do you want");
        int numberOfMatches = houses(sc.nextInt());
        System.out.println("the number of matches is: " + numberOfMatches);
    }
}
