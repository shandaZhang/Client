import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		//Socket socket = new Socket("192.168.31.161", 30000);
		Socket socket = new Socket(InetAddress.getLocalHost(),30000);
		BufferedReader br = null;
		try{
		PrintStream ps = new PrintStream(socket.getOutputStream());
		ps.println("bb乐我来了");
		System.out.println("发过了");
		
		br = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));
		String line = br.readLine();
		System.out.println("服务器返回： "+line);
		}catch(Exception e){
			System.out.println("e: "+e);
			
		}finally{
			//br.close();
			//socket.close();
			
		}
	}

}
