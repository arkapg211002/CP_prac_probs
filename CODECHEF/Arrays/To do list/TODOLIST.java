import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String args[])
    {
        FastReader sc =new FastReader();
        int n=sc.nextInt();
        if(n<1 || n>1000){return;}
        int a[]=new int[n],c;
        int i,p=0;
        for(i=0;i<n;i++)
        {
            c=0;
            p=sc.nextInt();
            if(p<1 || p>1000){return ;}
            while(p>0)
            {
                int j=sc.nextInt();
                if(j<1 || j>5000)
                {return;}
                if(j>=1000)
                {
                    c+=1;
                }
                p--;
            }
            a[i]=c;
            
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        
    }
  
}