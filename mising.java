import java.util.*;
class missing{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int a=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            a+=arr[i];
        }
        int res=((n+1)*(n+2))/2;
        System.out.println(res-a);
    }
}