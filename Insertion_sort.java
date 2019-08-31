import java.util.*;
public class Insertion_sort
{
    static int[] Insertion(int[] a){
        for(int i=1;i<a.length;i++){
            int key=a[i],j=i-1;
            //shifting the index if it is greater than key
            while(j>=0 && a[j]>key){
            a[j+1]=a[j];
            j--;
            }
            //Insertion
            a[j+1]=key;
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
		System.out.println(Arrays.toString(Insertion(arr)));
	}
}
