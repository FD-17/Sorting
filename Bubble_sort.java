import java.util.*;
public class Bubble_sort
{
    static int[] Bubble(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1])
                a[j+1]=(a[j+1]+a[j])-(a[j]=a[j+1]);
            }
        }return a;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
		System.out.println(Arrays.toString(Bubble(arr)));
	}
}
