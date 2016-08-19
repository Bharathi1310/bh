import java.util.Scanner;
public class Target {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the integer : ");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the target number : ");
    int n1=sc.nextInt();
    for(int i=0;i<n;i++){
	  a[i]=sc.nextInt();
     }
    for(int i=0;i<n-1;i++){
	 for(int j=i+1;j<n;i++){
	if(a[i]+a[j]==n1){
	 System.out.println(a[i]+a[j]);
		   
	   }
		   
   }

	}
	}
}
