import java.util.*;
public class PalindromeChecker {
    public static boolean isPalindrome(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] array1 = new int[n];
        sc.close();
        for(int i=0;i<n;i++)
        {
            array1[i]=sc.nextInt();
        }
        System.out.println("Array 1 is a palindrome: " + isPalindrome(array1));
    }
}
