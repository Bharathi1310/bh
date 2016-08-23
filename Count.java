
import java.util.Scanner;
public class Count {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		String num=String.valueOf(num1);
	     char temp;
	    String sum="";
	   char ch[]=num.toCharArray();
		for(int i=0;i<num.length();i++){
	     for(int j=i+1;i<num.length();i++){
		 if(ch[i]<ch[j]){
		sum=sum+ch[i];}
		}
			
        System.out.println(sum);
	       
}
}}
