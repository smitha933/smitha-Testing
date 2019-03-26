
import java.util.*;
public class digits2numbers
{
	 public void d2w(int m,String ch)
	  {
	    String  one[]={" "," one"," two"," three"," four"," five"," six"," seven"," eight"," Nine"," ten"," eleven"," twelve"," thirteen"," fourteen","fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};
	 
	    String ten[]={" "," "," twenty"," thirty"," forty"," fifty"," sixty","seventy"," eighty"," ninety"};
	 
	    if(m > 19) 
	    { System.out.print(ten[m/10]+" "+one[m%10]);}
	    else { System.out.print(one[m]);}
	    if(m > 0)System.out.print(ch);
	  }
	 
	  public static void main(String[] args)
	  {
	    int n=0;
	    Scanner scan = new Scanner(System.in);
		 
		//Decide the number of words
		System.out.print("Enter how many digits conversion to words: ");
		 n = Integer.parseInt(scan.nextLine());   // 1  output 5
 
		//Create a string array to store the digits
	
		String arrayOfwords[] = new String[n];   //2
		for (int i = 0; i < arrayOfwords.length; i++) {
			System.out.print("Enter the digit " + (i+1) + " : ");
		        arrayOfwords[i] = scan.nextLine();  //first entered output
		}
		  
		//Now show your digits display one by one          //3
		for (int i = 0; i < arrayOfwords.length; i++) {
			System.out.print("Display digit on console " + (i+1) + " : ");
		        System.out.print(arrayOfwords[i] + "\n");
		}
		
	    
	    if(n <= 0)   {                
	      System.out.println("Enter numbers greater than 0");
	   }

	   else
	   
	   {
	      digits2numbers a = new digits2numbers();
	      for(int i = 0; i < arrayOfwords.length; i++) {
	     a.d2w(((Integer.parseInt(arrayOfwords[i])/1000))," thousand");
	      a.d2w(((Integer.parseInt(arrayOfwords[i])/100))," hundred");
	      a.d2w(((Integer.parseInt(arrayOfwords[i])%100))," ");
	      }
	    }
	  }
	}