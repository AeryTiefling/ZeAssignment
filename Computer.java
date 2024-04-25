public class Computer extends Device { //e.i extends Device
    private String IPAddress; //e.ii

    public Computer(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public void sendData(Data data, String destinationIP, Router router) { //e.iii
        System.out.println("Sending data [" + data.getData + "] from device " + IPAddress + " to device with IP " + destinationIP); //notice we use the data.getData method to pass it as String
        router.routeData(IPAddress, destinationIP, data);
    }

    public void receiveData(Data data, String sourceIP) { //e.iv
        System.out.println("Received data [" + data + "] from device with IP address " + sourceIP);
    }
}
