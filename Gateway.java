public interface Gateway {
    void routeData(String sourceIP, String destinationIP, String destinationPort, Data data); //b.1 I added the DestinationPort here because of c.ii
}
