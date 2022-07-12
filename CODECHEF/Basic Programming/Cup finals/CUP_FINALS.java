import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static void main(String args[])throws InstantiationException{
        try{
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[][]=new int[n][3];
            int i,j;
            for(i=0;i<n;i++)
            {
                for(j=0;j<3;j++)
                {
                    a[i][j]=sc.nextInt();
                }
                System.out.println();
            }
            for(i=0;i<n;i++)
            {
                int b=(int)Math.abs(a[i][0]-a[i][1]);
                if(b<=a[i][2])
                {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                
            }
        }catch(Exception e)
        {
            return;
        }
    }
}