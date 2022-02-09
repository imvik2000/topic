import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jh {
    
  
        // Function to return the modified string
        static String extractInt(String str)
        {
            // Replacing every non-digit number
            // with a space(" ")
            str = str.replaceAll("[^\\d]", " ");
      
            // Remove extra spaces from the beginning
            // and the ending of the string
            str = str.trim();
      
            // Replace all the consecutive white
            // spaces with a single space
            str = str.replaceAll(" +", " ");
      
            if (str.equals(""))
                return "-1";
      
            return str;
        }
      
        // Driver code
        public static void main(String[] args) throws IOException
        {
            BufferedReader bi = new BufferedReader(
            new InputStreamReader(System.in));
            String str =bi.readLine();
            String str2=extractInt(str);
            System.out.println(str2);
            String[] splitArray =str2.split(" ");
            int[] array = new int[splitArray.length];

            for (int i = 0; i < splitArray.length; i++) 
            {
                array[i] = Integer.parseInt(splitArray[i]);
            }
            for (int i = 0; i < splitArray.length; i++) 
            {
                System.out.println(array[i]);
            }

        }
    }
    

