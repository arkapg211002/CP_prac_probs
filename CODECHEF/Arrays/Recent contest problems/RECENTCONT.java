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
        int a[][]=new int[n][2];
        int i;
        for(i=0;i<n;i++)
        {
            a[i][0]=0;a[i][1]=0;
            int p=sc.nextInt();
            while(p>0)
            {
                String s=sc.next();
                if(s.compareTo("START38")==0)a[i][0]+=1;
                if(s.compareTo("LTIME108")==0)a[i][1]+=1;
                p--;
            }
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i][0]+" "+a[i][1]);
        }
    }
}