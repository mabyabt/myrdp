import java.net.*;
import java.io.*;
import java.util.*;
import java.net.InetAddress;
 
public class GetIp
{
    public static void main(String args[]) throws Exception
    {
        // Returns the instance of InetAddress containing
        // local host name and address
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println("System IP Address : " +
                      (localhost.getHostAddress()).trim());
 
        // Find public IP address
        String systemipaddress = "";
        String urlString = "http://checkip.amazonaws.com/";
URL url = new URL(urlString);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
        systemipaddress = br.readLine();
            }
    System.out.println("public ip: "+ systemipaddress);
        }
}