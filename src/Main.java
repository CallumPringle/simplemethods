import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
    public static int globalvar = 5; //can be accessed anywhere
    *//*a subroutine is a named out of line block of code that may be called by writing its name in a program statement, we call them methods in java*//*
    public static int getIntInput() { //method definition
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
        *//*int localvar = 5; /*can only be accessed in its scope, its a good idea to use local variables when possible as it reduces memory usage,
        keeps subroutines self-contained, able to test or debug subroutines independently,
        *//*
    }
    public static int getRandom(int min, int max){
        Random random = new Random();
        return random.nextInt(((max - min)+1)+min);
    }
    public static void main(String[] args) {
        System.out.println("type in a min and a max number");
        System.out.println(getRandom(getIntInput(),getIntInput()));

    }
}*/
   public static int animals(int chickens, int cows,int pigs){
       int totallegs = (chickens*2)+(cows*4)+(pigs*4);
       return totallegs;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of chickens");
        int balls = sc.nextInt();
        System.out.println("enter the number of cows");
        int balls2 = sc.nextInt();
        System.out.println("enter the number of pigs");
        int balls3 = sc.nextInt();
        System.out.println("the total number of legs is: " + animals(balls,balls2,balls3));
    }
}