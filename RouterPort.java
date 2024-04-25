public final class RouterPort { //d.v its final, cannot be inherited
    private int portNumber; //d.i
    private String ipAddress; //d.ii

    public RouterPort(int portNumber) {
        this.portNumber = portNumber;
    }

    public void setIpAddress(String ip) {
        this.ipAddress = ip;
    }

    public void sendData(String sourceIP, String destinationIP, Data data, Computer computer) { //d.iii changed to Data type according to prof's email
        System.out.println("Sending data from " + sourceIP + " to " + destinationIP + " on port " + portNumber); //still d.iii
        computer.receiveData(data, sourceIP); //e.iv
    }
}
