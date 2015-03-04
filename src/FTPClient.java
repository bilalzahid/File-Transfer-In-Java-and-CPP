
import java.net.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;

class FTPClient
{
	public FTPClient(int port) throws Exception{

		while(true){
			if (port == 55555){
				//System.out.println("java server port");
				Socket soc=new Socket("127.0.0.1",port);
	        	transferfileClient t=new transferfileClient(soc);
	        	t.displayMenu();
	        	break;
			}
	        else{
	        	System.out.println("please enter correct port i.e. 55555 ");
	        	Scanner in = new Scanner(System.in); 
	        	port = in.nextInt();
	        }
		}
	}
		
    
}
