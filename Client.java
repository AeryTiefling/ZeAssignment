public class Client {
    public static void main(String[] args) {
        Router router = new Router(); //creates a router

        //creates 2 RouterPorts 
        RouterPort port1 = new RouterPort(1);
        RouterPort port2 = new RouterPort(2);

        //Setting some addresses on the ports
        port1.setIpAddress("192.168.1.2");
        port2.setIpAddress("192.168.3.4");

        //adding the addresses and ports to the Router's Map 
        router.addRoute("192.168.1.2", port1);
        router.addRoute("192.168.3.4", port2)

        //creating some data
        Data data = new Data("Dicks and balls");

        //creating a new computer 
        Computer computer = new Computer("ZeComputerModel 5000", "420.420.69.69");

        //doing stuff. Ip doesnt exist in table
        computer.sendData(data, "192.168.7.7", router);

        //doing stuff. Ip exists
        computer.sendData(data, "192.168.3.4", router);


    }
}
