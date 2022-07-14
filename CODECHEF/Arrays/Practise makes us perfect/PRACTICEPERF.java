import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    static class FastReader 
    {
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
        FastReader sc=new FastReader();
        int a[]=new int[4];int c=0;
        int i;
        for (i=0;i<4;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>=10)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
    
}
  