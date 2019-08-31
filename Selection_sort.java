import java.util.*;
public class Selection_sort
{
    static int[] Selection(int[] a){
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min])
                 min=j;
            }
            //swapping
            a[i]=(a[i]+a[min])-(a[min]=a[i]);
        }return a;
    }
	public static void main(String[] args) {
		//Getting user input
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
		System.out.println(Arrays.toString(Selection(arr)));
	}
}
