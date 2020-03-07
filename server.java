import java.io.*;
import java.net.*;
import java.util.*;
public class server
{
	public static void main(String[] args) {
		try{
		ServerSocket ss=new ServerSocket(2222);
		Socket  s=ss.accept();
		DataInputStream i =new DataInputStream(s.getInputStream());
		DataOutputStream o =new DataOutputStream(s.getOutputStream());
		Scanner scn =new Scanner(System.in);
		String str="sample";
		while(true)
		{	str=i.readUTF();
			if (str.equals("stop")) 
				break;
			System.out.println("CLIENT SAYS : ",Str);
			
			str=scn.nextLine();
			o.writeUTF(str);
			

		}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

		ss.close();
		i.close();
		o.close();



	}
} 