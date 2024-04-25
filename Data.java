public class Data {
    public String dataText; //f.i

    public Data(String dataText) {
        this.dataText = dataText;
    }

    public String getData(){ //we need this getter to extract the String to be used in the prints.
        return this.dataText; 
    }
}
