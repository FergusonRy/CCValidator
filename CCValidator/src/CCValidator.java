import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CCValidator
	{

		public static void main(String[] args) throws FileNotFoundException
			{
				Scanner file= new Scanner( new File( "creditCardNumbers.txt" ) );
			      while(file.hasNext())
			      {
			    	long key= file.nextLong();
			      	System.out.println(key);
			      }

			}

	}
