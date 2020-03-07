import java.net.*;
import java.io.*;
public class client
{
	public static void main(String[] args) {
		try{
		Socket s=new Socket("192.168.2.28",2222);
		System.out.println("connection with server established");
		DataInputStream i =new DataInputStream(s.getInputStream());
		DataOutputStream o = new DataOutputStream(s.getOutputStream());
		Scanner scn =new Scanner(System.in);
		String str="sample";
		while(true)
		{
			str=scn.nextLine();
			if(str.equals("stop"))
				break;
			o.writeUTF(str);
			str=i.readUTF();
			System.out.println("SERVER SAYS : " ,str);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		i.flush();
		o.flush();
		i.close();
		o.close();
		s.close();


	}
}