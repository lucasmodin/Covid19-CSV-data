import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class FileHandler {

    private final File file = new File("11_noegletal_pr_region_pr_aldersgruppe.csv");

        public ArrayList<Covid19Data> loadAllData() {
            ArrayList<Covid19Data> data = new ArrayList();
            Scanner sc = null;
            try {
                sc = new Scanner(file);
                sc.nextLine();  // Skip første linje

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            Covid19Data result = null;
            while (sc.hasNext()) {
                String line = sc.nextLine();    // Split linje og læg tokens i attributter
                String[] attributes = line.split(";");
                result = new Covid19Data(
                        attributes[0], // Region
                        attributes[1], //Aldersgruppe
                        (Integer.parseInt(attributes[2])), // antal bekræftede tilfælde i alt (vi parser int)
                        (Integer.parseInt(attributes[3])), //døde
                        (Integer.parseInt(attributes[4])), //indlagte på intensiv
                        (Integer.parseInt(attributes[5])), //indlagte
                        attributes[6] //dato
                );

                data.add(result);

            }
            sc.close();
            return data;
        }

    }

