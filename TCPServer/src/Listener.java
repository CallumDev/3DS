import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Listener {
	
	public Listener(){
		try {
	        Boolean end = false;
	        ServerSocket ss = new ServerSocket(12390);
	        while(!end){
	                //Server is waiting for client here, if needed
	                Socket s = ss.accept();
	                BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
	                String st = input.readLine();
	                System.out.println(st);
	                s.close();
	        }
			ss.close();
			            
			} catch (UnknownHostException e) {
			        // TODO Auto-generated catch block
			        e.printStackTrace();
			} catch (IOException e) {
			        // TODO Auto-generated catch block
			        e.printStackTrace();
			}
		}
	
	public static void main(String[] args){
		new Listener();
	}
}
