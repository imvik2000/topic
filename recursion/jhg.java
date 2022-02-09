import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class jhg
{
    public static void main(String args[]) throws NumberFormatException, IOException
     {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
		int m = Integer.parseInt(reader.readLine());
		int[][] arr = new int[m][];
		
		for(int i = 0;i<m;i++){
		    String[] st = reader.readLine().trim().split(",");
		    int[] t = new int[st.length];
		    for(int j=0;j<t.length;j++){
		        t[j] = Integer.parseInt(st[j]);
		    }
		    arr[i] = t;
		}
        for (int i=0;i<m;i++)
        {
           for(int j=0;j<arr[i].length;j++)
             {
             System.out.print(arr[i][j]);
             }
        
            }
        
        }
}