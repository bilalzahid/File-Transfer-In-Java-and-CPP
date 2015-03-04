
import java.util.Scanner;

public class tests {
	public static void main(String args[]) throws Exception
    {
    	System.out.println("please enter port: ");
    	Scanner in = new Scanner(System.in); 
    	int port = in.nextInt();
    	
    	FTPClient f = new FTPClient(port); // port checking
    	
    }
}
