import java.util.Scanner;
//program to check entered number/string is pallindrome or not
public class pallindrome {
    public static void main(String[] args){
        String original,reverse="";
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string/number");
        original=s.nextLine();
        int length =original.length();
        for(int i=length-1;i>=0;i--){
            reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse))
            System.out.println("pallindrome");
        else
            System.out.println("not pallindrome");
        }

    }
