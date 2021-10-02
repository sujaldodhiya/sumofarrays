import java.io.*;
class SumOfTwoArrays
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter array size : ");
        int n=Integer.parseInt(br.readLine());

        int a[] = new int[n];
        int b[] = new int[n];
        
        int c[] = new int[n];

        for(int i=0;i<=n;i++)
        {
            System.out.println("Enter element for a at "+i+" : ");
            a[i] = Integer.parseInt(br.readLine());

            System.out.println("Enter element for b at "+i+" : ");
            b[i] = Integer.parseInt(br.readLine());
            
            c[i] = a[i] + b[i];
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.println(c[i]);
        }
    }
}
