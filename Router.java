import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Router extends Device implements Gateway { //c.i and c.ii
    private List<RouterPort> ports = new ArrayList<>(); //c.iii
    private Map<String, RouterPort> ipToPortMap = new HashMap<>(); //c.iv our routing table, basically.

    public void addRoute(String ip, RouterPort port) { //c.iv adds to the array and to the map
        ports.add(port);
        ipToPortMap.put(ip, port);
    }

    @Override
    public void routeData(String sourceIP, String destinationIP, String destinationPort, Data data) {

        if(validateIP(sourceIP)&& validateIP(destinationIP)){ //only runs if both ips are valid according to c.vi
            System.out.println("Routing data between " + sourceIP + " and " + destinationIP + " on port " + destinationPort); //c.ii - dunno how we are supposed to print the destination port wihtout adding it in b.i
        
        
            if (ipToPortMap.containsKey(destinationIP)) { //gonna do an if for the possibility that there's no route for the ip on our Map
                RouterPort port = ipToPortMap.get(destinationIP); //c.v selecting the port based on the ip provided
                port.sendData(sourceIP, destinationIP, data.dataText); //c.ii calling the sendData from a port. also d.iv
            } else {
                System.out.println("No route found for IP: " + destinationIP); // if there's no port with the ip provided
            }
        }
    }    

        

    private static boolean validateIP(String ip) { //c.vi Using Regex to check if its 4 digits seperated by a dot. I hate regex and asked chatgpt for this
        return ip.matches("^([0-9]{1,3}\\.){3}[0-9]{1,3}$");
    }
}
