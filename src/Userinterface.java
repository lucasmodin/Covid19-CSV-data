import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Userinterface {
    Scanner input = new Scanner(System.in);
    FileHandler fh = new FileHandler();
    ArrayList<Covid19Data> dataSet = fh.loadAllData();

    public void menu() {
        int userInput = 0;
        final int SENTINEL = -1;

        while(userInput != SENTINEL) {
            menuConstants();
            userInput = input.nextInt();
            switch (userInput) {
                case 1:
                    unsorted();
                    break;

                case 2:
                    sortAfterRegion();
                    break;

                case 3:
                    sortAfterAgeGroup();
                    break;

                default:
                    System.out.println("Invalid input - please choose a valid option!");
                    break;

            }
        }

    }

    public void unsorted() {

        for(Covid19Data data : dataSet) {
            System.out.println(data);
        }

    }

    public void sortAfterRegion() {

        Collections.sort(dataSet, new RegionComparator());
        System.out.println("Sorteret efter region");
        for(Covid19Data data : dataSet) {
            System.out.println(data);
        }

    }

    public void sortAfterAgeGroup() {

        Collections.sort(dataSet, new AldersGruppeComparator());
        System.out.println("Sorteret efter aldersgruppe");
        for(Covid19Data data : dataSet) {
            System.out.println(data);
        }
    }

public void menuConstants() {
    System.out.println("Covid19 - data");
    System.out.println("Please choose an option: ");
    System.out.println("" +
            "\n 1. Show unsorted data" +
            "\n 2. Sort data after Region " +
            "\n 3. Sort data after age-group ");
}




}


