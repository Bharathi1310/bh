import java.util.Scanner;
public class Ascii {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter the character");
    String s=in.next();
     for(int i=0;i<s.length();i++){
	   int b=s.charAt(i);
	   System.out.print(b);
    }}}
