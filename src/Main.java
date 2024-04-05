import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FileHandler fh = new FileHandler();
        ArrayList<Covid19Data> dataSet = fh.loadAllData();

        for(Covid19Data data : dataSet) {
            System.out.println(data);
        }
    }
}
