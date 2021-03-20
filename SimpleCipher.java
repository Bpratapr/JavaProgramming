import java.util.*;
public class SimpleCipher
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System. in);
		int n = scan.nextInt();
		scan.nextLine();
		String encr = scan.nextLine();
		int length = encr.length();
  for(int i=0; i<length;i++)
  {
      char c = encr.charAt(i);
      char decr;
      int ascii = (int)c;
      if(ascii >=65 && ascii <=90)
      {
          int asci = ascii -n;
          
          if(asci < 65)
          {
              int a = ascii + 26; 
              int b = a - n;
              decr = (char)asci;
          }
          else
          {
              decr = (char)asci;
          }
          
      } 
      else if(ascii >=97 && ascii <=122)
      {
          int asci = ascii -n;
          
          if(asci < 97)
          {
              int a = ascii + 26; 
               int b = a - n;
              decr = (char)b;
          }
          else
          {
              decr = (char)asci;
          }
      }
      else
      {
         ascii = ascii;
         decr = (char)ascii;
      }
      System.out.print(decr);
  }
	}
}