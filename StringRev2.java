# StringRev2
import java.io.*;
import java.util.*;
public class StringRev2{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    String n=br.readLine(); 
    String str[] = n.split(" ");
    String finalStr="";
    for(int i = str.length-1; i>= 0 ;i--){
      finalStr += str[i]+" ";
    }
    System.out.println(finalStr);
  }
}
