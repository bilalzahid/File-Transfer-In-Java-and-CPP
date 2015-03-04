
import java.net.*;
import java.io.*;
import java.util.*;

public class FTPServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ServerSocket soc=new ServerSocket(55555);
        System.out.println("FTP Server Started on Port Number 55555");
        while(true)
        {
            System.out.println("Waiting for Connection ...");
            transferfile t=new transferfile(soc.accept());
        }
    }
}

