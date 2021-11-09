import java.util.Scanner;

public class mirroros {
    public static int maxMirror(int[] nums) {
        int[] reverse = null;
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int k = 0; k < nums.length; k++) {
                if(i > k) {
                } else {
                    reverse = reverseSection(nums, i, k);
                    if(searchFor(reverse, nums)) {
                        if(reverse.length > max) { max = reverse.length; }
                    }
                }
            }
        }

        return max;
    }

    public static int[] reverseSection(int[] nums, int begin, int end) {
        int[] nArray = new int[end - begin + 1];
        int numbs = end - begin;
        for(int i = begin; i <= end; i++) {
            nArray[numbs] = nums[i];
            numbs--;
        }
        return nArray;
    }

    public static boolean searchFor(int[] reverse, int[] nums) {
        int index = 0;
        boolean check = false;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == reverse[index]) {
                index++;

                if(index >= reverse.length) {
                    return true;
                }
            } else {
                index = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type in your array");
        String sex = sc.next();
        int[] ting = new int[sex.length()];
        String[] newSex = sex.split("");
        for(int i = 0;i < newSex.length;i++)
        {
            // Note that this is assuming valid input
            // If you want to check then add a try/catch
            // and another index for the numbers if to continue adding the others (see below)
            ting[i] = Integer.parseInt(newSex[i]);
        }
        System.out.println(maxMirror(ting));




    }
}
