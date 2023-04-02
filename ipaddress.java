import java.net.InetAddress;
import java.net.UnknownHostException;

public class ipaddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.facebook.com");
        System.out.println(address);

        InetAddress SW[] = InetAddress.getAllByName("www.google.com");
        for (int i = 0; i < SW.length; i++) {
            System.out.println(SW[i]);
        }
        System.out.println(address.equals(SW[0]));
        System.out.println(address.getAddress());
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
        System.out.println(address.isMulticastAddress());
        System.out.println(address.toString());
    }
}
